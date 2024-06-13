package com.streamapi.examples;
import java.util.Arrays;
import java.util.List;
//question:find total elements from list using stream api
public class TotalElements {
	public static void main(String[] a) {
		Integer integer[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = Arrays.asList(integer);
		long count=list.stream().count();
		System.out.println("Total Numbers Are:"+count);
		

	}
}
