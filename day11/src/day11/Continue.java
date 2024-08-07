package day11;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int money=10000;
		System.out.println("현재 가진 돈은 10000원 입니다.");
		while(true) {
			System.out.println("얼마를 사용허시겠습니까?");
			int i=sc.nextInt();
			if(!(0<=i && i<= money)) {
				System.out.println("다시 입력해주세요.");
				continue;
				
			}
			System.out.printf("이제 %d원이 남았습니다.\n",money-=i);
			if(money==0) {
				break;
			}
		}
		System.out.println("모든 돈을 사용합니다.");
	}

}
