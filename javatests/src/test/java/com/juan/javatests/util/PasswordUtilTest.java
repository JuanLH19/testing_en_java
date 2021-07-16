package com.juan.javatests.util;

import org.junit.Test;

import static com.juan.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {

        assertEquals(WEAK, PasswordUtil.assessPasword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters() {

        assertEquals(WEAK, PasswordUtil.assessPasword("abcdefgh"));
    }

    @Test
    public void medium_when_has_only_letters_and_numbers() {

        assertEquals(MEDIUM, PasswordUtil.assessPasword("abcd1234"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {

        assertEquals(STRONG, PasswordUtil.assessPasword("abcd123!"));
    }

}