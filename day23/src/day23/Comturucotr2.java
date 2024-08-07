package day23;

public class Comturucotr2 {

	public static void main(String[] args) {
		Cellphone myphone= new Cellphone();
		System.out.println(myphone.color);
	}

}
class Cellphone{
	String modle="Galaxy 8";
	String color="red";
	int capacity=60;
	Cellphone(){
		System.out.println("model:"+modle);
		System.out.println("color:"+color);
		System.out.println("capacity:"+ capacity);
	}
	
}
