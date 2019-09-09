package com.example;

import java.io.Serializable;

public class A  implements Serializable{
	private static A obj;  
	 private A(){}  
	   
	 public static A getA(){  
	   if (obj == null){  
	        if (obj == null){  
	            obj = new A();//instance will be created at request time  
	        }  
	    }              
	  return obj;  
	 }  
	  
	 public void doSomething(){  
	 //write your code  
	 }  
	 
	 protected Object readResolve() {  
         return getA();  
     } 

	public static void main(String[] args) {
		System.out.println("class loader for A1: "+ A.class.getClassLoader());
		System.out.println("class loader for A2: "+ A.class.getClassLoader());

	}

}
