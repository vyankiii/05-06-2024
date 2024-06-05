package com.javaExceptionHandling;

public class Example2 {

	public static void main(String[] args) {

		System.out.println("program started...!");

		String name = "Dinesh Kumar";
		System.out.println(name);

		int value1 = 200, value2 = 0;

		try {
			int result = value1 / value2;
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block");
		}

		try {
			String text = "Welcome to EH concept";
			System.out.println(text.charAt(103));
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("program ended...!");

	}

}
