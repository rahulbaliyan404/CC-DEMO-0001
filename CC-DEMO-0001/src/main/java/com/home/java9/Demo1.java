package com.home.java9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo1 {
	
	public static void main(String[] args) {
		
//		 String text = "Hello World";
//
//	        // Using chars() to process each character
//	        text.chars()
//	            .filter(c -> !Character.isWhitespace(c)) // Filter out whitespaces
//	            .mapToObj(c -> (char) c)                 // Convert int to char
//	            .forEach(System.out::println);           // Print each character
		
		 String text = "Hello";
	       Map<Character, Long> value = text.chars()
	    		   .filter(c -> !Character.isWhitespace(c))
	            .mapToObj(c -> (char) c).sorted()
	            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	       System.out.println(value);
	       
	       // Print the result
	       value.forEach((a, b) -> 
	            System.out.println(a + ": " + b));
	       
//	       Map<Integer, String> map = new HashMap<Integer, String>();
//	       map.put(1,"z");
//	       map.put(6,"k");
//	       map.put(5,"a");
//	       map.put(3,"f");
//	       map.put(9,"c");
//	       
//	       Map<Integer, String> sortedMap =
//	    		   map.entrySet().stream()
//	    	                .sorted(Map.Entry.comparingByKey((o1,o2) -> o2-o1))
//	    	                .collect(Collectors.toMap(x-> x.getKey(), Map.Entry::getValue,
//	    	                        (e1, e2) -> e2, LinkedHashMap::new));
//	    	System.out.println(Arrays.toString(sortedMap.entrySet().toArray()));
	    	
	    	
	    	
	    	//[1=z, 3=f, 5=a, 6=k, 9=c]
	    	//[9=c, 6=k, 5=a, 3=f, 1=z]
//--------------------------------------------------------------------------------------------------------------------     
//	        IntStream intStream = IntStream.range(1, 5); // Stream of integers: 1, 2, 3, 4
//
//	        Stream<String> stringStream = intStream.mapToObj(i -> "Number " + i);
//
//	        stringStream.forEach(System.out::println);
	     // output  Number 1
	     //         Number 2
	     //         Number 3
	      //        Number 4    
	}

}
