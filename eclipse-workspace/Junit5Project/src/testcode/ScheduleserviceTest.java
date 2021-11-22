package testcode;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

import businesscode.Scheduleservice;

class ScheduleserviceTest {
// assuming current Time zone is IST.....then only test should continue
	@Test
	void testDoSchedule() {
		
		TimeZone tzone = TimeZone.getDefault();
		assumeTrue(tzone.getDisplayName().equals("India Standard Time"));
	
		//test DoSchedule method
		
		Scheduleservice ss = new Scheduleservice();
		assertTrue(ss.doSchedule());
	}

	@Test
	public void doScheduleLocaleNonUS() {

	// Assume that the current locale is India
	Locale currentLocale = Locale.getDefault();
	assumeFalse(currentLocale.equals(Locale.US));

	// Test doSchedule method
	Scheduleservice scheduleService = new Scheduleservice();
	assertTrue(scheduleService.doSchedule());

	}
	 // Assume current OS is Windows
	@Test
	void testBackupCalendar() {
		
		assumeTrue(System.getProperty("os.name").startsWith("Windows"));
		// Test doSchedule method
		Scheduleservice scheduleService = new Scheduleservice();
		assertTrue(scheduleService.backupCalendar());



	}

}
