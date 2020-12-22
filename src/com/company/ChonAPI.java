package com.company;

import java.util.Scanner;

//Lớp để chọn API muốn test sau khi đã chọn được Host
//Lớp chứa các phương thức gọi đến các đường dẫn url của 6 Hosts
//Các phương thức chonAPIHostX (X là số nguyên từ 1-6) trả về chuỗi là link url tương ứng với API muốn kiểm tra

public class ChonAPI {
//khởi tạo
    public ChonAPI() {

    }

    //giao diện
    public int giaodien() {
        System.out.println("Nhập 1 chọn API SIGN_UP:\n" +
                "Nhập 2 chọn API GET_VERIFY_CODE\n" +
                "Nhập 3 chọn API CHECK_VERIFY_CODE\n" +
                "Nhập 4 chọn API LOG_IN: \n" +
                "Nhập 5 chọn API LOG_OUT :\n" +
                "Nhập 6 chọn API CHANGE_PASS:\n" +
                "Nhập 7 chọn API SET_BLOCK:\n" +
                "Nhập 8 chọn API CHECK_NEW_VERSION\n" +
                "Nhập 9 chọn API GET_POST\n" +
                "Nhập 10 chọn API SET_ACCEPT_FRIEND\n" +
                "Nhập 11 chọn API SEARCH\n" +
                "Nhập 12 chọn API DEL_SAVED_SEARCH\n");
        Scanner sc = new Scanner(System.in);
        String pk1 = sc.next();
        int pick0 = Integer.parseInt(pk1);
        return pick0;
    }

    public String chonAPIHost1() throws Exception {
        String url;
        int pick0 = giaodien();
        switch (pick0) {
            case 1:
                url = Constant.APInhom1.SIGN_UP;
                break;
            case 2:
                url = Constant.APInhom1.GET_VERIFY_CODE;
                break;
            case 3:
                url = Constant.APInhom1.CHECK_VERIFY_CODE;
                break;
            case 4:
                url = Constant.APInhom1.LOG_IN;
                break;
            case 5:
                url = Constant.APInhom1.LOG_OUT;
                break;
            case 6:
                url = Constant.APInhom1.CHANGE_PASS;
                break;
            case 7:
                url = Constant.APInhom1.SET_BLOCK;
                break;
            case 8:
                url = Constant.APInhom1.CHECK_NEW_VERSION;
                break;
            case 9:
                url = Constant.APInhom1.GET_POST;
                break;
            case 10:
                url = Constant.APInhom1.SET_ACCEPT_FRIEND;
                break;
            case 11:
                url = Constant.APInhom1.SEARCH;
                break;
            case 12:
                url = Constant.APInhom1.DEL_SAVED_SEARCH;
                break;
            default:
                url = Constant.APInhom1.SIGN_UP;
                System.out.println("Chưa sử dụng");
                break;
        }
        return url;
    }

    public String chonAPIHost2() {
        String url;
        int pick0 = giaodien();
        switch (pick0) {
            case 1:
                url = Constant.APInhom2.SIGN_UP;
                break;
            case 2:
                url = Constant.APInhom2.GET_VERIFY_CODE;
                break;
            case 3:
                url = Constant.APInhom2.CHECK_VERIFY_CODE;
                break;
            case 4:
                url = Constant.APInhom2.LOG_IN;
                break;
            case 5:
                url = Constant.APInhom2.LOG_OUT;
                break;
            case 6:
                url = Constant.APInhom2.CHANGE_PASS;
                break;
            case 7:
                url = Constant.APInhom2.SET_BLOCK;
                break;
            case 8:
                url = "";
                System.out.println("Không tồn tại link gọi tới API này");
                break;
            case 9:
                url = Constant.APInhom2.GET_POST;
                break;
            case 10:
                url = Constant.APInhom2.SET_ACCEPT_FRIEND;
                break;
            case 11:
                url = Constant.APInhom2.SEARCH;
                break;
            case 12:
                url = Constant.APInhom2.DEL_SAVED_SEARCH;
                break;
            default:
                url = Constant.APInhom2.SIGN_UP;
                break;
        }
        return url;
    }

