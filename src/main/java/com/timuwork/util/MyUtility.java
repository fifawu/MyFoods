package com.timuwork.util;

import com.timuwork.dataobject.OrderDO;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyUtility {
    public static Date changeStringToDate(String dateStr){
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date resultDate = new Date();
        try{
            resultDate=sdf1.parse(dateStr + " 22:00:00");
        }
        catch (Exception e){
            Calendar calendar= Calendar.getInstance();
            calendar.setTime(resultDate);
            calendar.add(Calendar.DAY_OF_YEAR,1);
            resultDate=calendar.getTime();
        }
        return resultDate;
    }
}
