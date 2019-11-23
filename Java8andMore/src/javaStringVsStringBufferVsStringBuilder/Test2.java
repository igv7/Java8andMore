package javaStringVsStringBufferVsStringBuilder;

//String Buffer Vs String Builder
public class Test2 {

	public static void main(String[] args) {

		long t0 = System.currentTimeMillis();

		// StringBuffer Example
		StringBuffer sb1 = new StringBuffer("Learning Java");
		for (int i = 0; i < 1000000; i++) {
			sb1.append("It's fun");
		}
		long t1 = System.currentTimeMillis();

		// StringBuilder Example
		StringBuilder sb2 = new StringBuilder("Learning Java");
		for (int i = 0; i < 1000000; i++) {
			sb2.append("It's fun");
		}
		long t2 = System.currentTimeMillis();
		System.out.println("******************************************");
		System.out.println("Time taken - String Buffer    : " + (t1 - t0) + " ms  -----> "+"Slow, But Thread-Safe");
		System.out.println("Time taken - String Builder   : " + (t2 - t1) + " ms  -----> "+"Fast, But NOT Thread-Safe");
		System.out.println("END");
	}

}