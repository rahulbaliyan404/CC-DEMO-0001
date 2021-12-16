package com.home.java8.functional_interface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo {
	
	public void printData() {
		
		List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
		Consumer<Integer> consumer = System.out::println;
		list.forEach(consumer);
	}

	public void printValue() {
		String str = "Java";
		Consumer<String> consumer1 = (x) -> System.out.println(x);
		consumer1.accept(str);
	}
}
