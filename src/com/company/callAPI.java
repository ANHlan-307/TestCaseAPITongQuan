package com.company;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//Lớp chứa các phương thức truyền tham số được nhập vào tới restFul API đã có
//SignUp, Login, Logout, ChangePass, SetBlock đã tồn tại

public class callAPI {
    //Truyền tham số tới API SignUp
    public static Response callAPISignUp(String phonenumber, String pass, String uuid, String linkurl) throws IOException {
        URL url = new URL(linkurl + "?phonenumber=" + phonenumber + "&password=" + pass + "&uuid=" + uuid);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        try (DataOutputStream writer = new DataOutputStream(conn.getOutputStream())) {

            StringBuilder content;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            Gson g = new Gson();
            System.out.println(content.toString());
            return g.fromJson(content.toString(), Response.class);
        } finally {
            conn.disconnect();
        }
    }


    //Truyền tham số tới API Logout
    public static ResponseLogin callAPILogin(String phonenumber, String password, String uuid, String linkurl) throws Exception {
        URL url = new URL(linkurl + "?phonenumber=" + phonenumber + "&password=" + password + "&uuid=" + uuid);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        try (DataOutputStream writer = new DataOutputStream(con.getOutputStream())) {

            StringBuilder content;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            Gson g = new Gson();
            System.out.println(content.toString());
            ResponseLogin t = g.fromJson(content.toString(), ResponseLogin.class);
            return t;
        } finally {
            con.disconnect();
        }
    }

//Truyền tham số tới API Logout
    public static Response callAPILogout(String token, String linkurl) throws Exception {
        URL url = new URL(linkurl + "?token=" + token);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        try (DataOutputStream writer = new DataOutputStream(con.getOutputStream())) {

            StringBuilder content;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            Gson g = new Gson();
            System.out.println(content.toString());
            return g.fromJson(content.toString(), Response.class);
        } finally {
            con.disconnect();
        }
    }

//Truyền tham số tới API Change Password
    public static Response callAPIChangePass(String new_password, String password, String token, String linkurl) throws IOException {
        URL ur = new URL(linkurl +
                "?token="+ token + "&password=" + password +"&new_password=" +new_password);
        HttpURLConnection conn = (HttpURLConnection) ur.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        try (DataOutputStream writer = new DataOutputStream(conn.getOutputStream())) {

            StringBuilder content;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            Gson g = new Gson();
            System.out.println(content.toString());
            return g.fromJson(content.toString(), Response.class);
        } finally {
            conn.disconnect();
        }

    }


    //Truyền tham số tới API Set Block
    public static Response callAPISet_Block(String user_id, String type, String token, String linkurl) throws IOException {
        URL url = new URL( linkurl +  "?token=" + token + "&user_id=" + user_id + "&type=" + type);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        try (DataOutputStream writer = new DataOutputStream(conn.getOutputStream())) {

            StringBuilder content;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            Gson g = new Gson();
            System.out.println(content.toString());
            return g.fromJson(content.toString(), Response.class);
        } finally {
            conn.disconnect();
        }
    }

    public static ResponseGet_verify_code callAPIGVC(String phonenumber, String linkurl) throws Exception {
            URL url = new URL(linkurl + "?phonenumber=" + phonenumber);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setDoOutput(true);
            try (DataOutputStream writer = new DataOutputStream(con.getOutputStream())) {
                StringBuilder content;
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
                Gson g = new Gson();
                System.out.println(content.toString());
                return g.fromJson(content.toString(), ResponseGet_verify_code.class);
            } finally {
                con.disconnect();
            }
    }

    public static ResponseCheck_verify_code callAPCheckVC(String phonenumber, String code_verify, String linkurl) throws Exception{
        URL url = new URL(linkurl + "?phonenumber=" + phonenumber + "&code_verify=" + code_verify);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        try (DataOutputStream writer = new DataOutputStream(con.getOutputStream())) {
            StringBuilder content;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            Gson g = new Gson();
            System.out.println(content.toString());
            ResponseCheck_verify_code t = g.fromJson(content.toString(), ResponseCheck_verify_code.class);
            return t;
        } finally {
            con.disconnect();
        }
    }

    public static Response callAPSet_Accept_Friend(String token, String user_id, String is_accepted, String linkurl) throws Exception{
        URL url = new URL(linkurl +
                "?token=" + token
                + "&user_id=" + user_id
                + "&is_accept=" + is_accepted);
        System.out.println("CALL API: " + url);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        try (DataOutputStream writer = new DataOutputStream(connection.getOutputStream())) {

            StringBuilder content;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()))) {
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            Gson g = new Gson();
            System.out.println(content.toString());
            return g.fromJson(content.toString(), Response.class);
        } finally {
            connection.disconnect();
        }
    }
    public static ResponseSearch callAPISearch(String token, String keyword, String user_id, int index, int count, String linkurl) throws Exception {
        URL url = new URL(linkurl + "?token=" + token + "&keyword" + keyword + "&user_id" + user_id + "&index" + index + "&count" + count);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        try (DataOutputStream writer = new DataOutputStream(con.getOutputStream())) {

            StringBuilder content;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            Gson g = new Gson();
            System.out.println(content.toString());
            return g.fromJson(content.toString(), ResponseSearch.class);
        } finally {
            con.disconnect();
        }
    }
    public static ResponseGet_Saved_Search callAPIGetSavedSearch(String token, int index, int count, String linkurl) throws Exception {
        URL url = new URL(linkurl + "?token=" + token + "&index" + index + "&count" + count);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        try (DataOutputStream writer = new DataOutputStream(con.getOutputStream())) {

            StringBuilder content;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            Gson g = new Gson();
            System.out.println(content.toString());
            return g.fromJson(content.toString(), ResponseGet_Saved_Search.class);
        } finally {
            con.disconnect();
        }
    }

    public static ResponseCheck_new_version callAPICNV(String token, String last_update, String linkurl) throws Exception {
        URL url = new URL(linkurl + "?token=" + token + "&last_update=" + last_update);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        try (DataOutputStream writer = new DataOutputStream(con.getOutputStream())) {

            StringBuilder content;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            Gson g = new Gson();
            System.out.println(content.toString());
            ResponseCheck_new_version t = g.fromJson(content.toString(), ResponseCheck_new_version.class);
            return t;
        } finally {
            con.disconnect();
        }
    }
}