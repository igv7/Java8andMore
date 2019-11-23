package escapeAnalysisExample1;

public class Test {

	public static void main(String[] args) {

		long t0 = System.nanoTime();

		Point point = new Point(10, 20);
		System.out.println(point.getX());
		System.out.println(point.getY());

		long t1 = System.nanoTime();

		int a = 10;
		int b = 10;
		System.out.println(a);
		System.out.println(b);

		long t2 = System.nanoTime();

		long firstTry = t1 - t0;
		long secondTime = t2 - t1;
		System.out.println("JVM Visited @ Heap Memory       , It took: " + (firstTry) + "  ns");
		System.out.println("JVM Escaped analysis performence, It took: " + (secondTime) + "   ns" + " Wow!");
	}

}