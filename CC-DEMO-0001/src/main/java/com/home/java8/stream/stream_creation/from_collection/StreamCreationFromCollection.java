package com.home.java8.stream.stream_creation.from_collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationFromCollection {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> stm = list.stream();
		
		List<Integer> list2 = Arrays.asList(1,2,3,4,5);
		Stream<Integer> stm2 = list2.stream();
	}

}
