package day34;

import java.time.LocalTime;

public class WithPrac2 {

	public static void main(String[] args) {
		LocalTime It=LocalTime.now();
		System.out.println(It);
		
		LocalTime new_time=It.withHour(3).withMinute(25).withSecond(24).withNano(33333);
		System.out.println(new_time);
	}

}
