package com.home.java8.stream.stream_creation.from_arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreationFromArray {
	public static void main(String[] args) {
		
		String [] str = {"a","b","c"};
		Stream<String>  stm = Arrays.stream(str);
		
		Integer [] intr = {1,2,3,4,5};
		Stream<Integer> stm1 =Arrays.stream(intr);
		
		Byte [] intr3 = {1,2,3,4,5};
		Stream<Byte> stm4 =Arrays.stream(intr3);
	}

}
