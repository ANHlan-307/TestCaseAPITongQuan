package com.company;

public class TestCaseGetverifycode {
    public static void Unittest1( String linkurl) throws Exception{
        System.out.println("Get verify code success");
        ResponseGet_verify_code resget = callAPI.callAPIGVC(Input.SignUp.phonenumber, linkurl);

        if ((!"1000".equals(resget.code))) throw new AssertionError("wrong code");
        if ((!"OK".equals(resget.message))) throw new AssertionError("wrong message");
        System.out.println("Finished!");

    }

    public static void Unittest3(String linkurl) throws Exception{

        ResponseGet_verify_code resget1 = callAPI.callAPIGVC(Input.SignUp.phonenumber, linkurl);
        ResponseGet_verify_code resget2 = callAPI.callAPIGVC(Input.SignUp.phonenumber, linkurl);

        System.out.println("Test case 3: Verifying has been done before");
        if ((!"1009".equals(resget2.code))) throw new AssertionError("wrong code");
        if ((!"Not access".equals(resget2.message))) throw new AssertionError("wrong message");

        System.out.println("Finished");

    }
    public static void Unittest4(String linkurl) throws Exception {

        ResponseGet_verify_code resget2 = callAPI.callAPIGVC(Input.SignUp.phonenumber.replace("9", "8"), linkurl);

        System.out.println("Test case 4: Phonenumber has not been in the DB");
        if ((!"1004".equals(resget2.code)) || (!"9995".equals(resget2.code))) throw new AssertionError("wrong code");
        if ((!"Parameter value is invalid".equals(resget2.message))) throw new AssertionError("wrong message");

        System.out.println("Finished");
    }

    public static void Unittest5(String linkurl) throws Exception {

        ResponseGet_verify_code resget2 = callAPI.callAPIGVC(Input.SignUp.phonenumber.replace("0", "9"), linkurl);

        System.out.println("Test case 5: Phonenumber invalid");
        if ((!"1003".equals(resget2.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(resget2.message))) throw new AssertionError("wrong message");

        System.out.println("Finished");
    }

}
