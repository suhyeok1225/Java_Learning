package day37;

import java.util.*;

public class TimeCheck {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	LinkedList ll= new LinkedList();
	long start =System.currentTimeMillis();
	
	for(int i=0; i<1000000; i++) {
		al.add(0,String.valueOf(i));
	}
	long end=System.currentTimeMillis();
	System.out.println("ArrayList 직업시간:"+(end-start));
	
	start=System.currentTimeMillis();
	for(int i=0; i<1000000; i++) {
		ll.add(0,String.valueOf(i));
	}
	end=System.currentTimeMillis();
	System.out.println("LinkedList 작업시간:"+(end-start));
	}

}
