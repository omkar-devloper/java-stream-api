package com.streamapi.examples;

import java.util.Arrays;
import java.util.List;

//question:find first element from list using stream api
public class FindFirst {
	public static void main(String[] a) {
		Integer integer[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = Arrays.asList(integer);
		System.out.println("First Element Is:");
		list.stream().findFirst().ifPresent(System.out::println);

	}
}
