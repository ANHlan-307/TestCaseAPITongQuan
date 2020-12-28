package com.company;

//Lớp Constant chứa các link url gọi tới các API của 6 nhóm đã xây dựng
//Phonenumber:
//0956774556
//Password:
//tyufrt5
//UUID:
//jkafagasdga7

public class Constant {
    // 1 - nhóm Hàn Trung Kiên
    public static String DOMAIN_HOST_1 = "http://it4895.herokuapp.com/it4895";
    // 2 - nhóm Nguyễn Thị Thuỳ Dung
    public static String DOMAIN_HOST_2 = "https://luandz.cf/it4788";
    // 3 - nhóm Lưu Quang Đông
    public static String DOMAIN_HOST_3 = "https://bk-it4895.herokuapp.com/it4788";
    // 4 - nhóm Phùng Việt Duy
    public static String DOMAIN_HOST_4 = "https://hust-fb-it4895.herokuapp.com/it4788";
    // 5 - nhóm Cao Văn Duy
    public static String DOMAIN_HOST_5 = "https://it4895-nhom5.herokuapp.com/it4788/auth";
    // 6 - nhóm Lê Xuân Quang
    public static String DOMAIN_HOST_6 = "https://project-facebook-clone.herokuapp.com/it4788/user";

    public static Nhom1API APInhom1;
    public static Nhom2API APInhom2;
    public static Nhom3API APInhom3;
    public static Nhom4API APInhom4;
    public static Nhom5API APInhom5;
    public static Nhom6API APInhom6;

    //12 API
    /*
    SIGN_UP
    LOG_IN
    LOG_OUT
    CHANGE_PASS
    SET_BLOCK
    CHECK_NEW_VERSION
    GET_VERIFY_CODE
    CHECK_VERIFY_CODE
    GET_POST
    SET_UP_FRIENDS
    SEARCH
    DEL_SAVED_SEARCH
     */

    public static class Nhom1API{
        public static String SIGN_UP = DOMAIN_HOST_1 + "/signup";
        public static String LOG_IN = DOMAIN_HOST_1 + "/login";
        public static String LOG_OUT = DOMAIN_HOST_1 + "/logout";
        public static String CHANGE_PASS = DOMAIN_HOST_1 + "/change_password";
        public static String SET_BLOCK = DOMAIN_HOST_1 + "/set_block";
        public static String CHECK_NEW_VERSION = DOMAIN_HOST_1 + "/check_new_version";
        public static String GET_VERIFY_CODE = DOMAIN_HOST_1 + "/get_verify_code";
        public static String CHECK_VERIFY_CODE = DOMAIN_HOST_1 + "/check_verify_code";
        public static String SEARCH = DOMAIN_HOST_1 + "/search";
        public static  String SET_ACCEPT_FRIEND = DOMAIN_HOST_1 + "/set_accept_friend";
        public static String GET_POST = DOMAIN_HOST_1 +"/get_post";
        public static String DEL_SAVED_SEARCH = DOMAIN_HOST_1 + "/del_saved_search";
    }

    public static class Nhom2API{
        public static String SIGN_UP = DOMAIN_HOST_2 + "/signup";
        public static String LOG_IN = DOMAIN_HOST_2 + "/login";
        public static String LOG_OUT = DOMAIN_HOST_2 + "/logout";
        public static String CHANGE_PASS = DOMAIN_HOST_2 + "/change_password";
        public static String SET_BLOCK = DOMAIN_HOST_2 + "/set_block";
        public static String GET_VERIFY_CODE = DOMAIN_HOST_2 + "/get_verify_code";
        public static String CHECK_VERIFY_CODE = DOMAIN_HOST_2 + "/check_verify_code";
        public static String SEARCH = DOMAIN_HOST_2 + "/search";
        public static String SET_ACCEPT_FRIEND = DOMAIN_HOST_2 + "/set_accept_friend";
        public static String GET_POST = DOMAIN_HOST_2 +"/get_post";
        public static String DEL_SAVED_SEARCH = DOMAIN_HOST_2 + "/del_saved_search";
    }

    public static class Nhom3API{
        public static String SIGN_UP = DOMAIN_HOST_3 + "/signup";
        public static String LOG_IN = DOMAIN_HOST_3 + "/login";
        public static String LOG_OUT = DOMAIN_HOST_3 + "/logout";
        public static String CHANGE_PASS = DOMAIN_HOST_3 + "/change_password";
        public static String SET_BLOCK = DOMAIN_HOST_3 + "//set_block";
        public static String GET_VERIFY_CODE = DOMAIN_HOST_3 + "/get_verify_code";
        public static String CHECK_VERIFY_CODE = DOMAIN_HOST_3 + "/check_verify_code";
        public static String SEARCH = DOMAIN_HOST_3 + "/search";
        public static String SET_ACCEPT_FRIEND = DOMAIN_HOST_3 + "/set_accept_friend";
        public static String GET_POST = DOMAIN_HOST_3 +"/get_post";
        public static String DEL_SAVED_SEARCH = DOMAIN_HOST_3 + "/del_saved_search";
    }

    public static class Nhom4API{
        public static String SIGN_UP = DOMAIN_HOST_4 + "/signup";
        public static String LOG_IN = DOMAIN_HOST_4 + "/login";
        public static String LOG_OUT = DOMAIN_HOST_4 + "/logout";
        public static String CHANGE_PASS = DOMAIN_HOST_4 + "/change_password";
        public static String GET_VERIFY_CODE = DOMAIN_HOST_4 + "/get_verify_code";
        public static String CHECK_VERIFY_CODE = DOMAIN_HOST_4 + "/check_verify_code";
        public static String SEARCH = DOMAIN_HOST_4 + "/search";
        public static String GET_POST = DOMAIN_HOST_4 +"/get_post";
        public static String DEL_SAVED_SEARCH = DOMAIN_HOST_4 + "/del_saved_search";
    }

    public static class Nhom5API{
        public static String SIGN_UP = DOMAIN_HOST_5 + "/signup";
        public static String LOG_IN = DOMAIN_HOST_5 + "/login";
        public static String LOG_OUT = DOMAIN_HOST_5 + "/logout";
        public static String CHANGE_PASS = DOMAIN_HOST_5 + "/change_password";
        public static String GET_VERIFY_CODE = DOMAIN_HOST_5 + "/get_verify_code";
        public static String CHECK_VERIFY_CODE = DOMAIN_HOST_5 + "/check_verify_code";
        public static String SEARCH = DOMAIN_HOST_5 + "/search";
        public static String SET_ACCEPT_FRIEND = DOMAIN_HOST_5 + "/set_accept_friend";
        public static String GET_POST = DOMAIN_HOST_5 +"/get_post";
        public static String DEL_SAVED_SEARCH = DOMAIN_HOST_5 + "/del_saved_search";
        public static String CHECK_NEW_VERSION = DOMAIN_HOST_5 + "/check_new_version";

    }

    public static class Nhom6API{
        public static String SIGN_UP = DOMAIN_HOST_6 + "/signup";
        public static String LOG_IN = DOMAIN_HOST_6 + "/login";
        public static String LOG_OUT = DOMAIN_HOST_6 + "/logout";
        public static String GET_POST = DOMAIN_HOST_6 +"/get_post";
    }
}
