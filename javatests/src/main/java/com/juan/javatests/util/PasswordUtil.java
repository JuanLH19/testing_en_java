package com.juan.javatests.util;

public class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assessPasword(String password) {

        if(password.length() < 8)
        {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z]+")) //Establecemos un rango de letras
        {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z0-9]+")) //Establecemos un rango de letras
        {
            return SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;
    }

}
