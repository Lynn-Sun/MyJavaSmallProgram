package mysmallprogram;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaBaseUtil {

	/**
	 * 得到本地的日期时间
	 */
	public static void getLocalDate() {

		String dateStr = new Date().toLocaleString();
		System.out.println(dateStr);
	}

	/**
	 * 格式化日期时间
	 */
	public static void getFormateDate() {
		Date date = new Date();

		// 大写的HH代表24小时制
		SimpleDateFormat sdf = new SimpleDateFormat("yyy MM dd HH:mm:ss");

		String str = sdf.format(date);
		System.out.println(str);
	}

	/**
	 * 格式化字符串
	 */
	public static void formateStr() {
		String str2 = "我";
		String str1 = "你";
		String str = String.format("%s 爱 %s", str1, str2);
		System.out.println(str);
	}

	public static void main(String[] args) {
		JavaBaseUtil.getLocalDate();
		JavaBaseUtil.getFormateDate();
		JavaBaseUtil.formateStr();
	}
}
