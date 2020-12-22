package com.company;

import java.util.Scanner;

// Lớp để chọn ra Test Case muốn kiểm tra với API Get verify code
public class ChonTestAPIGetverifycode {
    static String link;
    static String signupLink;
    public static void TestGet_verify_code() throws Exception {
        boolean k = true;
        while (k) {
            System.out.println("Nhập 1 để chọn Test Case 1 - Người dùng gọi request này lại khi mà chưa nhận được hoặc làm mất mã xác thực.\n\n "+
                    "Nhập 2 để chọn Test Case 2 - Người dùng liên tục gửi request này lại trong thời gian quá ngắn.\n\n"+
                    "Nhập 3 để chọn Test Case 3 - Người dùng truyền tham số với số điện thoại đã được hoàn tất quy trình đăng ký (tức\n" +
                    "việc xác thực cũng đã xong).\n\n"+
                    "Nhập 4 để chọn Test Case 4 - Người dùng truyền tham số với số điện thoại chưa được đăng ký.\n\n" +
                    "Nhập 5 để chọn Test Case 5 - Người dùng truyền tham số với số điện thoại sai định dạng.\n\n");
            Scanner sc = new Scanner(System.in);
            String pk = sc.next();
            int pick = Integer.parseInt(pk);
            switch (pick) {
                case 1:
                    TestCaseGetverifycode.Unittest1(link);
                    break;
                case 3:
                    TestCaseGetverifycode.Unittest3(link);
                    break;
                case 4:
                    TestCaseGetverifycode.Unittest4(link);
                    break;
                case 5:
                    TestCaseGetverifycode.Unittest5(link);
                    break;
                default:
                    k = false;
                    break;
            }

        }

    }

}
