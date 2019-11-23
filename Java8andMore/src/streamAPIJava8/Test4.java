package streamAPIJava8;

import java.util.stream.IntStream;

public class Test4 {

	public static void main(String[] args) {
		System.out.println(IntStream
							.range(1, 5)
							.sum());

	}

}