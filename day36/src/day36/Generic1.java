package day36;

public class Generic1 {

	public static void main(String[] args) {
		Value v= new Value();
		v.typeSerch(3);
		v.typeSerch(3.14);
		v.typeSerch(3.14f);
		v.typeSerch('a');
		v.typeSerch("hello");
		v.typeSerch(true);
	}

}
class Value{
	public <T> void typeSerch(T x) {
		if(x instanceof Integer) {
			System.out.println(x+"는 정수입니다.");
		}
		else if(x instanceof Double ||  x instanceof Float) {
			System.out.println(x+"는 실수입니다.");
		}
		else if(x instanceof Character) {
			System.out.println(x+"는 문자형입니다.");
		}
		else if(x instanceof String) {
			System.out.println(x+"는 문자열입니다.");
		}
		else if(x instanceof Boolean) {
			System.out.println(x+"는 논리형입니다.");
		}
	}
}