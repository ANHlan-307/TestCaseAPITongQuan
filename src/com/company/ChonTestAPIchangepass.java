package com.company;

import java.util.Scanner;

//Lớp để chọn ra Test Case muốn kiểm tra với API Change password

public class ChonTestAPIchangepass {
    static String loginlink;
    static String link;
    public static void TestChangepass() throws Exception {
        boolean k = true;
        while (k) {
            //Giao diện hiển thị
            System.out.println("Chọn Test Case: ");
            System.out.println("Nhấn 1 để chọn Test Case 1 - Người dùng truyền đúng mã phiên đăng nhập và các tham số khác\n\n"+
                    "Nhấn 2 để chọn Test Case 2 - Người dùng gửi sai mã phiên đăng nhập (mã bị trống hoặc quá ngắn hoặc mã phiên\n" +
                    "đăng nhập cũ).\n\n"+
                    "Nhấn 3 để chọn Test Case 3 - Người dùng truyền đúng mã phiên đăng nhập nhưng hệ thống không thể thiết lập việc\n" +
                    "xử lý yêu cầu (do lỗi truy cập CSDL chẳng hạn)\n\n "+
                    "Nhấn 4 để chọn Test Case 4 - Người dùng truyền đúng mã phiên đăng nhập. Nhưng người dùng đã bị khóa tài khoản\n" +
                    "(do hệ thống khóa đi).\n\n"+
                    "Nhấn 5 để chọn Test Case 5 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác nhưng mật khẩu cũ\n" +
                    "không đúng.\n\n"+
                    "Nhấn 6 để chọn Test Case 6 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác đầy đủ nhưng\n" +
                    "trong giao diện thì người dùng nhập hai mật khẩu cũ khác nhau\n\n"+
                    "Nhấn 7 để chọn Test Case 7 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác nhưng mật khẩu\n" +
                    "mới không hợp lệ (không đảm bảo dài ngắn hoặc chứa ký tự đặc biệt hoặc giống mật khẩu\n" +
                    "cũ).\n\n "+
                    "Nhấn 8 để chọn Test Case 8 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác đầy đủ nhưng mật\n" +
                    "khẩu mới gần giống mật khẩu cũ. Xâu con chung dài nhất của hai mật khẩu chiếm 80% trở\n" +
                    "lên kích thước của mật khẩu mới.\n\n"+
                    "Nhấn 9 để chọn Test Case 9 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác nhưng mật khẩu\n" +
                    "mới giống với một mật khẩu đã được dùng từ trước đây.\n\n"+
                    "Nhấn 10 để thoát\n");

            //Chọn Test Case
            Scanner sc = new Scanner(System.in);
            String pk = sc.next();
            int pick = Integer.parseInt(pk);
            switch (pick) {
                case 1:
                    TestCaseChangePass.Unittest1(link, loginlink);
                    break;
                case 2:
                    TestCaseChangePass.Unittest2(link, loginlink);
                    break;
                case 3:
                    TestCaseChangePass.Unittest3(link, loginlink);
                    break;
                case 4:
                    TestCaseChangePass.Unittest4(link, loginlink);
                    break;
                case 5:
                    TestCaseChangePass.Unittest5(link, loginlink);
                    break;
                case 6:
                    TestCaseChangePass.Unittest6(link, loginlink);
                    break;
                case 7:
                    TestCaseChangePass.Unittest7(link, loginlink);
                    break;
                case 8:
                    TestCaseChangePass.Unittest8(link, loginlink);
                    break;
                case 9:
                    TestCaseChangePass.Unittest9(link, loginlink);
                    break;
                default:
                    k = false;
                    break;
            }
        }
    }
}
