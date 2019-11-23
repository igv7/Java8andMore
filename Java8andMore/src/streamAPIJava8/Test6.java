package streamAPIJava8;

import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {
		String[] names = { "Zamir", "Dudi", "Kobi", "Rotem", "Moshe", "Keren" };
		Arrays.stream(names)
		.filter(x -> x.startsWith("K"))
		.sorted()
		.forEach(System.out::println);

	}

}