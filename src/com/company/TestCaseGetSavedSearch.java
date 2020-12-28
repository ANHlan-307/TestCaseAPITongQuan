package com.company;

public class TestCaseGetSavedSearch {
    public static void Unittest1(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 1: Get Search succes");
        ResponseGet_Saved_Search res = callAPI.callAPIGetSavedSearch(token, index, count, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }


    public static void Unittest2(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = "";
        int index = 4;
        int count = 2;

        System.out.println("Test Case 2: Token incorrect");
        ResponseGet_Saved_Search res = callAPI.callAPIGetSavedSearch(token, index, count, link);
        if (!(res.code.equals("9998")) && !(res.code.equals("1002"))  ) throw new AssertionError("wrong code");
        if ((!"Token is invalid".equals(res.message)) && !(res.message.equals("Parameter is not enough")) ) throw new AssertionError("wrong message");

        ResponseLogin reslog2 = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);
        if (((!reslog2.code.equals("1000")))) throw new AssertionError("wrong code");
        if ((!"OK".equals(reslog2.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void Unittest3(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 3: Null data");
        ResponseGet_Saved_Search res = callAPI.callAPIGetSavedSearch(token, index, count, link);
        if (!(res.code.equals("9994"))) throw new AssertionError("wrong code");
        if (!(res.message.equals("No Data or end of list data"))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void Unittest4(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 4: User was blocked");
        ResponseGet_Saved_Search res = callAPI.callAPIGetSavedSearch(token, index, count, link);
        if(!("9995".equals(res.code)))throw new AssertionError("wrong code\n" + "tài khoản có thể chưa thực sự bị khoá");
        if ((!"User is not validated".equals(res.message))) throw new AssertionError("wrong message");
        ResponseLogin reslog2 = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);
        if (((!reslog2.code.equals("1000")))) throw new AssertionError("wrong code");
        if ((!"OK".equals(reslog2.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void Unittest5(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 5: Keyword response was not standard string");
        ResponseGet_Saved_Search res = callAPI.callAPIGetSavedSearch(token, index, count, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }
    public static void Unittest6(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 6: Keyword response was sort incorrect");
        ResponseGet_Saved_Search res = callAPI.callAPIGetSavedSearch(token, index, count, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }
    public static void Unittest7(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 7: Invalid data response");
        ResponseGet_Saved_Search res = callAPI.callAPIGetSavedSearch(token, index, count, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }
    public static void Unittest8(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 8: More than 20 result");
        ResponseGet_Saved_Search res = callAPI.callAPIGetSavedSearch(token, index, count, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }

    public static void Unittest9(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 9: More than 20 keyword and have keywords duplicate");
        ResponseGet_Saved_Search res = callAPI.callAPIGetSavedSearch(token, index, count, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }

    public static void Unittest10(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 10: Pull up to load more");
        ResponseGet_Saved_Search res = callAPI.callAPIGetSavedSearch(token, index, count, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }
}
