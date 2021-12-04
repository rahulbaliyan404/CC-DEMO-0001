package com.home.java8.static_method.demo1;

public class Demo1 implements Intrf1,Intrf2 {
	public static void main(String[] args) {
		Intrf1.m1();
		Intrf2.m1();
		Demo1 d = new Demo1();
		d.m2();
	}

	@Override
	public void m2() {
		Intrf1.super.m2();
	}
}
