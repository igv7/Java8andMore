package streamAPIJava8;

import java.util.stream.IntStream;

public class Test2 {

	public static void main(String[] args) {
		IntStream
		.range(1, 10)
		.forEach(System.out::println);

	}

}