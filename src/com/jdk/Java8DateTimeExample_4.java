package com.jdk;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

/*
 * import java.time.LocalDate;
 * LocalDate
 * LocalDate is an immutable class that represents Date with default format of yyyy-MM-dd. 
 * We can use now() method to get the current date. We can also provide input arguments for year, month and date to create LocalDate instance. 
 * This class provides overloaded method for now() where we can pass ZoneId for getting date in specific time zone. 
 * This class provides the same functionality as java.sql.Date. Let’s look at a simple example for it’s usage.
 * 
 * import java.time.LocalTime;
 * LocalTime
 * LocalTime is an immutable class whose instance represents a time in the human readable format. 
 * It’s default format is hh:mm:ss.zzz. Just like LocalDate, 
 * this class provides time zone support and creating instance by passing hour, minute and second as input arguments. 
 * Let’s look at it’s usage with a simple program.
 * 
 * java.time.LocalDateTime
 * LocalDateTime
 * LocalDateTime is an immutable date-time object that represents a date-time, with default format as yyyy-MM-dd-HH-mm-ss.zzz. 
 * It provides a factory method that takes LocalDate and LocalTime input arguments to create LocalDateTime instance. 
 * Let’s look it’s usage with a simple example.
 * 	
 * import java.time.Instant;
 * Instant
 * Instant class is used to work with machine readable time format, it stores date time in unix timestamp. 
 * Let’s see it’s usage with a simple program.
 */

public class Java8DateTimeExample_4 {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		//Get the Year, check if it's leap year
		System.out.println("Year "+today.getYear()+" is Leap Year? "+today.isLeapYear());
		
		//Compare two LocalDate for before and after
		System.out.println("Today is before 01/01/2015? "+today.isBefore(LocalDate.of(2015,1,1)));
		
		//Create LocalDateTime from LocalDate
		System.out.println("Current Time="+today.atTime(LocalTime.now()));
		
		//plus and minus operations
		System.out.println("10 days after today will be "+today.plusDays(10));
		System.out.println("3 weeks after today will be "+today.plusWeeks(3));
		System.out.println("20 months after today will be "+today.plusMonths(20));

		System.out.println("10 days before today will be "+today.minusDays(10));
		System.out.println("3 weeks before today will be "+today.minusWeeks(3));
		System.out.println("20 months before today will be "+today.minusMonths(20));
		
		//Temporal adjusters for adjusting the dates
		System.out.println("First date of this month= "+today.with(TemporalAdjusters.firstDayOfMonth()));
		LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("Last date of this year= "+lastDayOfYear);
		
		Period period = today.until(lastDayOfYear);
		System.out.println("Period Format= "+period);
		System.out.println("Months remaining in the year= "+period.getMonths());		
	}

}
