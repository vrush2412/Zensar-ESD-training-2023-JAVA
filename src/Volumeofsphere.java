import java.util.Scanner;

public class Volumeofsphere {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float radius;
	
	System.out.println("Enter the radius of sphere: ");
	radius=sc.nextFloat();
	
	float volume=1.33f*3.14f*radius*radius*radius;
	System.out.println("Volume os sphere is: "+volume);
	
}
}
