package com.home.java8.static_method.demo2;

public interface Intrf {

	public static void disp() {
		System.out.println("This is intrf disp method.");
	}

	default void show() {
		System.out.println("This is default show method.");
	}

}
