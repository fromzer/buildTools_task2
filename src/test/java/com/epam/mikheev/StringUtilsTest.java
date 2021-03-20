package com.epam.mikheev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumberPositiveTest() {
        assertTrue(StringUtils.isPositiveNumber("17"));
    }

    @Test
    void isPositiveNumberNegativeTest() {
        assertFalse(StringUtils.isPositiveNumber("-11"));
    }
}