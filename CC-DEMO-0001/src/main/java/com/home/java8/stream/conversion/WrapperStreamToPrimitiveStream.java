package com.home.java8.stream.conversion;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class WrapperStreamToPrimitiveStream {
	
	public static void main(String[] args) {
		
		Stream<Integer> stm1 = Stream.of(1,2,3,4,5);
		
		IntStream intPrimitiveStreamMethod1 = stm1.mapToInt(x-> x.intValue());
		IntStream intPrimitiveStreamMethod2 = stm1.mapToInt(Integer :: intValue);
		
		Stream<Long> stm2 = Stream.of(10L,20L,30L,40L,50L);
		LongStream longPrimitiveStreamMethod1 = stm2.mapToLong(x-> x.longValue());
		LongStream longPrimitiveStreamMethod2 = stm2.mapToLong(Long:: longValue);
		
		Stream<Double> stm3 = Stream.of(1.1,2.2,3.3,4.4,5.5);
		DoubleStream doublePrimitiveStreamMethod1 = stm3.mapToDouble(x->x.doubleValue());
		DoubleStream doublePrimitiveStreamMethod2 = stm3.mapToDouble(Double::doubleValue);
		
		
	}

}
