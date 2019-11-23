package finalizeMethod;

//vm argument

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person(123, "Shasha", "Kobi", 31);
		int sum = 0;
		for (int i = 0; i < 1000000; i++) {
			sum++;
		}
		System.gc();
	}

}