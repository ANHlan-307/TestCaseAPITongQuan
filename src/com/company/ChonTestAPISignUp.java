package com.company;

import java.util.Scanner;

//Lớp để chọn ra Test Case muốn kiểm tra với API SignUp
public class ChonTestAPISignUp {
    static String link;
    public static void TestSignUp() throws Exception{
        boolean k = true;
        while (k) {
            //Giao diện hiển thị
            System.out.println("Nhấn 1: Chọn test case 1 - Người dùng nhập số điện thoại vốn là số chưa được đăng ký trên hệ thống. Nhập" +
                    "đúng mật khẩu là xâu không trùng với số điện thoại, không chứa ký tự đặc biệt.\n\n" +
                    "Nhấn 2: Chọn test case 2 - Người dùng nhập số điện thoại vốn là số điện thoại đã được đăng ký thành công từ" +
                    "trước. Người dùng cũng nhập mật khẩu đúng quy định\n\n" +
                    "Nhấn 3: chọn test case 3 - Người dùng nhập số điện thoại không đúng định dạng (không đủ số hoặc thừa số hoặc" +
                    "không có số 0 ở đầu tiên) và nhập mật khẩu đúng quy định\n\n" +
                    "Nhấn 4: Chọn test case 4 - Người dùng nhập đúng định dạng của số điện thoại nhưng mật khẩu không đúng định" +
                    "dạng (quá ngắn hoặc quá dài hoặc chứa ký tự đặc biệt hoặc trùng với số điện thoại). Ứng" +
                    "dụng cần phải kiểm tra ngay trước khi gửi dữ liệu lên server\n\n" +
                    "Nhấn 5: Chọn test case 5 - Người dùng bỏ qua không nhập cả số điện thoại và mật khẩu nhưng nhấn vào nút “Đăng" +
                    "ký” (hoặc “Sign up” tùy vào giao diện ứng dụng).\n\n" +
                    "Nhấn 6: Exit\n");

            //Chọn test case
            System.out.println("Chọn test case: ");
            Scanner sc = new Scanner(System.in);
            String pk = sc.next();
            int pick = Integer.parseInt(pk);

            switch (pick) {

                case 1:
                    Input.SignUp.nhap();
                    TestCaseSignUp.Unittest1(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, link);
                    break;
                case 2:
                    Input.SignUp.nhap();
                    TestCaseSignUp.Unittest2(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, link);
                    break;
                case 3:
                    Input.SignUp.nhap();
                    TestCaseSignUp.Unittest3(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, link);
                    break;
                case 4:
                    Input.SignUp.nhap();
                    TestCaseSignUp.Unittest4(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, link);
                    break;
                case 5:
                    Input.SignUp.nhap();
                    TestCaseSignUp.Unittest5(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.uuid, link);
                    break;
                case 6:
                    k = false;
                    break;
            }
        }
    }
}
