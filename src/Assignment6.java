//4) WAP to accept an array from user & shift. The array should be rotated to left by given shift.
public class Assignment6 {
public static void main(String[] args) {
	  int arr[]=new int[] {11,34,78,90,87};// first initialize array you want
	  int n=3;
	  // n is the no of times that array should be rotated like foe array of size 5 it should be rotated for 5 times
	  System.out.println("Your origianal array is:");
	  
	  for(int i=0;i<arr.length;i++) {
		  System.out.println(arr[i]+"");//Display your original array
	  }
	  for(int i=0;i<n;i++) //rotate array by n times towards left
		  {
		  int j,first;//to store first element of array
		  first=arr[0];
		  for(j=0;j<arr.length-1;j++) //shift element of array by 1
			  {
			  arr[j]=arr[j+1];//first element of array will be added to end of list
			  
		  }
		  arr[j]=first;
		  
	  }
	  
	  System.out.println();
	  System.out.println("Array after left rotaion: "); //display resulting array
	  
	  for(int i=0;i<arr.length;i++) {
		  System.out.println(arr[i]+"");
	  }
  }
}
