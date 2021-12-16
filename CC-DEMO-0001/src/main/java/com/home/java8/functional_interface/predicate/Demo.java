package com.home.java8.functional_interface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {

	public void getData() {
		Predicate<Integer> result = x -> x >= 10;
		result.test(20);
	}
	public List<Integer> getList() {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(50);
		al.add(25);
		al.add(30);
		List<Integer> res = al.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		return res;
	}

}
