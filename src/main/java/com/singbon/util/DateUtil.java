package com.singbon.util;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author zch
 */
public class DateUtil {
	/**
	 获取当前系统时间
	 */
	public static String getNowTime(){
		// 设置日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		return df.format(new Date());
	}
}
