import java.util.Scanner;

public class ArraySearch {
  public static void main(String[] args) {
	  int arr[];
	  int size=0;
	  int number=0;
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter size of the array: ");
		size = sc.nextInt();
		
		arr = new int[size];
		
		for(int i = 0 ; i< arr.length ; i++){
			System.out.print("Enter array element: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter element to be searched: ");
		number = sc.nextInt();
		
		
//	System.out.println("Enter element to be searched: ");
//		number =scInput.nextInt();
		
		for(int i = 0;i< arr.length ; i++){
			if(arr[i]==number){
				System.out.println("Number found at position: " + i);
				System.exit(0);//Stop the program
			}
		}
		System.out.println("Number not found!");
}
}
