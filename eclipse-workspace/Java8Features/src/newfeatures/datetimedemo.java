package newfeatures;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/* Java 8 introduces a new date-time API under the package java.time.
It simply change the way we have been handling dates in java applications.

Important classes introduced in java.time package

Local − Simplified date-time API with no complexity of timezone handling.

Zoned − Specialized date-time API to deal with various timezones.
*/
public class datetimedemo {

	public static void main(String[] args) {

		Date d1 = new Date();
		
		//leagcy class to deal with date & time is now deprecated
		System.out.println(d1);
		System.out.println(d1.getDate());
		System.out.println(d1.getHours() +" : "+ d1.getMinutes()+" : "+d1.getSeconds());
		
		//Calendar class
		
		Calendar cal = Calendar.getInstance();		
		System.out.println(cal.getTime());

		
		System.out.println("************ JAVA 8 DATE & TIME CLASSES***********");
		
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();
		
		System.out.println("Date & Time is:" +d+ " "+t);
		System.out.println("Before Formatting----"+dt);
		
		LocalDateTime dt2 = dt.minusDays(100);
		System.out.println(dt2);
		
		LocalDateTime dt3 = dt.plusDays(50);
		System.out.println(dt3);
		
		DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String dt1 = dt.format(format);
		
		System.out.println("After Formatting------"+dt1);
		
 
		//Java Clock class is used to provide an access to the current, 
	    //date and time using a time zone.
		
		Clock c1 = Clock.systemDefaultZone();
		System.out.println(c1.getZone());
		
		//Zoned date time--- to deal with various time zone
		ZoneId z1 = ZoneId.of("Asia/Tokyo"); 
		LocalTime t1 = LocalTime.now(z1);
		System.out.println("Japan time is: "+t1);  
	
		ZonedDateTime z2 = ZonedDateTime.now();
		System.out.println(z2.getZone()+" "+z2.getDayOfWeek());
		System.out.println(z2);
	}

}
