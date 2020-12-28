package com.company;

import java.util.Scanner;

//Lớp để chọn Test Case muốn kiếm tra trong API Login

public class ChonTestAPILogin {
    static String link;
    public static void TestLogin() throws Exception {
        boolean k = true;
        while (k) {
            //Giao diện hiển thị
            System.out.println("Nhấn 1 để chọn Test Case 1 - Người dùng nhập số điện thoại vốn là số đã được đăng ký trên hệ thống. Nhập đúng\n" +
                    "mật khẩu và xâu không trùng với số điện thoại, không chứa ký tự đặc biệt, thiết bị\n" +
                    "cũng gửi đúng mã devtoken (device ID)\n\n" +
                    "Nhấn 2 để chọn Test Case 2 - Người dùng nhập số điện thoại vốn là số CHƯA được đăng ký trên hệ thống. Nhập\n" +
                    "mật khẩu đúng định dạng và có mã devtoken hợp lệ\n\n" +
                    "Nhấn 3 để chọn Test Case 3 - Người dùng nhập số điện thoại không đúng định dạng (không đủ số hoặc thừa số hoặc\n" +
                    "không có số 0 ở đầu tiên) và nhập mật khẩu đúng quy định, devtoken hợp lệ\n\n"+
                    "Nhấn 4 để chọn Test Case 4 - Người dùng nhập đúng định dạng của số điện thoại nhưng mật khẩu không đúng định\n" +
                    "dạng (quá ngắn hoặc quá dài hoặc chứa ký tự đặc biệt hoặc trùng với số điện thoại),\n" +
                    "devtoken hợp lệ. Ứng dụng cần phải kiểm tra ngay trước khi gửi dữ liệu lên server\n\n"+
                    "Nhấn 5 để chọn Test Case 5 - Người dùng bỏ qua không nhập cả số điện thoại và mật khẩu nhưng nhấn vào nút “Đăng\n" +
                    "nhập” (hoặc “Log in” tùy vào giao diện ứng dụng).\n\n"+
                    "Nhấn 6 để chọn Test Case 6 - Người dùng nhập đúng định dạng của số điện thoại và mật khẩu, devtoken hợp lệ nhưng\n" +
                    "không có kết nối mạng.\n\n"+
                    "Nhấn 7 để chọn Test Case 7 - Người dùng nhập số điện thoại và mật khẩu có nội dung giống số điện thoại rồi nhấn\n" +
                    "vào nút “Đăng nhập” (hoặc “Log in” tùy vào giao diện ứng dụng), devtoken hợp lệ.\n\n"+
                    "Nhấn 8 để chọn Test Case 8 - Người dùng đăng nhập thành công trên máy A. Rồi đăng nhập thành công trên máy B.\n\n"+
                    "Nhấn 9 để chọn Test Case 9 - Ứng dụng gửi thông tin đăng nhập nhưng không gửi devtoken.\n\n"+
                    "Nhấn 10 để thoát\n\n");

            //Chọn Test Case
            System.out.println("Chọn test case: ");
            Scanner sc = new Scanner(System.in);
            String pk = sc.next();
            int pick = Integer.parseInt(pk);
            switch (pick) {

                case 1:
                    System.out.println("Nhập tài khoản đã đăng ký và đã được kiểm tra verify code");
                    Input.Login.nhap();
                    TestCaseLogin.Unittest1(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, link);
                    break;
                case 2:
                    System.out.println("Nhập tài khoản đã đăng ký và đã được kiểm tra verify code");
                    Input.Login.nhap();
                    TestCaseLogin.Unittest2(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, link);
                    break;
                case 3:
                    System.out.println("Nhập tài khoản đã đăng ký và đã được kiểm tra verify code");
                    Input.Login.nhap();
                    TestCaseLogin.Unittest3(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, link);
                    break;
                case 4:
                    System.out.println("Nhập tài khoản đã đăng ký và đã được kiểm tra verify code");
                    Input.Login.nhap();
                    TestCaseLogin.Unittest4(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, link);
                    break;
                case 5:
                    System.out.println("Nhập tài khoản đã đăng ký và đã được kiểm tra verify code");
                    System.out.println("Thiếu tham số số điện thoại và mật khẩu");
                    TestCaseLogin.Unittest5("","", "2e092750-4079-11eb-b378-0242ac130002", link);
                    break;
                case 6:
                    System.out.println("Nhập tài khoản đã đăng ký và đã được kiểm tra verify code");
                    Input.Login.nhap();
                    TestCaseLogin.Unittest6(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, link);
                    break;
                case 7:
                    System.out.println("Nhập tài khoản đã đăng ký và đã được kiểm tra verify code");
                    Input.Login.nhap();
                    TestCaseLogin.Unittest7(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, link);
                    break;
                case 8:
                    System.out.println("Nhập tài khoản đã đăng ký và đã được kiểm tra verify code");
                    Input.Login.nhap();
                    TestCaseLogin.Unittest8(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, link);
                    break;
                case 9:
                    System.out.println("Nhập tài khoản đã đăng ký và đã được kiểm tra verify code");
                    Input.Login.nhap();
                    TestCaseLogin.Unittest9(Input.Login.phonenumber, Input.Login.password, Input.Login.uuid, link);
                    break;
                default:
                    k = false;
                    break;
            }
        }
    }
}

//0987556334
//Password:
//yutrfgh
//UUID:
//cc1cab06-4079-11eb-b378-0242ac130002
