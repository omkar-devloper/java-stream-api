package com.streamapi.examples;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//program to sort list in descending order using stream api
public class SortedDescendingOrder {
	public static void main(String[] args) {
		Integer integer[] = {22,10,44,1,23,70,100};
		List<Integer> list = Arrays.asList(integer);
		System.out.println("Sorted List Descending Order:");
		list.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(System.out::println);
	}
}
