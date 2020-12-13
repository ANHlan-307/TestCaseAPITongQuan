package com.company;

public class TestCaseCheckverifycode {
    public static void Unittest1(String linkurl,String verifycode ) throws Exception {
        ResponseCheck_verify_code rescheck = callAPI.callAPCheckVC(Input.SignUp.phonenumber, verifycode, linkurl);
        if ((!"1000".equals(rescheck.code))) throw new AssertionError("wrong code");
        if ((!"OK".equals(rescheck.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");

    }

    public static void Unittest2(String linkurl, String verifycode) throws Exception {

        ResponseCheck_verify_code rescheck = callAPI.callAPCheckVC(Input.SignUp.phonenumber.replace("0", "9"), verifycode, linkurl);
        if ((!"1004".equals(rescheck.code))) throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(rescheck.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");

    }

    public static void Unittest3(String linkurl, String verifycode) throws Exception {

        ResponseCheck_verify_code rescheck = callAPI.callAPCheckVC(Input.SignUp.phonenumber.replaceAll(Input.SignUp.phonenumber, "0911765111"), verifycode, linkurl);
        if ((!"1004".equals(rescheck.code))) throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(rescheck.message))) throw new AssertionError("wrong message");
        System.out.println("Finished");

    }
}
