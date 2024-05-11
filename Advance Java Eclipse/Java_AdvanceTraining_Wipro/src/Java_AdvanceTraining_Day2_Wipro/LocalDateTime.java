package Java_AdvanceTraining_Day2_Wipro;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld = LocalDate.now();

		System.out.println("Todays date is: "+1d);

		int day = ld.getDayOfMonth();

		int month = ld.getMonthValue();

		int year = ld.getYear();

		System.out.println("Today's date is: "+day+ "-" + month + "-"+year);

		LocalTime lt = LocalTime.now();

		System.out.println("Current time is: " + lt);

		int hour = lt.getHour();

		int min = lt.getMinute();

		int second = lt.getSecond();

		System.out.println("Current time is : " + hour + ":" + min + ":" + second);

		

	}


}
