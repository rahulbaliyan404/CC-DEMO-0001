package com.home.java8.default_method.demo2;

public class Demo1 implements Intf1, Intf2 {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.m1();
		d.m3();
		d.m2();
	}

	@Override
	public void m1() {
		Intf1.super.m1(); // This method is mandatory in this case.
	}

	public void m3() {
		Intf1.super.m1(); // This is optional method
	}
}
