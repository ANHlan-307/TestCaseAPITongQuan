package com.company;

import java.util.Scanner;

//Lớp chứa các tham số cần nhập từ bàn phím để gọi tới API tương ứng
//Mỗi lớp static bên trong lớp Input tương ứng với tham số cần nhập của API đó

public class Input {
    public static class SignUp {
        static String phonenumber;
        static String password;
        static String uuid;

        public static void nhap() {
            // Tạo ra đối tượng sc thuộc lớp Scanner để nhập dữ liệu
            System.out.println("Phonenumber: ");
            Scanner sc1 = new Scanner(System.in);
            phonenumber = sc1.next();
            System.out.println("Password: ");
            password = sc1.next();
            System.out.println("UUID: ");
            uuid = sc1.next();
        }
    }

    public static class Login {
        static String phonenumber;
        static String password;
        static String uuid;

        public static void nhap() {
            // Tạo ra đối tượng sc thuộc lớp Scanner để nhập dữ liệu
            System.out.println("Phonenumber: ");
            Scanner sc1 = new Scanner(System.in);
            phonenumber = sc1.next();
            System.out.println("Password: ");
            password = sc1.next();
            System.out.println("UUID: ");
            uuid = sc1.next();
        }
    }


    public static class Change_pass {
        static String newpass;
        static String password;

        public static void nhap() {
            // Tạo ra đối tượng sc thuộc lớp Scanner để nhập dữ liệu
            System.out.println("New password: ");
            Scanner sc1 = new Scanner(System.in);
            newpass = sc1.next();
            System.out.println("Password: ");
            password = sc1.next();
        }
    }

    public static class Set_Block{
        static String user_id;
        static String type;
        public static void nhap() {
            // Tạo ra đối tượng sc thuộc lớp Scanner để nhập dữ liệu
            System.out.println("User_id to block: ");
            Scanner sc1 = new Scanner(System.in);
            user_id = sc1.next();
            System.out.println("Type: ");
            type = sc1.next();
        }
    }

    public static class Get_verify_code{
        static String phonenumber;
        public static void nhap() {

        }
    }



}
