package javaStringVsStringBufferVsStringBuilder;

//HashCode & SCP
public class Test {

	public static void main(String[] args) {

		System.out.println("*******String Constant Pool Example*******");
		String s1 = "Hello";
		System.out.println("s1            = " + s1);
		System.out.println("s1.hashCode() = " + s1.hashCode());

		s1 = s1 + " World";
		System.out.println("s1            = " + s1);
		System.out.println("s1.hashCode() = " + s1.hashCode());
		System.out.println("******************************************");

	}

}