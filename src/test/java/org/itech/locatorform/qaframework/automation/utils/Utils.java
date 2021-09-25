package org.itech.locatorform.qaframework.automation.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {
	
	public static String getCurrentDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		return formatter.format(date);
	}
	
	public static String getFutureDate() {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		return formatter.format(cal.getTime());
	}
	
	public static String getPastDate() {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH, -1);
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		return formatter.format(cal.getTime());
	}	
}
