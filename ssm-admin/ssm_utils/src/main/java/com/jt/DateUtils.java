package com.jt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;




public class DateUtils {

    public static String formatDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String d =sdf.format(date);
        return d;
    }

    public static Date formatString(String str, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date parse = sdf.parse(str);
        return parse;
    }

}
