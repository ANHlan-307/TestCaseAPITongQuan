package com.company;

import java.util.Scanner;

// Lớp để chọn ra Test Case muốn kiểm tra với API Get verify code
public class ChonTestAPIGetverifycode {
    static String link;
    static String signupLink;
    public static void TestGet_verify_code() throws Exception {
        boolean k = true;
        while (k) {
            System.out.println("Chọn Test Case: ");
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
