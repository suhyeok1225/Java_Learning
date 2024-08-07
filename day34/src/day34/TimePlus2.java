package day34;

import java.time.LocalDateTime;

public class TimePlus2 {

	public static void main(String[] args) {
		LocalDateTime Id=LocalDateTime.now();
		System.out.println("현재 시간:"+Id);
		LocalDateTime Id2= Id.minusHours(5).plusMinutes(30).minusSeconds(4);
		System.out.println("변경 시간: "+Id2);
		LocalDateTime Id3=Id2.minusHours(24);
		System.out.println("자동 변환 시간:"+Id3);
	}

}
