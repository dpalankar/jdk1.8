package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Java provides some inbuilt methods to sort primitive types array or Wrapper classes array or list.*/

public class JavaObjectSorting {
	 public static void main(String[] args) {
	        //sort primitives array like int array
	        int[] intArr = {5,9,1,10};
	        Arrays.sort(intArr);
	        System.out.println(Arrays.toString(intArr));
	        
	        //sorting String array
	        String[] strArr = {"A", "C", "B", "Z", "E"};
	        Arrays.sort(strArr);
	        System.out.println(Arrays.toString(strArr));
	        
	        //sorting list of objects of Wrapper classes
	        List<String> strList = new ArrayList<String>();
	        strList.add("A");
	        strList.add("C");
	        strList.add("B");
	        strList.add("Z");
	        strList.add("E");
	        Collections.sort(strList);
	        for(String str: strList) System.out.print(" "+str);
	    }
}
