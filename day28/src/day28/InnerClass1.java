package day28;

public class InnerClass1 {

	public static void main(String[] args) {
	}

}
class A{
	static class StaticInner{}
	class InstanceInner{}
	StaticInner st1= new StaticInner();
	InstanceInner ii1=new InstanceInner();
	
	static void StaitcMethod() {
		StaticInner st2=new StaticInner();
		
	}
	void InstanceMethod() {}
	StaticInner st3 =new StaticInner();
	InstanceInner ii3=new InstanceInner();
}