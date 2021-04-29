package com.company;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calendardate {

    public static int intervalOf2(int count) {
        Calendar cals = Calendar.getInstance();
        cals.setTime(new Date());
        SimpleDateFormat df = new SimpleDateFormat("h:mm a");
        for (int i = 0; i < count; i++) {
            cals.add(Calendar.HOUR_OF_DAY, 2);
            String current = df.format(cals.getTime());
            System.out.println(current);
        }
        return count;
    }



}
