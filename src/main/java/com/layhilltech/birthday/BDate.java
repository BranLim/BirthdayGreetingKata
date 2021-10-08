package com.layhilltech.birthday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BDate {

    private final Calendar birthDate;

    public BDate(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy/MM/dd");
        birthDate = Calendar.getInstance();
        birthDate.setTime(dateFormat.parse(date));
    }


    public int getYear() {
        return birthDate.get(Calendar.YEAR);
    }

    public int getMonth() {
        return birthDate.get(Calendar.MONTH) + 1;
    }


    public int getDate() {
        return birthDate.get(Calendar.DATE);
    }
}
