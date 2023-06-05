import java.io.IOException;
import java.util.Date;

	public class GC {
		public static void main(String[] args) throws IOException {
			Runtime rt = Runtime.getRuntime();
			System.out.println("Total JVM memory: " + rt.totalMemory() + " bytes.");
			System.out.println("Before Memory = " + rt.freeMemory()+ " bytes.");
			
			Date d = null;
			for(int i = 1;i<=100000;i++) {
				d = new Date();
				d = null;
			}//100000 objects eligible for garbage collection.
			
			System.out.println("After Memory = " + rt.freeMemory()+ " bytes.");
			rt.gc(); // Request for garbage collection. an alternate to System.gc()
			System.out.println("After GC Memory = " + rt.freeMemory()+ " bytes.");
			
			//rt.exec("c:\\Windows\\system32\\notepad.exe");
		}
	}

//Garbage collector fress the space that is occupied by unwanted variable which dose not refer to any object in java.
//java application obtain objects in memeory as needed. it is task of garbage collector in java virtual machine to 
//automatically determine what memory is no longer been used by java application and to recycle this memory fir other uses.
//because memory is autpmatically reclaimed in JVM,java application developer are not burdened with having explicitly
//free memory objects that are not being used.
	