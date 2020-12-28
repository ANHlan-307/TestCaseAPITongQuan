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
    public Data data;
    public class Data {
        String verifyCode;
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

class ResponseSearch {
    public String code;
    public String message;
    public Data3 data;
    public class Data3{
        String id;
        String image;
        Video video;
        String like;
        String comment;
        String is_liked;
        Author author;
        String described;
    }
    public class Video{
        String url;
        String thump;
    }
    public class Author{
        String id;
        String username;
        String avatar;
    }
}

class ResponseGet_Saved_Search {
    public String code;
    public String message;
    public Data4 data;
    public class Data4{
        String id;
        String keyword;
        String created;
    }
}

class ResponseCheck_new_version{
    public String code;
    public String message;
    public class Data{
        String version;
        String required;
    }
}

