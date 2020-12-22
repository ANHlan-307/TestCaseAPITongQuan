package com.company;

//class contains Test Cases of Changing Password
//9 Test Cases

public class TestCaseChangePass {
    public static void Unittest1(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String passwd = Input.Login.password;
        String newpass = "thanks389";
        String token = reslog.data.token ;

        System.out.println("Test Case 1: Change Password Satisfied");
        Response res = callAPI.callAPIChangePass(newpass, passwd,token, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n" + "newpass: thanks389");

        Response res1 = callAPI.callAPIChangePass(Input.Login.password, newpass,token, link);
    }

    public static void Unittest2(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String passwd = Input.Login.password;
        String newpass = "thisme307";
        String token = "" ;

        System.out.println("Test Case 2: Token is incorrect");
        Response res = callAPI.callAPIChangePass(newpass, passwd,token, link);
        if (!(res.code.equals("9998")) && !(res.code.equals("1002"))  ) throw new AssertionError("wrong code");
        if ((!"Token is invalid".equals(res.message)) && !(res.message.equals("Parameter is not enough")) ) throw new AssertionError("wrong message");

        ResponseLogin reslog2 = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);
        if (((!reslog2.code.equals("1000")))) throw new AssertionError("wrong code");
        if ((!"OK".equals(reslog2.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void Unittest3(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String passwd = Input.Login.password;
        String newpass = "thanks389";
        String token = reslog.data.token ;

        System.out.println("Test Case 3: Internet disconnected");
        Response res = callAPI.callAPIChangePass(newpass, passwd,token, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n" + "newpass: thanks389");

        Response res1 = callAPI.callAPIChangePass(Input.Login.password, newpass,token, link);
    }

    public static void Unittest4(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String passwd = Input.Login.password;
        String newpass = "thanks389";
        String token = reslog.data.token ;

        System.out.println("Unit test 4: The account is blocked");
        Response res = callAPI.callAPIChangePass(newpass, passwd,token, link);
        if(!("9995".equals(res.code)))throw new AssertionError("wrong code\n" + "tài khoản có thể chưa thực sự bị khoá");
        if ((!"User is not validated".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void Unittest5(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);


        String passwd = Input.Login.password.concat("8");
        String newpass = "thanks389";
        String token = reslog.data.token ;


        System.out.println("Unit test 5: Password is incorrect");
        Response res = callAPI.callAPIChangePass(newpass, passwd,token, link);
        if(!("1003".equals(res.code)) && !("1004".equals(res.code)))throw new AssertionError("wrong code");
        if (("Parameter type is invalid".equals(res.message)) && !("Parameter value is invalid".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void Unittest6(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String passwd = Input.Login.password;
        String newpass = "thanks389";
        String token = reslog.data.token ;

        System.out.println("Unit test 6: Confirm password does not match");
        Response res = callAPI.callAPIChangePass(newpass, passwd,token, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");

        Response res1 = callAPI.callAPIChangePass(Input.Login.password, newpass,token, link);
    }

    public static void Unittest7(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String passwd = Input.Login.password;
        String newpass = Input.Login.password;
        String token = reslog.data.token ;

        System.out.println("Unit test 7: New password is incorrect");
        Response res = callAPI.callAPIChangePass(newpass, passwd,token, link);
        if(!("1003".equals(res.code)) && !("1004".equals(res.code)))throw new AssertionError("wrong code");
        if (("Parameter type is invalid".equals(res.message)) && !("Parameter value is invalid".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void Unittest8(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String passwd = Input.Login.password;
        String newpass = Input.Login.password.concat("1");
        String token = reslog.data.token ;

        System.out.println("Unit test 8: The new password is nearly similar to the old one ");
        Response res = callAPI.callAPIChangePass(newpass, passwd,token, link);
        if(!("1004".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void Unittest9(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String passwd = Input.Login.password;
        String newpass = "thanks389";
        String token = reslog.data.token ;

        System.out.println("Unit test 9: New password the same as password which has been used before");
        Response res = callAPI.callAPIChangePass(newpass, passwd,token, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }
}
