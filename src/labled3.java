
public class labled3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //i++ or +++i is same,when there is nothing on the left hand side.
		//but if a=i++,it is post inc,a=++i is pre increment.
		pizza_shop:
		{
			//block_start:
				for(int i=1;i<=3;i++) {
					for(int j=1;j<=4;j++) {
						if(i==2 && j==2) {
							break pizza_shop;
						}
						System.out.println(i+"\t"+j);
					}
					System.out.println("\n Outside the inner loop/n");
				}
				System.out.println("outside both the loops/n");
			}//block e
			System.out.println("Outside block");
		}
		 
	}
