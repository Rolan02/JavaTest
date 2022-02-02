package com.rolydev.javatest.util;

import org.junit.jupiter.api.Test;

import static com.rolydev.javatest.util.PasswordUtil.SecurityLevel.WEAK;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_than_8_letter() {
        assertEquals(WEAK,PasswordUtil.assessPasswordSecurity("1234567"));
    }
}