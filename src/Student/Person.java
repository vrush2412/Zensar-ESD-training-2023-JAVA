package Student;

public class Person {
			public static int count;
		private static Person pr;
		private int id;
		
		public Person(){
			id = ++count;
		}
		@Override
		protected void finalize() throws Throwable {
			System.out.println("finalize called for id no. " + id);
			pr = this;
			System.out.println("Object resurrected again");
			count--;
		}
	}

