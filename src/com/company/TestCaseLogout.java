package com.company;

//class contains test cases of Log out API
// 4 Test Cases
public class TestCaseLogout {
    public static void Unittest1(String token, String link, String loginlink) throws Exception {
        System.out.println("Test Case 1: Logout success");
        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        token = reslog.data.token;
        Response res = callAPI.callAPILogout(token,link);

        if ((!"1000".equals(res.code))) throw new AssertionError();
        if ((!"OK".equals(res.message))) throw new AssertionError();
        System.out.println("Finished");
    }

    public static void UnitTest2(String token, String link, String loginlink) throws Exception{
        System.out.println("Test case 2: ");
        //Đăng nhập trên máy A
        ResponseLogin resA = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);
        ResponseLogin resB = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid,  loginlink);

        token = resA.data.token;
        Response reslA = callAPI.callAPILogout(token,link);

        if ((!"1004".equals(reslA.code))) throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(reslA.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void UnitTest3(String token, String link, String loginlink) throws Exception{
        System.out.println("Test Case 3: ");
        ResponseLogin resA = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);
        ResponseLogin resB = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid,  loginlink);

        token = resB.data.token;
        Response reslB = callAPI.callAPILogout(token,link);

        token = resA.data.token;
        Response reslA = callAPI.callAPILogout(token,link);

        if ((!"1004".equals(reslA.code))) throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(reslA.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void UnitTest4(String token, String link, String loginlink) throws Exception{
        System.out.println("Test Case 4:  ");
        //Đăng nhập trên máy A
        ResponseLogin resA = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);
        //Đăng nhập trên máy B
        ResponseLogin resB = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid,  loginlink);
        //Đăng xuất trên máy B
        token = resB.data.token;
        Response reslB = callAPI.callAPILogout(token,link);
        if ((!"1000".equals(reslB.code))) throw new AssertionError();
        if ((!"OK".equals(reslB.message))) throw new AssertionError();
        System.out.println("Finished!");
    }

}
