package streamAPIJava8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test9 {

	public static void main(String[] args) throws IOException {
		Stream<String> languages = Files.lines(Paths.get("C:\\Extreme/languages.txt"));
		languages.sorted()
		.filter(x->x.length()>4)
		.forEach(System.out::println);
		languages.close();

	}

}