package streamAPIJava8;

import java.util.Arrays;
import java.util.List;

public class Test8 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList( "Zamir", "Dudi", "Kobi", "Rotem", "Moshe", "Keren" );
		names
		.stream()
		.map(String::toLowerCase)
		.filter(x -> x.startsWith("k"))//Check With Capital Letter as well
		.sorted()
		.forEach(System.out::println);


	}

}