import java.util.Arrays;

public class ArraysCopy {
  public static void main(String[] args) {
	int arr[]= {44,3,63,15,77,56};
	int a[];
	
	a=Arrays.copyOf(arr, arr.length);
	System.out.println("Array arr:");
	
	for(int i=0;i<a.length;i++) {
		System.out.println(arr[i]);
	}
	
	System.out.println("Array a:");
	
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	Arrays.fill(a,100);
	
	System.out.println("Array after filling");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
      int nArray[] = Arrays.copyOfRange(arr, 0, 3);
		
		System.out.println("nArray details:");
		for ( int i = 0; i < nArray.length; i++) {
			System.out.println(nArray[i]);
		}
		
		System.out.println("Using for-each loop:");
		for (int i:a){
			System.out.println(i);
	}
	}}


