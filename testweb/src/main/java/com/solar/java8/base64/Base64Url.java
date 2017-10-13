package com.solar.java8.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Created by hushaoge on 2017/9/28.
 */
public class Base64Url {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String encodeBase64 = Base64.getUrlEncoder().encodeToString("qwertyuiopasdfghjkl".getBytes("utf-8"));
        System.out.println(encodeBase64);

        byte[] original = Base64.getUrlDecoder().decode(encodeBase64);
        System.out.println(new String(original, "utf-8"));
    }
}
