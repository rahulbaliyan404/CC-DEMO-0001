package com.home.java8.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {

	public static void main(String[] args) {
		int[] arr1 = { 15, 10, 60, 25, 10, 30, 10, 50 };
		List<Integer> arr = Arrays.asList(15, 10, 60, 25, 10, 30, 50);
		List<Integer> mapList = arr.stream().map(x -> x + 2).collect(Collectors.toList());
		List<Integer> newList = mapList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		List<Integer> sorted = newList.stream().sorted().collect(Collectors.toList());

		//Long max = Arrays.stream(arr1).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting())).values()
			//	.stream().max(Comparator.comparing(Function.identity())).orElse(0L);

		//System.out.println(max);

		long count = sorted.stream().count();

		// long min = newList.stream().min(null);

		// sorted.forEach(System.out::println);

		// System.out.println(count);

		Optional<Long> result = Arrays.stream(arr1)
		           .boxed()
		           .collect(Collectors.groupingBy(i->i,Collectors.counting()))
		           .values()
		           .stream()
		           .min(Comparator.comparingLong(i->i));
		
		System.out.println(result);

	}

}
