package com.company;

//Lớp chứa các test case của api check verify code
//6 test cases

public class TestCaseCheckverifycode {
    public static void Unittest1(String linkurl,String verifycode ) throws Exception {
        System.out.println("Test Case 1: ");

        ResponseCheck_verify_code rescheck = callAPI.callAPCheckVC(Input.SignUp.phonenumber, verifycode, linkurl);
        if ((!"1000".equals(rescheck.code))) throw new AssertionError("wrong code");
        if ((!"OK".equals(rescheck.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");


    }

    public static void Unittest2(String linkurl, String verifycode) throws Exception {
        System.out.println("Test Case 2: ");

        ResponseCheck_verify_code rescheck = callAPI.callAPCheckVC(Input.SignUp.phonenumber.replace("0", "9"), verifycode, linkurl);
        if ((!"1004".equals(rescheck.code))) throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(rescheck.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");

    }

    public static void Unittest3(String linkurl, String verifycode) throws Exception {
        System.out.println("Test Case 3: ");

        ResponseCheck_verify_code rescheck = callAPI.callAPCheckVC(Input.SignUp.phonenumber.replaceAll(Input.SignUp.phonenumber, "0911765111"), verifycode, linkurl);
        if ((!"1004".equals(rescheck.code))) throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(rescheck.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");

    }

    public static void Unittest4(String linkurl, String verifycode) throws Exception {
        System.out.println("Test Case 4: ");

        ResponseCheck_verify_code rescheck = callAPI.callAPCheckVC(Input.SignUp.phonenumber, verifycode, linkurl);

        if ((!"1004".equals(rescheck.code)) && (!"9996".equals(rescheck.code))) throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(rescheck.message)) && (!"User Existed".equals(rescheck.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");
    }

    public static void Unittest5(String linkurl, String verifycode) throws Exception {
        System.out.println("Test Case 5: ");

        String phonenumber = Input.SignUp.phonenumber;

        Input.SignUp.nhap();
        String signuplink = linkurl.replace("check_verify_code", "signup");
        String get_verify_codelink = linkurl.replace("check_verify_code", "get_verify_code");
        Response ressig = callAPI.callAPISignUp(Input.SignUp.phonenumber, Input.SignUp.password, Input.SignUp.phonenumber, signuplink);

        ResponseGet_verify_code resget = callAPI.callAPIGVC(Input.SignUp.phonenumber, get_verify_codelink);

        verifycode = resget.data.verifyCode;
        ResponseCheck_verify_code rescheck = callAPI.callAPCheckVC(phonenumber, verifycode, linkurl);

        if ((!"1004".equals(rescheck.code)) && (!"9996".equals(rescheck.code))) throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(rescheck.message)) && (!"User Existed".equals(rescheck.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");
    }

    public static void Unittest6(String linkurl, String verifycode) throws Exception {
        System.out.println("Test Case 6: ");
        ResponseCheck_verify_code rescheck = callAPI.callAPCheckVC(Input.SignUp.phonenumber, "", linkurl);

        if ((!"1002".equals(rescheck.code)) && (!"9996".equals(rescheck.code))) throw new AssertionError("wrong code");
        if ((!"Parameter is not enough".equals(rescheck.message)) && (!"User Existed".equals(rescheck.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");
    }


}
