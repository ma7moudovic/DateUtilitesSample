package com.brightcreations.dateutilites;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Shar2wy on 12/02/17.
 */

public class DateUtils {
    public static String getDate(Date date){

        SimpleDateFormat dateFormat = new SimpleDateFormat("kk:mm");
        return dateFormat.format(date);

    }
}
