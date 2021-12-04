package com.home.java8.functional_interface.function;

import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {

		String str = "Java";
		// Function<String, Integer> function = (x) -> str.length();
		Function<String, Integer> function = String::length;
		int result = function.apply(str);
		System.out.println(result);

	}

}
