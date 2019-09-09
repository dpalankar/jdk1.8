package com.jdk;

import java.text.SimpleDateFormat;
import java.util.Random;

/*
 * Java ThreadLocal is used to create thread local variables. 
 * We know that all threads of an Object share it’s variables,so the variable is not thread safe. 
 * We can use synchronization for thread safety but if we want to avoid synchronization, we can use ThreadLocal variables.
*/
public class Java8ThreadLocalExample_5 implements Runnable{
	
//	private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>(){
//        @Override
//        protected SimpleDateFormat initialValue()
//        {
//            return new SimpleDateFormat("yyyyMMdd HHmm");
//        }
//    };

//  @Override
//  public void run() {
//      System.out.println("Thread Name= "+Thread.currentThread().getName()+" default Formatter = "+formatter.get().toPattern());
//      try {
//          Thread.sleep(new Random().nextInt(1000));
//      } catch (InterruptedException e) {
//          e.printStackTrace();
//      }
//      //formatter pattern is changed here by thread, but it won't reflect to other threads
//      formatter.set(new SimpleDateFormat());
//      
//      System.out.println("Thread Name= "+Thread.currentThread().getName()+" formatter = "+formatter.get().toPattern());
//  }
    
	int i=9;
	
    private static final ThreadLocal<String> formatter = new ThreadLocal<String>(){
        @Override
        protected String initialValue()
        {
            return "Initial";
        }
    };
    
    @Override
    public void run() {
        System.out.println("Thread Name= "+Thread.currentThread().getName()+" default Formatter = "+formatter.get()+"non ThreadLocal variable "+i);
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i++;
        //formatter pattern is changed here by thread, but it won't reflect to other threads
        formatter.set("updated value");
        System.out.println("Thread Name= "+Thread.currentThread().getName()+" formatter = "+formatter.get());
    }

    public static void main(String[] args) throws InterruptedException {
    	Java8ThreadLocalExample_5 obj = new Java8ThreadLocalExample_5();
        for(int i=0 ; i<10; i++){
            Thread t = new Thread(obj,""+i);
            Thread.sleep(new Random().nextInt(1000));
            t.start();
        }
    }

}
