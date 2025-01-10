package com.home.java8.stream.stream_intermediate_operation.filter;

import java.util.Arrays;
import java.util.List;

public class PredicateBooleanFilter {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Rahul","Kumar","Baliyan");
		List<String> newList = list.stream().filter(x -> x.contains("Rahul")).toList();
		newList.forEach(x-> System.out.println(x));
		
	}

}
