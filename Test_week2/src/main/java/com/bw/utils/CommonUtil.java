package com.bw.utils;

import java.util.regex.Pattern;

public class CommonUtil {
	//判断字符串是否为数字
	public static boolean isNumber(String src){
		return Pattern.compile("\\d+").matcher(src).matches();
	}
	//判断原字符串是否有值，空引号(空白字符串)和空格也算没值
	public static boolean hasText(String src){
		if(!src.equals("") || !src.equals(" ") || src != null){
			return true;
		}
		return false;
	}
	//根据url地址取出地址中的数字
	public static int getPlaceHolder(String url,String regex){
		String weight = Pattern.compile(regex).matcher(url).replaceAll("");
		return hasText(weight) ? Integer.parseInt(weight) : 0;
	}
}
