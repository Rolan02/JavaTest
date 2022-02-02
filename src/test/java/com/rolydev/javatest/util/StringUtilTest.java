package com.rolydev.javatest.util;

//import static org.junit.Assert.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String result = StringUtil.repeat("Hola", 3);
       if (result.equals("HolaHolaHolaa")) {
            System.out.println("OK");
       } else {
            System.out.println("FAIL");
       }
    }
}