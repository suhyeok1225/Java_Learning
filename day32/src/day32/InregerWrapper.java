package day32;

public class InregerWrapper {

	public static void main(String[] args) {
		Integer ii=30;
		//Integer->int
		System.out.println(ii.intValue()+3);
		//Integer->double
		System.out.println(ii.doubleValue());
		//Integer->float
		System.out.println(ii.floatValue());
		//Integer->String
		System.out.println(ii.toString()+3);
	}

}
