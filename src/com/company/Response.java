package com.company;

//Chứa các lớp trả về Response của API tương ứng
//Các API không trả về Data cùng thuộc lớp Response: Logout, Change password, set block, check new version
//get verify code, check verify code, get post

public class Response{
    String code;
    String message;
}

class ResponseLogin {
    public String code;
    public String message;
    public Data data;
    public class Data{
        String id;
        String username;
        String token;
        String avatar;
        String active;
    }
}

class ResponseGet_verify_code{
    public String code;
    public String message;
    public Data1 data;
    public class Data1{
        String verifycode;
    }
}

class ResponseCheck_verify_code{
    public String code;
    public String message;
    public Data2 data;
    public class Data2{
        String token;
        String id;
        String active;
    }
}

