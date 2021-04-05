package com.basic.java.test.util;

public class PasswordUtils {
    public static SecurityLevel assessPassword(String password) {
        if (password.length() < 8) {
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-zA-Z]+")) {
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-zA-Z0-9]+")) {
            return SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRONG;

    }

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }
}
