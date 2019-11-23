package streamAPIJava8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test10 {

	public static void main(String[] args) throws IOException {
		Stream<String> languages = Files.lines(Paths.get("D:\\forExample/languages.txt"));
		languages
		.filter(x->x.contains("Java"))//"ipt"
		.collect(Collectors.toList())
		.forEach(x->System.out.println(x));
		languages.close();

	}

}