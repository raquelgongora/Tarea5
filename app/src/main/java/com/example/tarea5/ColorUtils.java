package com.example.tarea5;

public class ColorUtils {

    public static String decimalToHex (int decimal) {
        String hex = Integer.toHexString(decimal);
        if (hex.length() == 1) {
            hex = "0" + hex;
        }
        return hex;
    }

}

