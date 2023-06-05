import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
              int num=0;
              int digit=0;
              int sum=0;
              
              System.out.println("Enter the Number you want: ");
             num=sc.nextInt();
             
             while(num>0) {
            	 digit=num%10;
            	 
            	 sum=sum+digit;
            	 
            	 num=num/10;
             
            	 
             }
             System.out.println("Sum of Digits is as given: "+sum); 
	}

}
//1) WAP to accept a no. & sum its digits.
//2) WAP to accept a no. & sum its digits, till it reduces to single digit number.
//3) WAP to accept an array of 5 integers & print nos at alternate positions.

//4) WAP to accept an array from user & shift. The array should be rotated to left by given shift.
//5) WAP to accept a double dimensional array & print largest number in every row.