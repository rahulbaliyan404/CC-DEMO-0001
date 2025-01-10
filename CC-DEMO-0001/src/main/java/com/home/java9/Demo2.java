package com.home.java9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo2 {
	public static void main(String[] args) {
		// Demo2.demo1();
		// Demo2.demo2();
		// Demo2.demo3();
		Demo2.demo4();
	}

	public static void demo1() {
		Map<String, Integer> result = Stream.of("apple", "banana", "apple")
				.collect(Collectors.toMap(Function.identity(), s -> 1, Integer::sum, HashMap::new));
		// System.out.println(result); // Output: {apple=2, banana=1}
		result.forEach((x, y) -> System.out.println(x + " " + y)); // banana 1
																	// apple 2
	}

	public static void demo2() {
		String s = "Hezzz llb oa";
		Map<Character, Long> result = s.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
	}

	public static void demo3() {
		String s = "hello aa ghxbb";
		Map<Character, Long> result = s.chars().mapToObj(x -> (char) x).filter(ch -> !Character.isWhitespace(ch))
				.sorted().collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting())); // () -> new TreeMap<>() = TreeMap::new
		System.out.println(result);

	}

	public static void demo4() {
		List<String> words = Arrays.asList("Welcome", "to", "the", "java", "world");
		Map<Character, Long> charFrequency = words.stream() // Stream<String>
				.flatMap(a -> a.chars().mapToObj(c -> (char) c)) // Stream<Character>
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charFrequency);
	}

}
