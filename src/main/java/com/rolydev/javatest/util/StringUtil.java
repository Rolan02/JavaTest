package com.rolydev.javatest.util;

public class StringUtil {
    public static String repeat(String str ,int times) {
        String result = "";
        for(int i = 0; i < times; i++) {
            result += str;
        }
        return  result;
    }

    public static class PasswordUtil {
        public enum SecurityLevel{
            WEAK,
            MEDIUM,
            STRONG
        }

        public static SecurityLevel assessPasswordSecurity(String password) {
            if (password.length() < 8) {
                return SecurityLevel.WEAK;
            }
            if (password.matches("[a-zA-Z]+")) {
                return  SecurityLevel.WEAK;
            }
            if (password.length() < 16) {
                return SecurityLevel.MEDIUM;
            }
            if (password.matches("[a-zA-Z0-9]+")) {
                return SecurityLevel.STRONG;
            }
            return SecurityLevel.STRONG;
        }
    }
}
