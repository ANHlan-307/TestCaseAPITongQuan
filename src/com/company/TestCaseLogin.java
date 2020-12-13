package com.company;

//class contains test cases of Login API
//9 Test Cases

public class TestCaseLogin {
    public static void Unittest1(String phonenumber, String password, String uuid, String linkurl) throws Exception{
        System.out.println("Test Case 1: Login success");
        ResponseLogin res = callAPI.callAPILogin(phonenumber, password, uuid, linkurl);
        if ((!"1000".equals(res.code))) throw new AssertionError();
        if ((!"OK".equals(res.message))) throw new AssertionError();
        System.out.println("Finished!");
    }

    public static void Unittest2(String phonenumber, String password, String uuid, String linkurl) throws Exception{
        System.out.println("Test Case 2: Phonenumber does not exist");
        ResponseLogin res = callAPI.callAPILogin(phonenumber, password, uuid, linkurl);
        if ((!"1004".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");
    }

    public static void Unittest3(String phonenumber, String password, String uuid, String linkurl) throws Exception{
        System.out.println("Unit test 3: Invalid Phonenumber");
        ResponseLogin res = callAPI.callAPILogin(phonenumber, password, uuid, linkurl);
        if ((!"1003".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void Unittest4(String phonenumber, String password, String uuid, String linkurl) throws Exception{
        System.out.println("Test Case 4: Invalid password");
        ResponseLogin res = callAPI.callAPILogin(phonenumber, password, uuid, linkurl);
        if ((!"1003".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void Unittest5(String phonenumber, String password, String uuid, String linkurl) throws Exception{
        System.out.println("Unit test 5: Missing field phonenumber and password");
        ResponseLogin res = callAPI.callAPILogin(phonenumber, password, uuid, linkurl);
        if ((!"1002".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"Parameter is not enough".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void Unittest6(String phonenumber, String password, String uuid, String linkurl) throws Exception{
        System.out.println("Test Case 6: No Internet Access");
        ResponseLogin res = callAPI.callAPILogin(phonenumber, password, uuid, linkurl);
        if ((!"1000".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void Unittest7(String phonenumber, String password, String uuid, String linkurl) throws Exception{
        System.out.println("Test Case 7: Invalid password");
        ResponseLogin res = callAPI.callAPILogin(phonenumber, password, uuid, linkurl);
        if ((!"1003".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void Unittest8(String phonenumber, String password, String uuid, String linkurl) throws Exception{
        System.out.println("Test Case 8: Login in 2 computers");

        ResponseLogin res = callAPI.callAPILogin(phonenumber, password, uuid, linkurl);
        if ((!"1000".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");

        ResponseLogin res2 = callAPI.callAPILogin(phonenumber, password, uuid, linkurl);
        if ((!"1000".equals(res2.code))) throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        if(res2.data.token.equals(res.data.token)) throw new AssertionError("wrong thread");
        System.out.println("Finished!");
    }

    public static void Unittest9(String phonenumber, String password, String uuid, String linkurl) throws Exception{
        System.out.println("Test Case 9: Missing field uuid");
        ResponseLogin res = callAPI.callAPILogin(phonenumber, password, uuid, linkurl);
        if ((!"1003".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }
}
