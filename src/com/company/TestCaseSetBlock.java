package com.company;

//Class contains test cases of Set_Block API
//đăng ký 1 tài khoản mới và đăng nhập vào tài khoản đó, id của tài khoản đấy sẽ là id lớn nhất trong hệ thống
//10 Test Cases

import java.util.Scanner;

public class TestCaseSetBlock {
    public static void Unittest1(String link, String loginlink) throws Exception {
        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);


        String user_id = String.valueOf(Integer.valueOf(reslog.data.id) - 1);
        System.out.println("Khoá tài khoản có user_id là " + user_id);
        String type = "0";
        String token = reslog.data.token;

        System.out.println("Test Case 1: Set Block success");
        Response resset = callAPI.callAPISet_Block(user_id, type, token, link);
        if (!("1000".equals(resset.code))) throw new AssertionError("wrong code");
        if ((!"OK".equals(resset.message))) throw new AssertionError("wrong message");

        //print "Finished" if the conditions is true
        System.out.println("Satisfied! Finished");

        Response resset1 = callAPI.callAPISet_Block(user_id, "1", token, link);


    }

    public static void Unittest2(String link,String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);

        String user_id = String.valueOf(Integer.valueOf(reslog.data.id) - 1);
        String type = "0";
        String token = "20";

        System.out.println("Test Case 2: Token invalid");
        Response resset = callAPI.callAPISet_Block(user_id, type, token, link);
        if (!("9998".equals(resset.code))) throw new AssertionError("wrong code");
        if ((!"Token is invalid".equals(resset.message))) throw new AssertionError("wrong message");


        ResponseLogin reslog1 = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);
        if(!("1000".equals(reslog1.code)))throw new AssertionError("wrong code");
        if ((!"OK".equals(reslog1.message))) throw new AssertionError("wrong message");

        //print "Finished" if the conditions is true
        System.out.println("Satisfied! Finished");
    }

    public static void Unittest3(String link,String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);

        String user_id = String.valueOf(Integer.valueOf(reslog.data.id) - 1);
        String type = "0";
        String token = reslog.data.token;

        System.out.println("Test Case 3: Internet disconnected");
        Response resset = callAPI.callAPISet_Block(user_id, type, token, link);
        if (!("1000".equals(resset.code))) throw new AssertionError("wrong code");
        if ((!"OK".equals(resset.message))) throw new AssertionError("wrong message");


        //print "Finished" if the conditions is true
        System.out.println("Satisfied! Finished");
        Response resset1 = callAPI.callAPISet_Block(user_id, "1", token, link);

    }

    //chưa tìm ra cách test
    public static void Unittest4(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);

        Scanner sc = new Scanner(System.in);
        String user_id = sc.next();
        String type = "0";
        String token = reslog.data.token;

        System.out.println("Test Case 4: The account is blocked");
        Response resset = callAPI.callAPISet_Block(user_id, type, token, link);
        if (!(resset.code.equals("9995"))) throw new AssertionError("wrong code\n" + "tài khoản người dùng có thể chưa thực sự bị khoá" );
        if ((!"User is not validated".equals(resset.message))) throw new AssertionError("wrong message");




    }

    public static void Unittest5(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);

        String user_id = reslog.data.id;
        String type = "0";
        String token = reslog.data.token;

        System.out.println("Test Case 5: User_id invalid");
        Response resset = callAPI.callAPISet_Block(user_id, type, token, link);
        if (!("1003".equals(resset.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(resset.message))) throw new AssertionError("wrong message");

        System.out.println("Satisfied! Finished");

    }

    public static void Unittest6(String link, String loginlink) throws Exception{

        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);
        int id_base = Integer.parseInt(reslog.data.id);


        String user_id = String.valueOf(Integer.valueOf(reslog.data.id) + 1);
        String type = "0";
        String token = reslog.data.token;

        System.out.println("Test Case 6: user id not exist");
        Response resset = callAPI.callAPISet_Block(user_id, type, token, link);
        if(Integer.parseInt(user_id) > id_base) {
            if (!("1003".equals(resset.code))) throw new AssertionError("wrong code\n" + "id này của tài khoản có thể không đáp ứng yêu cầu không tồn tại");
            if ((!"Parameter type is invalid".equals(resset.message))) throw new AssertionError("wrong message");
        } else {
            if (!("1000".equals(resset.code))) throw new AssertionError("wrong code");
            if ((!"OK".equals(resset.message))) throw new AssertionError("wrong message");
        }
        System.out.println("Satisfied! Finished");
    }

    public static void Unittest7(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);

        System.out.println("Nhập user_id mà đã bị khoá tài khoản ");
        Scanner sc = new Scanner(System.in);
        String user_id = sc.next();
        String type = "0";
        String token = reslog.data.token;

        System.out.println("Test Case 7: User id was locked");
        Response resset = callAPI.callAPISet_Block(user_id, type, token, link);
        if (!(resset.code.equals("9995"))) throw new AssertionError("wrong code\n" + "tài khoản người bị chặn có thể chưa thực sự bị khoá" );
        if ((!"User is not validated".equals(resset.message))) throw new AssertionError("wrong message");

    }

    public static void Unittest8(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);

        String user_id = String.valueOf(Integer.valueOf(reslog.data.id) - 1);
        String type = "10";
        String token = reslog.data.token;

        System.out.println("Test Case 8: Type incorrect");
        Response resset = callAPI.callAPISet_Block(user_id, type, token, link);
        if ((!"1003".equals(resset.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(resset.message))) throw new AssertionError("wrong message");

    }

    public static void Unittest9(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);

        System.out.println("Lấy user_id người dùng đã chặn và chặn người dùng đó");
        String user_id = String.valueOf(Integer.valueOf(reslog.data.id) + 1);
        String type = "0";
        String token = reslog.data.token;

        System.out.println("Test Case 9: Block-Unblock ");
        Response res = callAPI.callAPISet_Block(user_id, type, token, link);

        Response resset = callAPI.callAPISet_Block(user_id, type, token, link);
        if ((!"1010".equals(resset.message))) throw new AssertionError("wrong code\n");
        if ((!"Action has been done previously by this user".equals(resset.message))) throw new AssertionError("wrong message");

    }

    public static void Unittest10(String link, String loginlink) throws Exception{
        ResponseLogin reslog = callAPI.callAPILogin(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, loginlink);

        System.out.println("Chặn người dùng");
        String user_id = String.valueOf(Integer.valueOf(reslog.data.id) + 1);
        String type = "0";
        String token = reslog.data.token;

        Response resset = callAPI.callAPISet_Block(user_id, type, token, link);


        System.out.println("Bỏ chặn người dùng");
        Response resset1 = callAPI.callAPISet_Block(user_id, "1", token, link);


        System.out.println("Test Case 10: Block-Unblock in short time");
        if ((!"1000".equals(resset1.message))) throw new AssertionError("wrong code\n" + "user_id đã nhập có thể không thuộc tài khoản đã bị chặn");
        if ((!"OK".equals(resset.message))) throw new AssertionError("wrong message");

    }





}
