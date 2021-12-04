package com.home.java8.static_method.demo1;

public interface Intrf2 {

	default void m2() {
		System.out.println("This is Intrf2 m1() method.");
	}

	static void m1() {
		System.out.println("This is Intrf2 m1() method.");
	}

}
