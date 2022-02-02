package com.rolydev.javatest.util;

import org.junit.jupiter.api.Test;

import static com.rolydev.javatest.util.StringUtil.PasswordUtil.SecurityLevel.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_than_8_letters() {
        assertEquals(WEAK, StringUtil.PasswordUtil.assessPasswordSecurity("1234567"));
    }
    @Test
    public void weak_when_has_than_only_letters() {
        assertEquals(WEAK, StringUtil.PasswordUtil.assessPasswordSecurity("adasdad"));
    }
    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, StringUtil.PasswordUtil.assessPasswordSecurity("adasdad123"));
    }
    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(STRONG, StringUtil.PasswordUtil.assessPasswordSecurity("ASDasd123!14khvyj"));
    }

}