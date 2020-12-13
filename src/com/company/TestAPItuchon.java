package com.company;

//Lớp để thực thi các Test Case của API theo cách tự người dùng chọn test case muốn test, nhập vào tham số hợp lệ
//Sau khi kết thúc sẽ trả về response tương ứng
public class TestAPItuchon {
    public static void giaodientuchon() throws Exception {
        String url = ChonHost.HOST(); //Lấy link url của Host và API đã được chọn
        System.out.println(url);

        //kiểm tra url gọi tới API nào và thực thi test case cho API đó
        if(url.contains("signup")) {
            ChonTestAPISignUp.link = url; //gán link url gọi API signUp
            System.out.println(url); //kiểm tra lại link url
            ChonTestAPISignUp.TestSignUp(); //Chọn Test Case muốn test với API Sign Up, sau đó thực thi test case đã chọn

        } else if (url.contains("login")) {
            ChonTestAPILogin.link = url; //gán link url gọi tới API login
            System.out.println(url); //kiểm tra lại link url
            ChonTestAPILogin.TestLogin(); //Chọn Test Case muốn test với API Login, sau đó thực thi test case đã chọn

        } else if (url.contains("logout")){
            ChonTestAPILogOut.link = url; //gán link url gọi tới API logout
            String loginlink1 = url.replace("logout", "login"); //gán link url gọi tới API login
            ChonTestAPILogOut.loginlink = loginlink1;

            //Đăng nhập tài khoản đã có để thực thi test case
            System.out.println("Đăng nhập tài khoản: ");
            Input.Login.nhap();
            System.out.println(url);

            //Chọn test case và thực thi test case đã chọn
            System.out.println("Chọn trường hợp test api log out: ");
            ChonTestAPILogOut.TestLogout();

        } else if(url.contains("change_password")){
            ChonTestAPIchangepass.link = url;
            String loginlink1 = url.replace("change_password", "login");
            System.out.println(url);
            System.out.println(loginlink1);
            ChonTestAPIchangepass.loginlink = loginlink1; //gán link url gọi tới API login

            //Đăng nhập tài khoản đã có để thực thi test case
            System.out.println("Đăng nhập tài khoản: ");
            Input.Login.nhap();

            //Chọn test case và thực thi test case đã chọn
            System.out.println("Chọn trường hợp test api change_password: ");
            ChonTestAPIchangepass.TestChangepass();

        } else if (url.contains("block")) {
            ChonTestAPISetBlock.link = url;
            String loginlink1 = url.replace("user/block", "login");
            String signuplink = url.replace("user/block", "signup");
            System.out.println(url);
            System.out.println(loginlink1);
            System.out.println(signuplink);

            ChonTestAPISetBlock.loginlink = loginlink1;
            ChonTestAPISetBlock.signupLink = signuplink;

            //Đăng ký tài khoản mới để thực thi test case
            System.out.println("Đăng ký tài khoản mới");
            Input.SignUp.nhap();
            Response ressign = callAPI.callAPISignUp(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, signuplink);

            //Chọn test case và thực thi test case đã chọn
            ChonTestAPISetBlock.TestSetBlock();
        } else if(url.contains("get_verify_code")){
            ChonTestAPIGetverifycode.link = url;
            String signuplink = url.replace("get_verify_code", "signup");
            Input.SignUp.nhap();
            Response res = callAPI.callAPISignUp(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, signuplink);
            ChonTestAPIGetverifycode.TestGet_verify_code();

        } else if(url.contains("check_verify_code")){
            ChonTestAPICheck_verify_code.link = url;
            String signuplink = url.replace("check_verify_code", "signup");
            Input.SignUp.nhap();
            Response res = callAPI.callAPISignUp(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, signuplink);

            String getverifylink = url.replace("check_verify_code", "get_verify_code");
            ResponseGet_verify_code resget = callAPI.callAPIGVC(Input.SignUp.phonenumber, getverifylink);
            ChonTestAPICheck_verify_code.verifycode = resget.data.verifycode;

            ChonTestAPICheck_verify_code.TestCheck_verify_code();;


        }
    }

}
