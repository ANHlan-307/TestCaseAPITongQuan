package com.company;

import java.util.Scanner;

//Lớp nhằm mục đích chọn ra Host muốn test
//Phương thức HOST sẽ trả về chuỗi là link url tương ứng

public class ChonHost {

    //hàm trả về link url tương ứng với API đã chọn test
    public static String HOST() throws Exception {
        String linkurl;
            System.out.println("Nhập 1 chọn Host1 - nhóm Hàn Trung Kiên\n" +
                    "Nhập 2 chọn Host2 - nhóm Nguyễn Thị Thuỳ Dung\n" +
                    "Nhập 3 chọn Host3 - nhóm Lưu Quang Đông\n" +
                    "Nhập 4 chọn Host4 - nhóm Phùng Việt Duy\n" +
                    "Nhập 5 chọn Host5 - nhóm Cao Văn Duy\n" +
                    "Nhập 6 chọn Host6 -  nhóm Lê Xuân Quang\n");
            Scanner sc = new Scanner(System.in);
            String pk1 = sc.next();
            int pick0 = Integer.parseInt(pk1);
            ChonAPI api = new ChonAPI();
            switch (pick0) {

                case 1:
                    linkurl = api.chonAPIHost1();
                    break;
                case 2:
                    linkurl = api.chonAPIHost2();
                    break;
                case 3:
                    linkurl = api.chonAPIHost3();
                    break;
                case 4:
                    linkurl = api.chonAPIHost4();
                    break;
                case 5:
                    linkurl = api.chonAPIHost5();
                    break;
                case 6:
                    linkurl = api.chonAPIHost6();
                    break;
                default:
                    linkurl = api.chonAPIHost1();
                    break;
            }
            return linkurl;
    }

}
