package weakReferenceAndFriends;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Test {

	public static void main(String[] args) {

		strongReference();
		weakReference();
		softReference();
		phantomReference();
	}
	
	public static void strongReference() {
		Person p = new Person(123, "Yaakov");//Strong reference
		p = null; //mark as eligible for GC
	}
	
	public static void weakReference() {
		Person p = new Person(123, "Yaakov");//Strong reference
		WeakReference<Person> weakReference = new WeakReference<Person>(p);//Strong reference 
		System.out.println(weakReference.get());
		p = null; //mark as eligible for GC
		System.gc();
		System.out.println(weakReference.get());
	}
	
	public static void softReference() {
		Person p = new Person(123, "Yaakov");//Strong reference
		SoftReference<Person> softReference = new SoftReference<Person>(p);//Strong reference 
		System.out.println(softReference.get());
		p = null; //mark as eligible for GC
		System.gc();
		System.out.println(softReference.get());//From memory
	}
	
	public static void phantomReference() {
		Person p = new Person(123, "Yaakov");//Strong reference
		ReferenceQueue<Person> referenceQueue = new ReferenceQueue<Person>();
		PhantomReference<Person> phantomReference = new PhantomReference<Person>(p, referenceQueue);
		
		System.out.println(phantomReference.get());
		
		
	}

}