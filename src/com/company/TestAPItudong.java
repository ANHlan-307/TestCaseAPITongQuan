package com.company;

//params test cho get_verify_code, check_verify_code, login, logout,changepass
//phonenumber = 0145667889
//password = thankbut2
//uuid = c8fa4694-40c5-11eb-b378-0242ac130002


public class TestAPItudong {
    public static void giaodientudong() throws Exception {
        System.out.println("Chào mừng tới test tự động");
        String url = ChonHost.HOST(); //Lấy link url của Host và API đã được chọn
        System.out.println(url);
        if (url.contains("signup")) {
            System.out.println(url); //kiểm tra lại link url
            Input.SignUp.nhap();
            TestCaseSignUp.Unittest1(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, url);
            TestCaseSignUp.Unittest2(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, url);
            TestCaseSignUp.Unittest3("987654321", "87tyeet67", "019d4ad6-4077-11eb-b378-0242ac130002", url);
            TestCaseSignUp.Unittest4("0972112000", "0", "f6dad910-4076-11eb-b378-0242ac130002", url);
            TestCaseSignUp.Unittest5("", "", "", url);
        } else if(url.contains("get_verify_code")) {
            ChonTestAPIGetverifycode.link = url;
            String signuplink = url.replace("get_verify_code", "signup");
            Input.SignUp.nhap();
            System.out.println("Sử dụng tài khoản đã được đăng ký:");
            System.out.println("Phonenumber: 0998765432");
            System.out.println("Password: thanksyou01");
            System.out.println("uuid: 04778e8c-40c8-11eb-b378-0242ac130002");
            Response res = callAPI.callAPISignUp(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, signuplink);
            TestCaseGetverifycode.Unittest1(url);
            TestCaseGetverifycode.Unittest3(url);
            TestCaseGetverifycode.Unittest4(url);
            TestCaseGetverifycode.Unittest5(url);
        } else if(url.contains("check_verify_code")){
            ChonTestAPICheck_verify_code.link = url;

            System.out.println("Nhập vào tài khoản đã được đăng ký và lấy mã xác thực");
            Input.SignUp.nhap();
            String phonenumber = Input.SignUp.phonenumber;
            String password = Input.SignUp.password;
            String uuid = Input.SignUp.uuid;


            String getverifylink = url.replace("check_verify_code", "get_verify_code");
            ResponseGet_verify_code resget = callAPI.callAPIGVC(Input.SignUp.phonenumber, getverifylink);
            String verifycode = resget.data.verifycode;

            TestCaseCheckverifycode.Unittest1(url, verifycode);
            TestCaseCheckverifycode.Unittest2(url, verifycode);
            TestCaseCheckverifycode.Unittest3(url, verifycode);
            TestCaseCheckverifycode.Unittest4(url, verifycode);
            TestCaseCheckverifycode.Unittest5(url, verifycode);
            TestCaseCheckverifycode.Unittest6(url, verifycode);


        } else if (url.contains("login")) {
            String signuplink = url.replace("login", "signup");
            System.out.println(url); //kiểm tra lại link url
            System.out.println("Nhập vào tài khoản đã được kích hoạt mã xác thực");
            Input.SignUp.nhap();
            TestCaseLogin.Unittest1(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, url);
            TestCaseLogin.Unittest2("0912222333", Input.SignUp.password, Input.SignUp.uuid, url);
            TestCaseLogin.Unittest3("912222333", Input.SignUp.password, Input.SignUp.uuid, url);
            TestCaseLogin.Unittest4(Input.SignUp.phonenumber, "0", Input.SignUp.uuid, url);
            TestCaseLogin.Unittest5("", "", Input.SignUp.uuid, url);
            TestCaseLogin.Unittest6(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, url);
            TestCaseLogin.Unittest7(Input.SignUp.phonenumber, Input.SignUp.phonenumber, Input.SignUp.uuid, url);
            TestCaseLogin.Unittest8(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, url);
            TestCaseLogin.Unittest9(Input.SignUp.phonenumber, Input.SignUp.password, "", url);
        }else if (url.contains("logout")) {
            String loginlink = url.replace("logout", "login"); //gán link url gọi tới API login
            String signuplink = url.replace("logout", "signup"); //gán link url gọi tới API login

            //Đăng nhập tài khoản đã có để thực thi test case
            System.out.println("Đăng ký tài khoản: ");

            System.out.println("Nhập vào tài khoản đã đượcc kíchc hoạt mã xác thực");
            Input.SignUp.nhap();
            System.out.println(url);

            //Chọn test case và thực thi test case đã chọn
            System.out.println("Chọn trường hợp test api log out: ");
            TestCaseLogout.Unittest1(url, loginlink);
            TestCaseLogout.UnitTest2(url, loginlink);
            TestCaseLogout.UnitTest3(url, loginlink);
            TestCaseLogout.UnitTest4(url, loginlink);
        } else if(url.contains("change_password")) {
            String loginlink = url.replace("change_password", "login");
            System.out.println(url);
            System.out.println(loginlink);
            //Đăng nhập tài khoản đã có để thực thi test case
            System.out.println("Đăng nhập tài khoản: ");
            Input.Login.nhap();

            TestCaseChangePass.Unittest1(url, loginlink);
            TestCaseChangePass.Unittest2(url, loginlink);
            TestCaseChangePass.Unittest3(url, loginlink);
            TestCaseChangePass.Unittest4(url, loginlink);
            TestCaseChangePass.Unittest5(url, loginlink);
            TestCaseChangePass.Unittest6(url, loginlink);
            TestCaseChangePass.Unittest7(url, loginlink);
            TestCaseChangePass.Unittest8(url, loginlink);
            TestCaseChangePass.Unittest9(url, loginlink);
        } else if (url.contains("block")) {
            ChonTestAPISetBlock.link = url;
            String loginlink = url.replace("set_block", "login");
            System.out.println(url);
            System.out.println(loginlink);

            //Đăng ký tài khoản mới để thực thi test case
            System.out.println("Đăng nhập tài khoản");
            Input.SignUp.nhap();
            //Chọn test case và thực thi test case đã chọn
            TestCaseSetBlock.Unittest1(url, loginlink);
            TestCaseSetBlock.Unittest2(url, loginlink);
            TestCaseSetBlock.Unittest3(url, loginlink);
            TestCaseSetBlock.Unittest5(url, loginlink);
            TestCaseSetBlock.Unittest8(url, loginlink);
            TestCaseSetBlock.Unittest9(url, loginlink);
            TestCaseSetBlock.Unittest10(url, loginlink);
        }

    }
}
