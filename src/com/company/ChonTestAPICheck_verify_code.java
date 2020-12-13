package com.company;

import java.util.Scanner;

public class ChonTestAPICheck_verify_code {
    static String link;
    static String verifycode;
    public static void TestCheck_verify_code() throws Exception {
        boolean k = true;
        while (k) {
            System.out.println("Chọn Test Case: ");
            Scanner sc = new Scanner(System.in);
            String pk = sc.next();
            int pick = Integer.parseInt(pk);
            switch (pick) {
                case 1:
                    TestCaseCheckverifycode.Unittest1(link,verifycode);
                    break;
                case 2:
                    TestCaseCheckverifycode.Unittest2(link, verifycode);
                    break;
                case 3:
                    TestCaseCheckverifycode.Unittest3(link, verifycode);
                    break;
                default:
                    k=false;
                    break;
            }
        }
    }
}
