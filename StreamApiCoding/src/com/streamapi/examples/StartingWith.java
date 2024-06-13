package com.streamapi.examples;

import java.util.Arrays;
import java.util.List;

//question:find out numbers starting from 1 using stream api
public class StartingWith {

	public static void main(String[] a) {
		Integer integer[] = { 1, 2, 3, 14, 5, 6, 7, 18, 9, 10 };
		List<Integer> list = Arrays.asList(integer);
		System.out.println("Numbers Starting From 1 Are:");
		list.stream().map((num) -> num + "").filter((num) -> num.startsWith("1")).forEach(System.out::println);

	}

}
