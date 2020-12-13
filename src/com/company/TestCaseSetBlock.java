package com.company;

//Class contains test cases of Set_Block API
//đăng ký 1 tài khoản mới và đăng nhập vào tài khoản đó, id của tài khoản đấy sẽ là id lớn nhất trong hệ thống

public class TestCaseSetBlock {
    public static void Unittest1(String link, String loginlink) throws Exception {
        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);

        Input.Set_Block.nhap();
        String user_id = Input.Set_Block.user_id;
        String type = Input.Set_Block.type;
        String token = reslog.data.token;

        System.out.println("Test Case 1: Set Block success");
        Response resset = callAPI.callAPISet_Block(user_id, type, token, link);
        if (!("1000".equals(resset.code))) throw new AssertionError("wrong code");
        if ((!"OK".equals(resset.message))) throw new AssertionError("wrong message");

        //print "Finished" if the conditions is true
        System.out.println("Satisfied! Finished");

    }

    public static void Unittest2(String link,String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);

        Input.Set_Block.nhap();
        String user_id = Input.Set_Block.user_id;
        String type = Input.Set_Block.type;
        String token = "";

        System.out.println("Test Case 2: Token invalid");
        Response resset = callAPI.callAPISet_Block(user_id, type, token, link);
        if (!("1004".equals(resset.code))) throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(resset.message))) throw new AssertionError("wrong message");


        ResponseLogin reslog1 = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);
        if(!("1000".equals(reslog1.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(reslog1.message))) throw new AssertionError("wrong message");

        //print "Finished" if the conditions is true
        System.out.println("Satisfied! Finished");
    }

    public static void Unittest3(String link,String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);

        Input.Set_Block.nhap();
        String user_id = Input.Set_Block.user_id;
        String type = Input.Set_Block.type;
        String token = reslog.data.token;

        System.out.println("Test Case 3: Internet disconnected");
        Response resset = callAPI.callAPISet_Block(user_id, type, token, link);
        if (!("1000".equals(resset.code))) throw new AssertionError("wrong code");
        if ((!"OK".equals(resset.message))) throw new AssertionError("wrong message");

        //print "Finished" if the conditions is true
        System.out.println("Satisfied! Finished");
    }

    //chưa tìm ra cách test
    public static void Unittest4(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);

        Input.Set_Block.nhap();
        String user_id = Input.Set_Block.user_id;
        String type = Input.Set_Block.type;
        String token = reslog.data.token;

    }

    public static void Unittest5(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);

        Input.Set_Block.nhap();
        String user_id = reslog.data.id;
        String type = Input.Set_Block.type;
        String token = reslog.data.token;

        System.out.println("Test Case 5: User_id invalid");
        Response resset = callAPI.callAPISet_Block(user_id, type, token, link);
        if (!("1003".equals(resset.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(resset.message))) throw new AssertionError("wrong message");

        System.out.println("Satisfied! Finished");

    }

    public static void Unittest6(String link, String loginlink, String signuplink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);
        int id_base = Integer.parseInt(reslog.data.id);


        Input.Set_Block.nhap();
        String user_id = Input.Set_Block.user_id;
        String type = Input.Set_Block.type;
        String token = reslog.data.token;

        System.out.println("Test Case 6: user id not exist");
        Response resset = callAPI.callAPISet_Block(user_id, type, token, link);
        if(Integer.parseInt(user_id) > id_base) {
            if (!("1003".equals(resset.code))) throw new AssertionError("wrong code");
            if ((!"Parameter type is invalid".equals(resset.message))) throw new AssertionError("wrong message");
        } else {
            if (!("1000".equals(resset.code))) throw new AssertionError("wrong code");
            if ((!"OK".equals(resset.message))) throw new AssertionError("wrong message");
        }
        System.out.println("Satisfied! Finished");

    }

}
