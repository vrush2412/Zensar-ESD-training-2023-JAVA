import java.util.Scanner;

//5) WAP to accept a double dimensional array & print largest number in every row.
public class Assignment7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number of rows");
	int  row=sc.nextInt();
	System.out.println("Enter no of columns");
	int cols=sc.nextInt();
	int arr[][]= new int[row][cols];
	System.out.println("Enter the elements of array");
	for(int i=0;i<row;i++) 
		
	
		for(int j=0;j<cols;j++)
		
			arr[i][j]=sc.nextInt();
			
			int max=Integer.MIN_VALUE;
			
			System.out.println("Max value of each row is:");
			
			for(int i=0;i<row;i++)
			{
				max=Integer.MIN_VALUE;
				for(int j=0;j<cols;j++)
				max=Math.max(max,arr[i][j]);
				System.out.println(max+"");
			}
	}
	
	
}

