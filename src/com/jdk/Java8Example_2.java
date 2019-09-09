package com.jdk;

import com.jdk.interf.Interface1;
import com.jdk.interf.Interface2;

/* 
 * default and static keyword in interfaces
 * Diamond problem & to solve need to override the method
 * 
 * @FunctionalInterface is interface with single method declared
 */
public class Java8Example_2 implements Interface1, Interface2 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

	//Java8Example_2 won't compile without having it's own log() implementation
	@Override
	public void log(String str){
		System.out.println("MyClass logging::"+str);
		Interface1.print("abc");
	}
	
	
	 public static void main(String[] args) {
		Interface1.print("test"); 
		
		Interface1 intObj1 = (test)-> {
			 System.out.println("Interface 1 called "+test);
		};
		 Interface2 intObj2 = ()-> {
			 System.out.println("Interface 2 called");
		};
		intObj1.log("test");
		intObj1.method1("Paramter");
		intObj2.method2();
	 }
}

