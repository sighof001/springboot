package com.example.demo.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
/**
 * 日期格式工具
 * @author xiaomulin
 *
 */
public class DateUtil {
	private static Logger logger = LoggerFactory.getLogger(DateUtil.class);
	//================新加================
		/**
		 * 两个时间的间隔秒
		 * 
		 * @return
		 */
		public static long secondsBetween(Date d1, Date d2) {
			return Math.abs((d1.getTime() - d2.getTime()) / 1000);
		}
	/**
	 * 当前系统时间，所有现在时间必须使用此时间
	 * @return
	 */
	public static Date now(){
		logger.debug("进入方法:now,参数无");
		logger.debug("结束方法:now,参数无");
		return new Date();
	}

	
	/**
	 * 增加天
	 * @param yyyyMMdd
	 * @param num
	 * @return
	 * @throws Exception
	 * @author LvXin
	 */
	public static String addDate(String yyyyMMdd,int num) throws Exception{
		Date oldDate = fromYyyyMMdd(yyyyMMdd);
		Date newDate = addDays(oldDate, num);
		String r = getYyyyMMdd(newDate);
		
		return r;
	}

	
	/**
	 * 增加月
	 * @param yyyyMMdd
	 * @param num
	 * @return
	 * @throws Exception
	 * @author LvXin
	 */
	public static String addMonths(String yyyyMMdd,int num) throws Exception{
		Date oldDate = fromYyyyMMdd(yyyyMMdd);
		Date newDate = addMonths(oldDate, num);
		String r = getYyyyMMdd(newDate);
		
		return r;
	}

	public static String getYyyyMMdd(){
		logger.debug("进入方法:getYyyyMMdd,参数无");
		logger.debug("结束方法:getYyyyMMdd,参数无");
		return getYyyyMMdd(now());
	}

	/**
	 * 获取日期 
	 * @author LvXin
	 * @param num 在当前日期加几天，当天之前为负数
	 * @return yyyyMMdd
	 */
	public static String getYyyyMMdd(int num){
		Date d = addDays(now(), num);
		return getYyyyMMdd(d);
	}
	public static String getYyyyMMdd(Date date){
		logger.debug("进入方法:getYyyyMMdd,参数,date:" + date);
		logger.debug("结束方法:getYyyyMMdd,参数,date:" + date);
		return new SimpleDateFormat("yyyyMMdd").format(date);
	}
	public static String getYyyy_MM_dd(){
		logger.debug("进入方法:getYyyy_MM_dd,参数无");
		logger.debug("结束方法:getYyyy_MM_dd,参数无");
		return getYyyy_MM_dd(now());
	}
	public static String getYyyy_MM_dd(Date date){
		logger.debug("进入方法:getYyyy_MM_dd,参数,date:" + date);
		logger.debug("结束方法:getYyyy_MM_dd,参数,date:" + date);
		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}
	public static String getHHmmss(){
		logger.debug("进入方法:getHHmmss,参数无");
		logger.debug("结束方法:getHHmmss,参数无");
		return getHHmmss(now());
	}
	public static String getHHmmss(Date date){
		logger.debug("进入方法:getHHmmss,参数,date:" + date);
		logger.debug("结束方法:getHHmmss,参数,date:" + date);
		return new SimpleDateFormat("HHmmss").format(date);
	}


