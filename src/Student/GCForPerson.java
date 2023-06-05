package Student;

public class GCForPerson {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM memory: "+ rt.totalMemory());
		System.out.println("Before Memory = "+ rt.freeMemory());
		Person p = null;
		
		for(int i = 1;i<=100000;i++) {
			p = new Person();
			System.out.println("Count is "+Person.count);
			p = null;
		}
		
		System.out.println("After Memory = "+ rt.freeMemory());
		rt.gc(); // an alternate to System.gc()
		System.out.println("AfterMemory = "+ rt.freeMemory());
		rt.gc(); // an alternate to System.gc()
		System.out.println("After GC Memory = "+ rt.freeMemory());
		
		System.out.println("Count after garbage collection is "+Person.count);
	}
}
