package com.streamapi.examples;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//method2
//program to count no of alphabets and numbers from string using stream api
public class CountAlphabetNumeric2 {
	public static void main(String[] args) {
		String value = "omkarbhosale1998@gmail.com";
		Stream<Integer> list = value.chars().boxed();
		Map<String, Long> data = list.map(c -> c.intValue())
				.filter((c) -> Character.isAlphabetic(c) || Character.isDigit(c)).collect(Collectors.groupingBy(
						(c) -> Character.isAlphabetic(c) == true ? "Alphabets" : "Numeric", Collectors.counting()));
		System.out.println(data);

	}

}
