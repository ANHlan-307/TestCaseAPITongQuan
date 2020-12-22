package com.company;

public class TestCaseSetAcceptFriends {
    public static void Unittest1(String link, String loginlink) throws Exception {
        ResponseLogin resp = callAPI.callAPILogin(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, loginlink);
        String token = resp.data.token;
        String user_id = String.valueOf(Integer.valueOf(resp.data.id) - 1) ;
        String is_accepted = "1";
        Response res = callAPI.callAPSet_Accept_Friend(token,user_id,is_accepted, link);
        if (!("1000".equals(res.code)) && !("OK".equals(res.message))) throw new AssertionError();
        System.out.println("Satisfied! Finished");
    }
}
