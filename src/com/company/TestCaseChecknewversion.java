package com.company;

public class TestCaseChecknewversion {
    public static void Unittest1(String link, String token) throws Exception{


        System.out.println("Test Case 1: The latest version");

        ResponseCheck_new_version res = callAPI.callAPICNV(token, "1.0", link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
    }

    public static void Unittest2(String link, String token) throws Exception{

        token = "";
        System.out.println("Unit test 2: Token is incorrect");

        ResponseCheck_new_version res = callAPI.callAPICNV(token, "1.0", link);
        if(!("9998".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"Token is invalid".equals(res.message))) throw new AssertionError("wrong message");
    }

    public static void Unittest3(String link, String token) throws Exception{

        System.out.println("Unit test 3: Can not connect to Database ");

        ResponseCheck_new_version res = callAPI.callAPICNV(token, "1.0", link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
    }


    public static void Unittest4(String link, String token) throws Exception{

        System.out.println("Unit test 4: User account was blocked ");

        ResponseCheck_new_version res = callAPI.callAPICNV(token, "1.0", link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
    }

    public static void Unittest5(String link, String token) throws Exception{

        System.out.println("Unit test 5: Last update invalid ");

        ResponseCheck_new_version res = callAPI.callAPICNV(token, "2.0", link);
        if(!("1004".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(res.message))) throw new AssertionError("wrong message");
    }

    public static void Unittest6(String link, String token) throws Exception{

        System.out.println("Unit test 6: Last update invalid");

        ResponseCheck_new_version res = callAPI.callAPICNV(token, "9.0", link);
        if(!("1004".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(res.message))) throw new AssertionError("wrong message");
    }

    public static void Unittest8(String link, String token) throws Exception{

        System.out.println("Unit test 8: Wrong id or active value ");

        ResponseCheck_new_version res = callAPI.callAPICNV(token, "1.0", link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
    }


}
