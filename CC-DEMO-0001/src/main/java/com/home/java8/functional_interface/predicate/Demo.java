package com.home.java8.functional_interface.predicate;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,5};
		
		//Predicate<Integer> pre = x -> arr.length >=4;
		
		Stream.of(arr).filter(x -> arr.length >2).toString();
	}

}
