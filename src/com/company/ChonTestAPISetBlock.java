package com.company;

import java.util.Scanner;

//Lớp để chọn ra Test Case muốn kiểm tra với API Set_Block

public class ChonTestAPISetBlock {
    static String signupLink;
    static String loginlink;
    static String link;
    public static void TestSetBlock() throws Exception {
        boolean k = true;
        while (k) {

            System.out.println("Nhập 1 để chọn Test Case 1 - Người dùng truyền đúng mã phiên đăng nhập và các tham số khác\n\n"+
                    "Nhập 2 để chọn Test Case 2 - Người dùng gửi sai mã phiên đăng nhập (mã bị trống hoặc quá ngắn hoặc mã phiên\n" +
                    "đăng nhập cũ).\n\n"+
                    "Nhập 3 để chọn Test Case 3 - Người dùng truyền đúng mã phiên đăng nhập nhưng hệ thống không thể thiết lập việc\n" +
                    "xử lý yêu cầu (do lỗi truy cập CSDL chẳng hạn)\n\n"+
                    "Nhập 4 để chọn Test Case 4 - Người dùng truyền đúng mã phiên đăng nhập. Nhưng người dùng đã bị khóa tài khoản\n" +
                    "(do hệ thống khóa đi).\n\n"+
                    "Nhập 5 để chọn Test Case 5 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác nhưng user_id lại\n" +
                    "chính là người chủ tài khoản.\n\n"+
                    "Nhập 6 để chọn Test Case 6 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác đầy đủ nhưng\n" +
                    "người bị chặn (ở user_id) không tồn tại.\n\n");

            Scanner sc = new Scanner(System.in);
            String pk = sc.next();
            int pick = Integer.parseInt(pk);

            switch (pick) {
                case 1:
                    TestCaseSetBlock.Unittest1(link, loginlink);
                    break;
                case 2:
                    TestCaseSetBlock.Unittest2(link, loginlink);
                    break;
                case 3:
                    TestCaseSetBlock.Unittest3(link, loginlink);
                    break;
                case 4:
                    TestCaseSetBlock.Unittest4(link, loginlink);
                    break;
                case 5:
                    TestCaseSetBlock.Unittest5(link, loginlink);
                    break;
                case 6:
                    TestCaseSetBlock.Unittest6(link, loginlink, signupLink);
                    break;
                 default:
                    k = false;
                    break;
            }

        }
    }
}
