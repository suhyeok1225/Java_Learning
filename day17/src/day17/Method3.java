package day17;

public class Method3 {

	public static void main(String[] args) {
		System.out.println("사각형의 넓이:"+calculator(10,20));
	}
	static int calculator(int a,int b) {
		System.out.println("계산");
		int area =a*b;
		return area;
	}

}
