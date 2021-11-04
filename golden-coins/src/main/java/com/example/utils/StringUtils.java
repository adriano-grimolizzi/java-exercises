package com.example.utils;

public class StringUtils {

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static String removeLastCharacter(String string) {
        return string.replaceAll(".$", "");
    }
}
