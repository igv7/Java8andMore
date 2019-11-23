package streamAPIJava8;

import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) {
		Stream.of("Keren","Levi","Chen","Sean","Igor")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
	

	}

}