package com.streamapi.examples;
import java.util.Arrays;
import java.util.List;
//program to sort list in ascending order using stream api
public class SortedAscending {
	public static void main(String[] args) {
		Integer integer[] = {22,10,44,1,23,70,100};
		List<Integer> list = Arrays.asList(integer);
		System.out.println("Sorted List Ascending Order:");
		list.stream().sorted().forEach(System.out::println);
	}
}
