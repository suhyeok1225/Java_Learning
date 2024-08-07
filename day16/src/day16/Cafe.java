package day16;

import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count  = 0;
		String orderList[]= new String[5];
		int total = 0;
		while(true) {
			System.out.println("===Cafe===");
			System.out.println("1.  주문하기");
			System.out.println("2.  취소하기");
			System.out.println("3.  결제하기");
			System.out.println("4.  끝내기");
			System.out.print("입력" );
			int num = sc.nextInt();
			if(num==1) {
				String menuName="";
				int menuPrice=0;
				System.out.println("1. 아메리카노\t 3800원");
				System.out.println("2. 에스프레소\t2400원");
				System.out.println("3. 카페라떼\t4200원");
				System.out.println("4. 타로밀크티\t\t5100원");
				System.out.print("주문할 매뉴번호: ");
				int menuNum=sc.nextInt();
				if(menuNum==1) {
					menuName="아메리카노";
					menuPrice=3800;
					
				}
				else if(menuNum==2) {
					menuName="에스프레소";
					menuPrice=2400;
				}
				else if(menuNum==3) {
					menuName="카페라떼";
					menuPrice=4200;
				}
				else if(menuNum==4) {
					menuName="타로밀크티";
					menuPrice=5100;
				}
				else {
					System.out.println("잘못입력하셨습니다.");
					continue;
				}		
				total+=menuPrice;
				orderList[count]=menuName;
				count++;
				System.out.println("주문한 메뉴는"+menuName+"입니다.");
				System.out.println("가격은"+menuPrice+"원 입니다" );
				}
			else if(num==2) {
				System.out.println("---주문한 메뉴 리스트---");
				for(int i=0; i<count; i++) {
					System.out.println(i+1+","+orderList[i]);
				}
				System.out.println("취소할 메뉴번호:");
				int cancelNum=sc.nextInt();
				int delMenu=sc.nextInt();
				if(1<=cancelNum && cancelNum<=count ) {
					String delMunu=orderList[cancelNum=-1];
					System.out.println(delMenu+"메뉴 삭제!");
					for(int i=cancelNum-1; i<count; i++) {
						orderList[i]= orderList[i+1];
					}
					if(delMenu.equals("아메리카노")) {
						total=3800;
					}
					else if(delMenu.equals("에스프레소")) {
						total=2400;
					}
					else if(delMenu.equals("카페라떼")) {
						total=4200;
					}
					else if(delMenu.equals("타로밀크티")) {
						total=5100;
					}
					count--;
					}
				}
			
			else if(num==3) {
				System.out.println("결제할 금액:"+total+"원");
				System.out.print("지불할 금액:");
				int money=sc.nextInt();
				if(money<total) {
					System.out.println("잔돈이 부족합니다.");
					continue;
				}
				else {
					System.out.println("잔돈은"+(money- total)+"원 입니다");
					total=0;
					for(int i=0; i<5; i++) {
						orderList[i]="";
					}
					count=0;
				}
			}
			else if(num==4) {
				System.out.println("반복종료!");
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
				
			
		}
	}

}
