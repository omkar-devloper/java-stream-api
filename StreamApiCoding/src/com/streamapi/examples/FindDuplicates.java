package com.streamapi.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

//question:find out duplicates elements using stream api
public class FindDuplicates {
	public static void main(String[] args) {
		Integer integer[] = { 1, 2, 3, 1, 5, 6, 8, 7, 2, 20, 4, 3, 5 };
		List<Integer> list = Arrays.asList(integer);
		System.out.println("Duplicated Number From List Are:");
		HashSet<Integer> set = new HashSet<>();
		list.stream().filter((a)->set.add(a)==false).collect(Collectors.toSet()).forEach(System.out::println);
	}
}
