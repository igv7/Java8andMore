package streamAPIJava8;

import java.util.stream.IntStream;

public class Test3 {

	public static void main(String[] args) {
		IntStream
		.range(1, 10)
		.skip(4)
		.forEach(x->System.out.print(x+" "));

	}

}