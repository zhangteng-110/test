package com.bw.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date stringToDate(String src,String pattern){
		SimpleDateFormat date = new SimpleDateFormat(pattern);
		try {
			return date.parse(src);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
