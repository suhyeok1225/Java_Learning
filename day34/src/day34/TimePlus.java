package day34;

import java.time.LocalDate;

public class TimePlus {

	public static void main(String[] args) {
		LocalDate Id=LocalDate.now();
		System.out.println(Id);
		LocalDate Id2=Id.minusYears(2).plusMonths(3).minusDays(4);
		System.out.println(Id2);
		
		//자동 변환
		LocalDate Id3=Id2.minusDays(3);
		System.out.println(Id3);
		
		//주 더하기
		LocalDate Id4=Id3.plusWeeks(3);
		System.out.println(Id4);
	}

}