    public String chonAPIHost3() {
        String url;
        int pick0 = giaodien();
        switch (pick0) {
            case 1:
                url = Constant.APInhom3.SIGN_UP;
                break;
            case 2:
                url = Constant.APInhom3.GET_VERIFY_CODE;
                break;
            case 3:
                url = Constant.APInhom3.CHECK_VERIFY_CODE;
                break;
            case 4:
                url = Constant.APInhom3.LOG_IN;
                break;
            case 5:
                url = Constant.APInhom3.LOG_OUT;
                break;
            case 6:
                url = Constant.APInhom3.CHANGE_PASS;
                break;
            case 7:
                url = Constant.APInhom3.SET_BLOCK;
                break;
            case 8:
                url = "";
                System.out.println("Không tồn tại link gọi tới API này");
                break;
            case 9:
                url = Constant.APInhom3.GET_POST;
                break;
            case 10:
                url = Constant.APInhom3.SET_ACCEPT_FRIEND;
                break;
            case 11:
                url = Constant.APInhom3.SEARCH;
                break;
            case 12:
                url = Constant.APInhom3.DEL_SAVED_SEARCH;
                break;
            default:
                url = Constant.APInhom3.SIGN_UP;
                break;
        }
        return url;
    }

    public String chonAPIHost4() {
        String url;
        int pick0 = giaodien();
        switch (pick0) {
            case 1:
                url = Constant.APInhom4.SIGN_UP;
                break;
            case 2:
                url = Constant.APInhom4.GET_VERIFY_CODE;
                break;
            case 3:
                url = Constant.APInhom4.CHECK_VERIFY_CODE;
                break;
            case 4:
                url = Constant.APInhom4.LOG_IN;
                break;
            case 5:
                url = Constant.APInhom4.LOG_OUT;
                break;
            case 6:
                url = Constant.APInhom4.CHANGE_PASS;
                break;
            case 7:
                url = "";
                System.out.println("link tới API SET_BLOCK không tồn tại");
                break;
            case 8:
                url = "";
                System.out.println("Link tới API CHECK_NEW_VERSION không tồn tại");
                break;
            case 9:
                url = Constant.APInhom4.GET_POST;
                break;
            case 10:
                url = "";
                System.out.println("Không tồn tại link gọi tới API này");
                break;
            case 11:
                url = Constant.APInhom4.SEARCH;
                break;
            case 12:
                url = Constant.APInhom4.DEL_SAVED_SEARCH;
                break;
            default:
                url = Constant.APInhom4.SIGN_UP;
                break;
        }
        return url;
    }

    public String chonAPIHost5() {
        String url;
        int pick0 = giaodien();
        switch (pick0) {
            case 1:
                url = Constant.APInhom5.SIGN_UP;
                break;
            case 4:
                url = Constant.APInhom5.LOG_IN;
                break;
            case 5:
                url = Constant.APInhom5.LOG_OUT;
                break;
            case 6:
                url = Constant.APInhom5.CHANGE_PASS;
                break;
            case 7:
                url = "Constant.APInhom5.SET_BLOCK không tồn tại";
                break;
            case 8:
                url = Constant.APInhom5.CHECK_NEW_VERSION;
                break;
            case 2:
                url = Constant.APInhom5.GET_VERIFY_CODE;
                break;
            case 3:
                url = Constant.APInhom5.CHECK_VERIFY_CODE;
                break;
            case 9:
                url = Constant.APInhom5.GET_POST;
                break;
            case 10:
                url = Constant.APInhom5.SET_ACCEPT_FRIEND;
                break;
            case 11:
                url = Constant.APInhom5.SEARCH;
                break;
            case 12:
                url = Constant.APInhom5.DEL_SAVED_SEARCH;
                break;
            default:
                url = Constant.APInhom5.SIGN_UP;
                break;
        }
        return url;
    }

    public String chonAPIHost6() throws Exception {
        String url;
        int pick0 = giaodien();
        switch (pick0) {
            case 1:
                url = Constant.APInhom6.SIGN_UP;
                break;
            case 4:
                url = Constant.APInhom6.LOG_IN;
                break;
            case 5:
                url = Constant.APInhom6.LOG_OUT;
                break;
            case 6:
                url = "Constant.APInhom6.CHANGE_PASS không tồn tại";
                break;
            case 7:
                url = "Constant.APInhom6.SET_BLOCK không tồn tại";
                break;
            case 8:
                url = "Constant.APInhom6.CHECK_NEW_VERSION không tồn tại";
                break;
            case 3:
                url = "Constant.APInhom6.GET_VERIFY_CODE không tồn tại";
                break;
            case 2:
                url = "Constant.APInhom6.CHECK_VERIFY_CODE";
                break;
            case 9:
                url = Constant.APInhom6.GET_POST;
                break;
            case 10:
                url = "Constant.APInhom6.SET_ACCEPT_FRIEND";
                break;
            case 11:
                url = "Constant.APInhom6.SEARCH";
                break;
            case 12:
                url = "Constant.APInhom6.DEL_SAVED_SEARCH";
                break;
            default:
                url = Constant.APInhom6.SIGN_UP;
                System.out.println("Chưa sử dụng");
                break;
        }
        return url;
    }
}