	public static String getYyyyMMddHH(){
		return new SimpleDateFormat("yyyyMMddHH").format(now());
	}
	public static String getYyyyMMddHH(Date date){
		return new SimpleDateFormat("yyyyMMddHH").format(date);
	}
	public static String getYyyyMMddHHmmss(){
		logger.debug("进入方法:getYyyyMMddHHmmss,参数无");
		logger.debug("结束方法:getYyyyMMddHHmmss,参数无");
		return getYyyyMMddHHmmss(now());
	}
	public static String getYyyyMMddHHmmss(Date date){
		logger.debug("进入方法:getYyyyMMddHHmmss,参数,date:" + date);
		logger.debug("结束方法:getYyyyMMddHHmmss,参数,date:" + date);
		return new SimpleDateFormat("yyyyMMddHHmmss").format(date);
	}
	/**
	 * 格式当前时间
	 * yyyyMMddHHmmssSSSS
	 * @return
	 */
	public static String getYyyyMMddHHmmssSSSS(){
		logger.debug("进入方法:getYyyyMMdddHHmmssSSSS,参数无");
		logger.debug("结束方法:getYyyyMMdddHHmmssSSSS,参数无");
		return getYyyyMMddHHmmssSSSS(now());
	}
	/**
	 * 格式某时间
	 * yyyy-MM-dd HH:mm:ss
	 * @param date 要格式的时间
	 * @return
	 */
	public static String getYyyy_MM_dd_HH_mm_ss(Date date){
		logger.debug("进入方法:getYyyy_MM_dd_HH_mm_ss,参数,date:" + date);
		logger.debug("结束方法:getYyyy_MM_dd_HH_mm_ss,参数,date:" + date);
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	}
	/**
	 * 格式某时间
	 * yyyy-MM-dd HH:mm:ss
	 * @param date 要格式的时间
	 * @return
	 */
	public static String getYyyy_MM_dd_HH_mm_ss(){
		logger.debug("进入方法:getYyyy_MM_dd_HH_mm_ss,参数无");
		logger.debug("结束方法:getYyyy_MM_dd_HH_mm_ss,参数无");
		return getYyyy_MM_dd_HH_mm_ss(now());
	}
	public static String getYyyyMMddHHmmssSSSS(Date date){
		logger.debug("进入方法:getYyyyMMddHHmmssSSSS,参数,date:" + date);
		logger.debug("结束方法:getYyyyMMddHHmmssSSSS,参数,date:" + date);
		return new SimpleDateFormat("yyyyMMddHHmmssSSSS").format(date);
	}
	
	public static Date fromYyyyMMdd(String yyyyMMdd) throws ParseException{
		logger.debug("进入方法:fromYyyyMMdd,参数,yyyyMMdd:" + yyyyMMdd);
		logger.debug("结束方法:fromYyyyMMdd,参数,yyyyMMdd:" + yyyyMMdd);
		return new SimpleDateFormat("yyyyMMdd").parse(yyyyMMdd);
	}
	
	public static Date fromYyyyMMddHHmmss(String yyyyMMddHHmmss) throws ParseException{
		return new SimpleDateFormat("yyyyMMddHHmmss").parse(yyyyMMddHHmmss);
	}
	
	public static String toYyyyMMdd(String otherFormat){
		logger.debug("进入方法:toYyyyMMdd,参数,otherFormat:" + otherFormat);
		if (StringUtils.isEmpty(otherFormat)) {
			logger.debug("结束方法:toYyyyMMdd,参数,otherFormat:" + otherFormat);
			return "";
		}

		logger.debug("结束方法:toYyyyMMdd,参数,otherFormat:" + otherFormat);
		String str = otherFormat.replaceAll("-", "").replaceAll("/", "").replaceAll(" ", "").replaceAll(":", "");
		if (str.length() <= 8) {
			return str;
		}
		
		return str.substring(0,8);
	}
	
	/**
	 * yyyyMMdd to yyyy-MM-dd
	 * @param yyyyMMdd
	 * @return
	 */
	public static String yyyyMMddToYyyy_MM_dd(String yyyyMMdd){
		logger.debug("进入方法:yyyyMMddToYyyy_MM_dd,参数,yyyyMMdd:" + yyyyMMdd);
		if (yyyyMMdd == null) {
			return "";
		}

		char[] arr = yyyyMMdd.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			if (i == 3 || i == 5) {
				sb.append("-");
			}
		}

