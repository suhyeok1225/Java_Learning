package day31;

public class StringEx1 {

	public static void main(String[] args) {
		String str="hello";
		//concat
		System.out.println( str.concat(" world"));
		System.out.println(str);
		//substring
		System.out.println(str.substring(2,4));
		System.out.println(str.substring(3));
		//length
		System.out.println(str.length());
		//toUpperCase, torowCase
		System.out.println(str.toUpperCase());
		System.out.println("TesT".toLowerCase());
		//charAt, indexOf, equals
		System.out.println(str.charAt(1));
		System.out.println("hello world".indexOf("WORLD"));//못찾을때 -1
		System.out.println(str.equals("hello"));
		//trim, replace, replaceAll
		System.out.println("  test".trim());//공백없음
		System.out.println("hello world".replace('l', 'L'));//l-L로 교체
		System.out.println("hello world".replaceAll("hello", "bye"));//hello-bye로 교체
		
	}

}
