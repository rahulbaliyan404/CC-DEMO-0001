package com.home.java8.stream.conversion;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamToWrapperStream {
	public static void main(String[] args) {
		
		IntStream intS = IntStream.of(1,2,3,4,5);
		Stream<Integer> stm1 = intS.boxed();
		
		LongStream longS =LongStream.of(10L,20L,30L,40L,50L);
		Stream<Long> stm2 = longS.boxed();
		
		DoubleStream doubleS = DoubleStream.of(1.1,2.2,3.3,4.4,5.5);
	    Stream<Double>	stm3 = doubleS.boxed();
		
	}

}
