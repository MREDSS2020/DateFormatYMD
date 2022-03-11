package com.edss.dateformatymd;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FormatYMD {

    public static String todate(String originalDate){
        String expectedDate = "";
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = null;
        try {
            date = inputFormat.parse(originalDate);
            expectedDate = outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return expectedDate;
    }
}
