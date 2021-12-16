package com.home.java8.stream.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
	public static List<Integer> getData() {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(30);
		al.add(15);
		al.add(50);
		al.add(20);
		return al;
	}

	public long getCount() {
		List<Integer> al = Demo1.getData();
		long result = al.stream().filter(x -> x < 20).count();
		return result;
	}

	public List<Integer> getList() {
		List<Integer> al = Demo1.getData();
		List<Integer> result = al.stream().map(x -> x + 1).collect(Collectors.toList());

		return result;
	}

	public List<Integer> getSortedAscList() {
		List<Integer> al = Demo1.getData();
		List<Integer> result = al.stream().sorted().collect(Collectors.toList());

		return result;
	}

	public List<Integer> getSortedDscList() {
		List<Integer> al = Demo1.getData();
		List<Integer> result = al.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());

		return result;
	}

	public Integer getMin() {
		List<Integer> al = Demo1.getData();
		Integer result = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		return result;
	}

	public Integer getMax() {
		List<Integer> al = Demo1.getData();
		Integer result = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		return result;
	}

}
