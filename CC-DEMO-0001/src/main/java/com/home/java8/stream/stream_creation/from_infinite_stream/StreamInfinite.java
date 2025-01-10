package com.home.java8.stream.stream_creation.from_infinite_stream;

import java.util.stream.Stream;

public class StreamInfinite {
	
	public static void main(String[] args) {
		
		Stream<Integer> stm = Stream.generate(() ->1);
		
		//int x=0;
		//Stream<Integer> stm1 = Stream.iterate(1, x+1);
	}

}
