package com.streamapi.examples;

import java.util.stream.Stream;
//method=1
//program to count no of alphabets and numbers from string using stream api
public class CountAlphabetNumeric {
	public static void main(String[] args) {
		String value = "omkarbhosale1998@gmail.com";
		Stream<Integer> list = value.chars().boxed();
		Count count_custom = list.map(c -> c.intValue())
				.filter((c) -> Character.isAlphabetic(c) || Character.isDigit(c)).map((c) -> {
					if (Character.isAlphabetic(c)) {
						return new Count(1, 0);
					} else {
						return new Count(0, 1);
					}
				}).reduce(new Count(0, 0),
						(count1, count2) -> new Count(count1.getNo_of_alphabets() + count2.getNo_of_alphabets(),
								count1.getNo_of_numeric() + count2.getNo_of_numeric()));
		System.out.println("no of alphabets:" + count_custom.getNo_of_alphabets() + " no of numerice:"
				+ count_custom.getNo_of_numeric());

	}

}

class Count {

	public Count(long no_of_alphabets, long no_of_numeric) {
		super();
		this.no_of_alphabets = no_of_alphabets;
		this.no_of_numeric = no_of_numeric;
	}

	private long no_of_alphabets = 0;
	private long no_of_numeric = 0;

	public long getNo_of_alphabets() {
		return no_of_alphabets;
	}

	public void setNo_of_alphabets(long no_of_alphabets) {
		this.no_of_alphabets = no_of_alphabets;
	}

	public long getNo_of_numeric() {
		return no_of_numeric;
	}

	public void setNo_of_numeric(long no_of_numeric) {
		this.no_of_numeric = no_of_numeric;
	}

}
