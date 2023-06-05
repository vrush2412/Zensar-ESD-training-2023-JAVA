import java.util.Scanner;

public class Areaofrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   
   float Breath;
   float Length;
   System.out.println("--------------------------------------------------");
   
   System.out.println("Enter length of Rectangle: ");
   Length=sc.nextFloat();
   
   System.out.println("----------------------------------------------------");
   System.out.println("Enter Breath of Rectangle: ");
   Breath=sc.nextFloat();
   System.out.println("----------------------------------------------------");
      float area=Length*Breath;
   System.out.println("Area of Rectangle is: "+area);
   System.out.println("-----------------------------------------------------");
	}
     
}
