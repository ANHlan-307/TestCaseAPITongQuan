package com.company;

import java.util.Scanner;

public class ChonTestAPISearch {
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
                    "Nhấn 3 để chọn Test Case 3 - Người dùng truyền đúng mã phiên đăng nhập, các tham số khác phù hợp nhưng\n" +
                    "không có kết quả nào trả về\n\n "+
                    "Nhấn 4 để chọn Test Case 4 - Người dùng truyền đúng mã phiên đăng nhập. Nhưng người dùng đã bị khóa tài khoản\n" +
                    "(do hệ thống khóa đi).\n\n"+
                    "Nhấn 5 để chọn Test Case 5 - Người dùng truyền đúng mã phiên đăng nhập, nhưng sai user id của người dùng\n\n" +
                    "Nhấn 6 để chọn Test Case 6 - Người dùng truyền đúng mã phiên đăng nhập, nhưng không có keyword\n\n" +
                    "Nhấn 7 để chọn Test Case 7 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác phù hợp.\n" +
                    "Nhưng dữ liệu trả về có trường author bị lỗi về id.\n\n" +
                    "Nhấn 8 để chọn Test Case 8 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác. Nhưng\n" +
                    "dữ liệu trả về có trường described và trường đa phương tiện bị lỗi.\n\n" +
                    "Nhấn 9 để chọn Test Case 9 - Người dùng truyền đúng mã phiên đăng nhập và các tham số khác. Nhưng\n" +
                    "dữ liệu trả về có một trong hai trường described và trường đa phương tiện bị lỗi.\n\n"+
                    "Nhấn 10 để chọn Test Case 10 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác.\n" +
                    "Có bài viết cần phải che đi hình ảnh/video không thích hợp nhưng ứng dụng bị lỗi trong việc hiển thị màn che\n" +
                    "Nhấn 11 để chọn Test Case 11 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác đầy đủ nhưng\n" +
                    "khẩu mới gần giống mật khẩu cũ. Xâu con chung dài nhất của hai mật khẩu chiếm 80% trở\n" +
                    "đang kết nối thì mạng Internet bị ngắt\n\n"+
                    "Nhấn 12 để chọn Test Case 12 - Người dùng truyền đúng mã phiên đăng nhập và các tham số.\n\n" +
                    "Nhấn 13 để chọn Test Case 13 - Người dùng truyền đúng mã phiên đăng nhập và các tham số. Nhưng đang\n" +
                    "nhìn danh sách kết quả tìm kiếm thì có những bài viết mới xuất hiện khớp với kết\n" +
                    "quả tìm kiếm.\n\n" +
                    "Nhấn 14 để chọn Test Case 14 - Người dùng truyền đúng mã phiên đăng nhập, và các tham số khác nhưng tham số\n" +
                    "index và count bị lỗi\n\n");

            //Chọn Test Case
            Scanner sc = new Scanner(System.in);
            String pk = sc.next();
            int pick = Integer.parseInt(pk);
            switch (pick) {
                case 1:
                    TestCaseSearch.Unittest1(link, loginlink);
                    break;
                case 2:
                    TestCaseSearch.Unittest2(link, loginlink);
                    break;
                case 3:
                    TestCaseSearch.Unittest3(link, loginlink);
                    break;
                case 4:
                    TestCaseSearch.Unittest4(link, loginlink);
                    break;
                case 5:
                    TestCaseSearch.Unittest5(link, loginlink);
                    break;
                case 6:
                    TestCaseSearch.Unittest6(link, loginlink);
                    break;
                case 7:
                    TestCaseSearch.Unittest7(link, loginlink);
                    break;
                case 8:
                    TestCaseSearch.Unittest8(link, loginlink);
                    break;
                case 9:
                    TestCaseSearch.Unittest9(link, loginlink);
                    break;
                case 10:
                    TestCaseSearch.Unittest10(link, loginlink);
                    break;
                case 11:
                    TestCaseSearch.Unittest11(link, loginlink);
                    break;
                case 12:
                    TestCaseSearch.Unittest12(link, loginlink);
                    break;
                case 13:
                    TestCaseSearch.Unittest13(link, loginlink);
                    break;
                case 14:
                    TestCaseSearch.Unittest14(link, loginlink);
                    break;
                default:
                    k = false;
                    break;
            }
        }
    }
}
