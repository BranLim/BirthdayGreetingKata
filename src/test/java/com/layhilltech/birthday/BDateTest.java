package com.layhilltech.birthday;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BDateTest {

    @Test
    void givenDateInputString_whenDateIsInValidFormat_thenShouldNotThrowError() throws ParseException {
        BDate bdate = new BDate("1982/02/12");
        assertEquals(1982, bdate.getYear());
        assertEquals(2, bdate.getMonth());
        assertEquals(12, bdate.getDate());
    }
}
