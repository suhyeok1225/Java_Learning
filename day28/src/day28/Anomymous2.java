package day28;

public class Anomymous2 {

	public static void main(String[] args) {
		OuterClass1 o=new OuterClass1() {
			void a() {
				System.out.println("새롭게 정의된 익명클래스 메서드입니다");
			}
		};
		o.a();
		OuterClass1 ok=new OuterClass1();
		ok.a(); //일회성이다 2번쨰 객체에는 메스드 출력
	}

}
class OuterClass1{
	void a() {System.out.println("method a");}
	void b () {}
}