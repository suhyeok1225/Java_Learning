package day21;

public class Class_practice_3 {

	public static void main(String[] args) {
		System.out.println(Car.wheel);
		
		Car mycar1=new Car();
		System.out.println(mycar1.speed);
		
		Car mycar2=new Car();
		System.out.println("<변경 전>");
		System.out.println("mycar1.speed:"+mycar1.speed);
		System.out.println("mycar2.speed:"+mycar2.speed);
		System.out.println("mycar1.wheel"+mycar1.wheel);
		System.out.println("mycar2.wheel"+mycar2.wheel);
		
		mycar2.speed=100;
		mycar2.wheel=5;
		
		System.out.println("<변경 후>");
		System.out.println("mycar1.speed:"+mycar1.speed);
		System.out.println("mycar2.speed:"+mycar2.speed);
		System.out.println("mycar1.wheel"+mycar1.wheel);
		System.out.println("mycar2.wheel"+mycar2.wheel);

		
	}

}
class Car{
	static int wheel=4; //클래스변수
	int speed; //인스턴스 변수
	
}
