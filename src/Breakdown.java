
public class Breakdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		int i;
		for(i=1;;i++) {
	        if(i>10) {
	        	break;
	        }
	        else {
	        	System.out.println(i);
	        }
		}
		System.out.println("Out of loop i="+i);
	}

}
