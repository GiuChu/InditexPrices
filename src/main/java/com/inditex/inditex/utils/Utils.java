package com.inditex.inditex.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	public static String getformattedDate(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = simpleDateFormat.format(date);
		return dateString;
	}
}
