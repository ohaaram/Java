package sub6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜 : 2024/01/09
 * 이름 : 오아람
 * 내용 : Java 날짜시간 클래스 실습
 */

public class DateTest {
	public static void main(String[] args) {
		//Date 클래스
		Date date  = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//날짜 시간 형식을 만든다.
		String result=sdf.format(date);
		
		System.out.println(result);
		
		//Calendar 클래스
		//Calendar cal  = new Calendar();//싱글톤이라 객체 생성을 못함.
		
		Calendar cal = Calendar.getInstance();
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH)+1;
		int dd = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%02d-%02d %d:%d:%d",yy,mm,dd,hour,min,sec);
		
	}

}
