package day27;

public class Interface1 {

	public static void main(String[] args) {
		B b=new B();
		b.methodeA();
		b.methodeB();
		
	}
}
interface Ainter{
	final int x=10;
	int y=20;
	abstract void methodeA();
	void methodeB();
}
class B implements Ainter{

	@Override
	public void methodeA() {
		System.out.println("methodeA()");
	}

	@Override
	public void methodeB() {
		System.out.println("methodeB()");
	}
}