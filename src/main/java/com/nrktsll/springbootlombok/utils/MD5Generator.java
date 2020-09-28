package com.nrktsll.springbootlombok.utils;

import lombok.experimental.UtilityClass;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@UtilityClass
public class MD5Generator {

  public String NAME = "Static Degisken";

    public String getMD5(String data) throws NoSuchAlgorithmException {

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(data.getBytes());

        byte[] digest = messageDigest.digest();
        var builder = new StringBuilder();

        for (byte b : digest) {
            builder.append(Integer.toHexString(b & 0xff));
        }

        return builder.toString();
    }
}
