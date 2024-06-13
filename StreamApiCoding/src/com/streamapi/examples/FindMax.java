package com.streamapi.examples;

import java.util.Arrays;
import java.util.List;

//question:find max from list using stream api
public class FindMax {

	public static void main(String[] a) {
		Integer integer[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = Arrays.asList(integer);
		long count = list.stream().max(Integer::compare).get();
		System.out.println("Max Number Is:" + count);

	}

}
