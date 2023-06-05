
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
 
	public static void main(String[] args) {
		int a[];
		int size = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size for the array: ");
		size = sc.nextInt();
		
		a = new int[size];
		
		for (int i=0;i<a.length;i++) {
			System.out.print("Enter element for the array: ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array Before Sorting:");
		
		for (int i=0;i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		Arrays.sort(a);
		
		System.out.println("Array After Sorting:");
		
		for (int i:a) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
