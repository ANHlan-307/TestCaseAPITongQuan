package com.company;

import java.util.Scanner;

//Lớp để chọn ra test case muốn kiểm tra với API Logout

public class ChonTestAPILogOut {
    static String loginlink;
    static String link;
    public static void TestLogout() throws Exception {
        boolean k = true;
        while (k) {
            //Giao diện hiển thị
            System.out.println("Nhấn 1 để chọn Test Case 1 - Người dùng chỉ đăng nhập trên một thiết bị và sau đó đăng xuất.\n\n "+
                    "Nhấn 2 để chọn Test Case 2 - Người dùng đăng nhập trên máy A, sau đó tắt mạng. Rồi đăng nhập trên máy B. Tiếp\n" +
                    "theo mở mạng của máy A ra và (push chưa kịp chuyển về máy A hoặc nhóm không\n" +
                    "làm push) đăng xuất.\n\n"+
                    "Nhấn 3 để chọn Test Case 3 - Người dùng đăng nhập trên máy A, sau đó tắt mạng. Rồi đăng nhập trên máy B, sau đó\n" +
                    "đăng xuất trên máy B. Tiếp theo mở mạng của máy A ra và (push chưa kịp chuyển về máy\n" +
                    "A hoặc nhóm không làm push) đăng xuất.\n\n"+
                    "Nhấn 4 để chọn Test Case 4 - Người dùng đăng nhập trên máy A và ngắt kết nối mạng. Rồi đăng nhập trên máy B,\n" +
                    "rồi đăng xuất trên máy B.\n\n");

            //Chọn Test Case
            Scanner sc = new Scanner(System.in);
            String pk = sc.next();
            int pick = Integer.parseInt(pk);

            switch (pick) {
                case 1:
                    TestCaseLogout.Unittest1(  link, loginlink);
                    break;
                case 2:
                    TestCaseLogout.UnitTest2( link, loginlink);
                    break;
                case 3:
                    TestCaseLogout.UnitTest3( link, loginlink);
                    break;
                case 4:
                    TestCaseLogout.UnitTest4( link, loginlink);
                    break;
                default:
                    k = false;
                    break;
            }
        }
    }
}
