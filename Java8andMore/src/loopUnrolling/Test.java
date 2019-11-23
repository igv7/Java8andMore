package loopUnrolling;

//HotSpot
public class Test {

	public static void main(String[] args) {
		System.out.println("START");
		int[] arr = new int[5];

		long t0 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {

			for (int j = 0; j < arr.length; j++) {
				arr[j] = (int) (Math.random() * 10);
			}
		}
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			arr[0] = (int) (Math.random() * 10);
			arr[1] = (int) (Math.random() * 10);
			arr[2] = (int) (Math.random() * 10);
			arr[3] = (int) (Math.random() * 10);
			arr[4] = (int) (Math.random() * 10);
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Loop   rolling took : " + (t1 - t0) + " ms");
		System.out.println("Loop unrolling took : " + (t2 - t1) + " ms");

		System.out.println("END");

	}

}