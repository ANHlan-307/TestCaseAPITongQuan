package com.company;

//class contains test cases of Sign_Up API
//5 Test Cases
public class TestCaseSignUp {
    public static void Unittest1(String phonenumber, String password, String uuid, String url) throws Exception{
        System.out.println("Test case 1: SignUp satisfied ");
        Response res = callAPI.callAPISignUp(phonenumber, password, uuid, url);
        if (!"1000".equals(res.code)) throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");
    }

    public static void Unittest2(String phonenumber, String password, String uuid, String url) throws Exception{
        System.out.println("Test case 2: ");
        Response res = callAPI.callAPISignUp(phonenumber, password, uuid, url);
        if (!"9996".equals(res.code)) throw new AssertionError("wrong code");
        if ((!"User existed".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");
    }

    public static void Unittest3(String phonenumber, String password, String uuid, String url) throws Exception{
        System.out.println("Test case 3: Phonenumber is invalid");
        Response res = callAPI.callAPISignUp(phonenumber, password, uuid, url);
        if ((!"1003".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError("wrong message");

        System.out.println("Finished");

    }

    public static void Unittest4(String phonenumber, String password, String uuid, String url) throws Exception{
        System.out.println("Test case 4: Password is invalid");
        Response res = callAPI.callAPISignUp(phonenumber, password, uuid, url);
        if ((!"1003".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError("wrong messaage");
        System.out.println("Finished");

    }

    public static void Unittest5(String phonenumber, String password, String uuid, String url) throws Exception{
        System.out.println("Unit test 5: ");
        Response res = callAPI.callAPISignUp(phonenumber, password, uuid, url);
        if ((!"1002".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"Parameter is not enough".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");
    }

}
