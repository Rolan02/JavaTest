package com.rolydev.javatest.util;

public class PasswordUtil {
    public enum SecurityLevel{
        WEAK,
        MEDIUM,
        STRONG
    }

    public static SecurityLevel assessPasswordSecurity(String password) {
        if (password.length() < 8) {
            return SecurityLevel.WEAK;
        }
        if (password.length() < 16) {
            return SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRONG;
    }
}
