package Student;
import java.util.Scanner;
public class ClientStudentArray {

	//private static final Student[] Students = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 

		Student students[] = new Student[5];

		int rollNo = 0;

		String name = null;

		float percent = 0.0f;

		
		for(int i = 0; i < students.length; i++) 
		{
			System.out.print("Enter roll no.: "); 
			rollNo = sc.nextInt();
			sc.nextLine();

		System.out.print("Enter name: ");
        name = sc.nextLine();

		System.out.print("Enter percent: ");
         percent = sc.nextFloat();
        		 sc.nextLine();

		students[i] = new Student(rollNo, name, percent);

		} 
		for (int i = 0; i < students.length; i++)
		{ 
			students[i].output(); 
			}

		sc.close();

		} 
	

}
