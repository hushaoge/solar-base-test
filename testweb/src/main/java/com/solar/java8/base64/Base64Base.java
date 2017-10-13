package com.solar.java8.base64;

import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 * Created by hushaoge on 2017/9/28.
 */
public class Base64Base {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String charsetName = "utf-8";
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 10; i++){
            sb.append(StringUtils.join("line" , i, UUID.randomUUID().toString()));
        }
        byte[] bytes = sb.toString().getBytes(charsetName);
        String encodeBase64 = Base64.getMimeEncoder().encodeToString(bytes);
        System.out.println(encodeBase64);

        byte[] original = Base64.getMimeDecoder().decode(encodeBase64);
        System.out.println(new String(original, charsetName));

        String encodeBase642 = Base64.getMimeEncoder(100, ";\r\n".getBytes(charsetName)).encodeToString(bytes);
        System.out.println(encodeBase642);
    }
}
