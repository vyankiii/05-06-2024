package com.javaPractice;

public class Example {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
//			System.out.println("Hello");
			System.out.println(a);
//			System.out.println("World");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getMessage());
			System.err.println("Catch block");
		}
		System.out.println("last code");
	}

}