		logger.debug("结束方法:yyyyMMddToYyyy_MM_dd,参数,yyyyMMdd:" + yyyyMMdd);
		return sb.toString();
	}
	
	/**
	 * yyyyMMddHHmmss to yyyy-MM-dd HH:mm:ss
	 * @param yyyyMMddHHmmss
	 * @return
	 */
	public static String yyyyMMddHHmmssToYyyy_MM_dd_HH_mm_ss(String yyyyMMddHHmmss){
		logger.debug("进入方法:yyyyMMddHHmmssToYyyy_MM_dd_HH_mm_ss,参数,yyyyMMddHHmmss:" + yyyyMMddHHmmss);
		if (yyyyMMddHHmmss == null) {
			logger.debug("结束方法:yyyyMMddHHmmssToYyyy_MM_dd_HH_mm_ss,参数,yyyyMMddHHmmss:" + yyyyMMddHHmmss);
			return "";
		}

		char[] arr = yyyyMMddHHmmss.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			if (i == 3 || i == 5) {
				sb.append("-");
			}else if (i == 7) {
				sb.append(" ");
			}else if(i == 9 || i == 11){
				sb.append(":");
			}
		}

		logger.debug("结束方法:yyyyMMddHHmmssToYyyy_MM_dd_HH_mm_ss,参数,yyyyMMddHHmmss:" + yyyyMMddHHmmss);
		return sb.toString();
	}
	
	/**
	 * HHmmss to  HH:mm:ss
	 * @param yyyyMMddHHmmss
	 * @return
	 */
	public static String HHmmssToHH_mm_ss(String HHmmss){
		logger.debug("进入方法:HHmmssToYyyy_MM_dd_HH_mm_ss,参数,HHmmss:" + HHmmss);
		if (HHmmss == null) {
			logger.debug("结束方法:yyyyMMddHHmmssToYyyy_MM_dd_HH_mm_ss,参数,HHmmss:" + HHmmss);
			return "";
		}

		char[] arr = HHmmss.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			if (i == 1 || i == 3) {
				sb.append(":");
			}
		}

		logger.debug("结束方法:HHmmssToYyyy_MM_dd_HH_mm_ss,参数,HHmmss:" + HHmmss);
		return sb.toString();
	}
	
	
	
	/**
	 * 两个日期之间相差的天数
	 * @param begin
	 * @param end 
	 * @return end - begin
	 */
	public static int getDateDif(Date begin, Date end) {
		logger.debug("进入方法:getDateDif,参数,begin:" + begin + ",end:" + end);
		Calendar bc = Calendar.getInstance();
		bc.setTime(begin);
		Calendar ec = Calendar.getInstance();
		ec.setTime(end);

		int dif = (int)((ec.getTimeInMillis() - bc.getTimeInMillis())/1000/60/60/24);

		logger.debug("结束方法:getDateDif,参数,begin:" + begin + ",end:" + end);
		return dif;
	}
	
	/**
	 * 输入时间与当前时间的差异,以天为单位
	 * @param date 
	 * @return
	 */
	public static long getTimeDifDate(Date date){
		logger.debug("进入方法:getTimeDifDate,参数,date:" + date);
		long dateBegin = getDateBegin(date).getTime();
		long nowBegin = getDateBegin(new Date()).getTime();

		logger.debug("结束方法:getTimeDifDate,参数,date:" + date);
		return dateBegin - nowBegin;
	}
	
	
	/**
	 * 获得当天的开始
	 * @param date
	 * @return
	 */
	public static Date getDateBegin(Date date){
		logger.debug("进入方法:getDateBegin,参数,date:" + date);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);

		logger.debug("结束方法:getDateBegin,参数,date:" + date);
		return c.getTime();
	}
	
	/**
	 * 获得当天的开始
	 * @param date
	 * @return
	 */
	public static Date getDateEnd(Date date){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		c.add(Calendar.DATE, 1);
		c.add(Calendar.MILLISECOND, -1);

		return c.getTime();
	}
	
	public static String getDateBegin(String yyyyMMdd){
		return yyyyMMdd + "000000";
	}
	
	public static String getDateEnd(String yyyyMMdd){
		return yyyyMMdd + "235959";
	}

	


	
	/**
	 * 获取指定格式的系统当前时间
	 * @param dateFormat
	 * @return
	 */
	public static String getFormatDate(String dateFormat) {
		return new SimpleDateFormat(dateFormat).format(new Date());
	}
	/**
	 * 接受YYYY-MM-DD的日期字符串参数,返回两个日期相差的天数
	 * 
	 * @param start
	 * @param end
	 * @return
	 * @throws ParseException
	 */
	public static long getDistDates(String start, String end)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = sdf.parse(start);
		Date endDate = sdf.parse(end);
		return getDistDates(startDate, endDate);
	}

	/**
	 * 返回两个日期相差的天数
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws ParseException
	 */
	public static long getDistDates(Date startDate, Date endDate) {
		int result = 0;
		if (startDate != null && endDate != null) {
			long timeFrom = startDate.getTime();
			long timeTo = endDate.getTime();
			result = (int) ((timeTo - timeFrom) / (1000 * 60 * 60 * 24));
		}
		return result;
	}

	/**
	 * 将String类型的日期转换成Date类型
	 * 
	 * @param date
	 * @param parse
	 * @return
	 * @throws ParseException
	 */
	public static Date parseDate(String date, String parse)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(parse);
		return sdf.parse(date);
	}

	/**
	 * 将String类型的日期转换成Long类型
	 * <p>
	 * Title: getDate
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param date
	 * @param parse
	 * @return
	 * @throws ParseException
	 */
	public static long parseLongDate(String date, String parse)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(parse);
		return sdf.parse(date).getTime();
	}

	/**
	 * 将String类型的日期转换成Date类型，参数个数为yyyy-MM-dd
	 * 
	 * @param date
	 * @param parse
	 * @return
	 * @throws ParseException
	 */
	public static Date parseDate(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(date);
	}

	/**
	 * 将Date类型的日期转换成String类型
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 * @throws ParseException
	 */
	public static String format(Date date, String pattern)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}

	public static String format(Timestamp date, String pattern)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}

	/**
	 * 将Date类型的日期转换成String类型，格式为yyyy-MM-dd
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 * @throws ParseException
	 */
	public static String format(Date date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}

	/**
	 * 系统当天时间
	 * 
	 * @return
	 */
	public static String getCurrentDate() {
		String curDate = null;
		try {
			curDate = format(new Date(), "yyyy-MM-dd");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return curDate;
	}

	/**
	 * 增加天
	 * 
	 * @param date
	 * @return
	 */
	public static Date addDays(Date date, int num) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE, num);
		return c.getTime();
	}

	/**
	 * 增加月
	 * 
	 * @param date
	 * @return
	 */
	public static Date addMonths(Date date, int num) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH, num);
		return c.getTime();
	}

	/**
	 * 增加年
	 * 
	 * @param date
	 * @return
	 */
	public static Date addYears(Date date, int num) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.YEAR, num);
		return c.getTime();
	}

	/**
	 * 增加时
	 * 
	 * @param date
	 * @return
	 */
	public static Date addHours(Date date, int num) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.HOUR, num);
		return c.getTime();
	}

	/**
	 * 增加秒
	 * 
	 * @param date
	 * @return
	 */
	public static Date addSeconds(Date date, int num) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.SECOND, num);
		return c.getTime();
	}

	public static String getChinese(String date) {
		String cdate = null;
		if (date != null) {
			String oldPatten = "yyyy-MM-dd", newPatten = "yy年MM月dd日";
			if (date.length() >= 16) {
				oldPatten = "yyyy-MM-dd HH:mm";
				newPatten = "yy年M月d日H时m分";
			}
			SimpleDateFormat sdf1 = new SimpleDateFormat(oldPatten);
			SimpleDateFormat sdf2 = new SimpleDateFormat(newPatten);
			try {
				cdate = sdf2.format(sdf1.parse(date));
				cdate = cdate.replace("日0时0分", "日");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return cdate;
	}

	/**
	 * 获取HH:mm:ss时分秒的Long型
	 * <p>
	 * Title: getHMS
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param time
	 * @return
	 */
	public static long getHMS(String time) {
		if (time != null && time.length() > 0) {
			StringTokenizer token = new StringTokenizer(time, ":");

			int hourTime = Integer.parseInt(token.nextToken()) * 3600;
			int minute = Integer.parseInt(token.nextToken()) * 60;
			int second = Integer.parseInt(token.nextToken());

			return hourTime + minute + second;
		}
		return 0l;
	}

	/**
	 * 根据Long型的时分秒格式化成HH:mm:ss
	 * <p>
	 * Title: getHMS
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param time
	 * @return
	 */
	public static String getHMS(Long time) {
		String timeStr = "";
		if (time != null) {
			long hour = time / 3600;
			if (hour < 10)
				timeStr += "0" + hour + ":";
			else {
				timeStr += hour + ":";
			}
			long minute = (time - hour * 3600) / 60;
			if (minute < 10)
				timeStr += "0" + minute + ":";
			else {
				timeStr += minute + ":";
			}
			long second = time - hour * 3600 - minute * 60;
			if (second < 10)
				timeStr += "0" + second;
			else {
				timeStr += second;
			}
		} else {
			timeStr = "00:00:00";
		}
		return timeStr;
	}

	public static String getCnHMS(Long time) {
		String timeStr = "";
		if (time != null) {
			long hour = time / 3600;
			if (hour > 0) {
				timeStr += hour + "时";
			}
			long minute = (time - hour * 3600) / 60;
			if (minute > 0) {
				timeStr += minute + "分";
			}
			long second = time - hour * 3600 - minute * 60;
			timeStr += second + "秒";
		} else {
			timeStr = "0秒";
		}
		return timeStr;
	}
	/**
	 * 得到系统日期
	 * @param c 连接符号 
	 * 默认yyyyMMdd
	 * '-' yyyy-MM-dd
	 * '/' yyyy/MM/dd
	 * .yyyy.MM.dd
	 * t yyyy-MM-dd HH:mm:ss
	 * s yyyy-MM-dd HH:mm:ss
	 * @throws Exception
	 * @return 返回格式化以后的String日期
	 */
	public static String getSystemDate(char c) throws Exception {
		Date dt = new Date();
		SimpleDateFormat ft = null;
		switch (c) {
		case 'd':
			ft = new SimpleDateFormat("yyyyMMdd");
			break;
		case '-':
			ft = new SimpleDateFormat("yyyy-MM-dd");
			break;
		case '/':
			ft = new SimpleDateFormat("yyyy/MM/dd");
			break;
		case '.':
			ft = new SimpleDateFormat("yyyy.MM.dd");
			break;
		case 't':
			ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			break;
		case 'm':
			ft = new SimpleDateFormat("yyyyMMddHHmm");
			break;
		case 's':
			ft = new SimpleDateFormat("yyyyMMddHHmmss");
			break;
		case 'h':
			ft = new SimpleDateFormat("HHmmss");
			break;
		default:
			ft = new SimpleDateFormat("yyyyMMdd");
			break;
		}
		return ft.format(dt);
	}
	/**
	 * 系统当天时间
	 * 
	 * @return
	 */
	public static long getCurDate() {
		return new Date().getTime();
	}

	
	
	
	
	/**
	 * 获取是星期几
	 * @author LvXin
	 * @param date
	 * @return
	 */
	public static int getDayOfWeek(Date date){
		if (date == null) {
			return -1;
		}
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.get(Calendar.DAY_OF_WEEK);
	}

	public static void main(String[] args) {
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
