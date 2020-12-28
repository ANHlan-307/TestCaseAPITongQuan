package com.company;

public class TestCaseSearch {
    public static void Unittest1(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        String keyword = "a";
        String user_id = reslog.data.id;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 1: Search succes");
        ResponseSearch res = callAPI.callAPISearch(token, keyword, user_id, index, count, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }


    public static void Unittest2(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = "";
        String keyword = "a";
        String user_id = reslog.data.id;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 2: Token incorrect");
        ResponseSearch res = callAPI.callAPISearch(token, keyword, user_id, index, count, link);
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
        String keyword = "`";
        String user_id = reslog.data.id;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 3: Cant't find data you are looking for");
        ResponseSearch res = callAPI.callAPISearch(token, keyword, user_id, index, count, link);
        if (!(res.code.equals("9994"))) throw new AssertionError("wrong code");
        if (!(res.message.equals("No Data or end of list data"))) throw new AssertionError("wrong message");
        System.out.println("Finished!");
    }

    public static void Unittest4(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        String keyword = "a";
        String user_id = reslog.data.id;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 4: User was blocked");
        ResponseSearch res = callAPI.callAPISearch(token, keyword, user_id, index, count, link);
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
        String keyword = "a";
        String user_id = "";
        int index = 4;
        int count = 2;

        System.out.println("Test Case 5: User id incorrect");
        ResponseSearch res = callAPI.callAPISearch(token, keyword, user_id, index, count, link);
        System.out.println("incorrect user id");
        if (!(res.code.equals("1004"))) throw new AssertionError();
        if (!(res.message.equals("Parameter value is invalid"))) throw new AssertionError();
        System.out.println("Finished!\n");
    }

    public static void Unittest6(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        String keyword = "";
        String user_id = reslog.data.id;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 6: Not have keyword");
        ResponseSearch res = callAPI.callAPISearch(token, keyword, user_id, index, count, link);
        if(!("1003".equals(res.code)) && !("1004".equals(res.code)) && !("1000".equals(res.code)))throw new AssertionError("wrong code");
        if (("Parameter type is invalid".equals(res.message)) && !("Parameter value is invalid".equals(res.message)) && !("OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }

    public static void Unittest7(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        String keyword = "a";
        String user_id = reslog.data.id;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 7: Author id response erroi");
        ResponseSearch res = callAPI.callAPISearch(token, keyword, user_id, index, count, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }

    public static void Unittest8(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        String keyword = "a";
        String user_id = reslog.data.id;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 8: Image, video response erroi");
        ResponseSearch res = callAPI.callAPISearch(token, keyword, user_id, index, count, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }

    public static void Unittest9(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        String keyword = "a";
        String user_id = reslog.data.id;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 9: describe and image/video response erroi");
        ResponseSearch res = callAPI.callAPISearch(token, keyword, user_id, index, count, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }

    public static void Unittest10(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        String keyword = "a";
        String user_id = reslog.data.id;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 10: CEN erroi");
        ResponseSearch res = callAPI.callAPISearch(token, keyword, user_id, index, count, link);
        if (!(res.code.equals("1011"))) throw new AssertionError("wrong code");
        if (!(res.message.equals("Could not publish this post"))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }

    public static void Unittest11(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        String keyword = "a";
        String user_id = reslog.data.id;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 11: Internet disconnect");
        ResponseSearch res = callAPI.callAPISearch(token, keyword, user_id, index, count, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }

    public static void Unittest12(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        String keyword = "a";
        String user_id = reslog.data.id;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 12: Correct all paragram");
        ResponseSearch res = callAPI.callAPISearch(token, keyword, user_id, index, count, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }

    public static void Unittest13(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        String keyword = "a";
        String user_id = reslog.data.id;
        int index = 4;
        int count = 2;

        System.out.println("Test Case 13: New data");
        ResponseSearch res = callAPI.callAPISearch(token, keyword, user_id, index, count, link);
        if(!("1000".equals(res.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }

    public static void Unittest14(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);

        String token = reslog.data.token;
        String keyword = "a";
        String user_id = reslog.data.id;
        int index = Integer.parseInt(null);
        int count = Integer.parseInt(null);

        System.out.println("Test Case 14: index, count erroi");
        ResponseSearch res = callAPI.callAPISearch(token, keyword, user_id, index, count, link);
        if(!("1003".equals(res.code)) && !("1004".equals(res.code))) throw new AssertionError("wrong code");
        if (("Parameter type is invalid".equals(res.message)) && !("Parameter value is invalid".equals(res.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!\n");
    }
}
