
public class LableBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //i++ or +++i is same,when there is nothing on the left hand side.
		
		pizza_shop:
		{
			block_start:
				for(int i=1;i<=3;i++) {
					for(int j=1;j<=4;j++) {
						if(i==2 && j==2) {
							break;
						}
						System.out.println(i+"\t"+j);
					}
					System.out.println("\n Outside the inner loop");
				}
				System.out.println("outside both the loops");
			}
			System.out.println("Outside block");
		}
		 
	}


