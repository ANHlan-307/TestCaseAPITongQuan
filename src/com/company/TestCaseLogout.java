package com.company;

//class contains test cases of Log out API
// 4 Test Cases
public class TestCaseLogout {
    public static void Unittest1( String link, String loginlink) throws Exception {
        System.out.println("Test Case 1: Logout success");
        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);

        String token = reslog.data.token;


        Response res = callAPI.callAPILogout(token,link);

        if ((!"1000".equals(res.code))) throw new AssertionError();
        if ((!"OK".equals(res.message))) throw new AssertionError();
        System.out.println("Finished");
    }

    public static void UnitTest2( String link, String loginlink) throws Exception{
        System.out.println("Test case 2: ");
        //Đăng nhập trên máy A
        ResponseLogin resA = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);
        ResponseLogin resB = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid,  loginlink);

        String token = resA.data.token;

        Response reslA = callAPI.callAPILogout(token,link);

        if ((!"9998".equals(reslA.code)) && (!"1000".equals(reslA.code)) ) throw new AssertionError("wrong code");
        if ((!"Token is invalid".equals(reslA.message)) && (!"OK".equals(reslA.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void UnitTest3( String link, String loginlink) throws Exception{
        System.out.println("Test Case 3: ");
        ResponseLogin resA = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);

        ResponseLogin resB = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid,  loginlink);


        String token = resB.data.token;
        Response reslB = callAPI.callAPILogout(token,link);

        token = resA.data.token;
        Response reslA = callAPI.callAPILogout(token,link);

        if ((!"9998".equals(reslA.code)) && (!"1000".equals(reslA.code)) ) throw new AssertionError("wrong code");
        if ((!"Token is invalid".equals(reslA.message)) && (!"OK".equals(reslA.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void UnitTest4( String link, String loginlink) throws Exception{
        System.out.println("Test Case 4:  ");
        //Đăng nhập trên máy A
        ResponseLogin resA = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);
        //Đăng nhập trên máy B
        ResponseLogin resB = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);        //Đăng xuất trên máy B
        String token = resB.data.token;
        Response reslB = callAPI.callAPILogout(token,link);
        if ((!"1000".equals(reslB.code))) throw new AssertionError();
        if ((!"OK".equals(reslB.message))) throw new AssertionError();
        System.out.println("Finished!");
    }

}
