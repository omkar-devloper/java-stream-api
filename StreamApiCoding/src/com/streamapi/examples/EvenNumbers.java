package com.streamapi.examples;

import java.util.Arrays;
import java.util.List;

//question:find even numbers from given array using stream api

public class EvenNumbers {
	public static void main(String[] a) {
		Integer integer[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = Arrays.asList(integer);
		System.out.println("Even Numbers Are:");
		list.stream().filter((num) -> num % 2 == 0).forEach(System.out::println);

	}
}
