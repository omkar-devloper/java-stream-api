package com.streamapi.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//find the first non-repeated/non-duplicate character from given string using Stream api
public class NonRepeatedCharacter {
	public static void main(String[] a) {
		String text = "india is my country";
		String s[] = text.split("");
		List<String> list = Arrays.asList(s);
		Map<String, Long> map = list.stream().map(c -> c.trim()).filter(c -> c != "")
				.collect(Collectors.groupingBy((c) -> c, Collectors.counting()));
		System.out.println("First Non Repeated Character Is:");
		list.stream().filter((c) -> map.get(c) == 1).findFirst().ifPresent(System.out::println);
	}
}
