package com.company;

import java.util.Scanner;

public class ChonTestAPICheckNewVersion {
    static String link;
    static String token;

    public static void TestCheck_new_version() throws Exception {
        boolean k = true;
        while (k) {
            System.out.println("Nhập 1 để chọn Test Case 1 - Người dùng truyền đúng mã phiên đăng nhập và các tham số khác\n\n "+
                    "Nhập 2 để chọn Test Case 2 - Người dùng gửi sai mã phiên đăng nhập (mã bị trống hoặc quá ngắn hoặc mã phiên\n" +
                    "đăng nhập cũ).\n\n"+
                    "Nhập 3 để chọn Test Case 3 - Người dùng truyền đúng mã phiên đăng nhập nhưng hệ thống không thể thiết lập việc\n" +
                    "xử lý yêu cầu (do lỗi truy cập CSDL chẳng hạn)\n\n"+
                    "Nhập 4 để chọn Test Case 4 - Người dùng truyền đúng mã phiên đăng nhập. Nhưng người dùng đã bị khóa tài khoản\n" +
                    "(do hệ thống khóa đi).\n\n" +
                    "Nhập 5 để chọn Test Case 5 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác nhưng last_update\n" +
                    "lại không có.\n\n" +
                    "Nhập 6 để chọn Test Case 6 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác đầy đủ nhưng\n" +
                    "phiên bản last_update không tồn tại.\n\n"+
                    "Nhập 8 để chọn Test Case 8 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác đầy đủ nhưng hệ\n" +
                    "thống báo sai ID của người dùng hoặc sai giá trị active (giá trị đúng là 0 hoặc 1).\n\n");
            Scanner sc = new Scanner(System.in);
            String pk = sc.next();
            int pick = Integer.parseInt(pk);
            switch (pick) {
                case 1:
                    TestCaseChecknewversion.Unittest1(link, token);
                    break;
                case 2:
                    TestCaseChecknewversion.Unittest2(link, token);
                    break;
                case 3:
                    TestCaseChecknewversion.Unittest3(link, token);
                    break;
                case 4:
                    TestCaseChecknewversion.Unittest4(link, token);
                    break;
                case 5:
                    TestCaseChecknewversion.Unittest5(link, token);
                    break;
                case 6:
                    TestCaseChecknewversion.Unittest6(link, token);
                    break;
                case 8:
                    TestCaseChecknewversion.Unittest8(link, token);
                    break;
                default:
                    k = false;
                    break;
            }
        }
    }
}
