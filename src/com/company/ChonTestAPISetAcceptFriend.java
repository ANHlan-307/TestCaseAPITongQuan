package com.company;

import java.util.Scanner;

public class ChonTestAPISetAcceptFriend {
    static String signupLink;
    static String loginlink;
    static String link;
    public static void TestSetAcceptFriend() throws Exception {
        boolean k = true;
        while (k) {
            Scanner sc = new Scanner(System.in);
            String pk = sc.next();
            int pick = Integer.parseInt(pk);
            switch (pick) {
                case 1:
                    TestCaseSetAcceptFriends.Unittest1(link, loginlink);
                    break;
                default:
                    k = false;
                    break;
            }
        }
    }
}
