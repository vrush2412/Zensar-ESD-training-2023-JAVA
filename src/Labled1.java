
public class Labled1 {
  public static void main(String[] args) {
	  pizza_shop:
//		{
//			block_start:
				for(int i=1;i<=3;i++) {
					for(int j=1;j<=4;j++) {
						if(i==2 && j==2) {
							break pizza_shop;
						}
						System.out.println(i+"\t"+j);
					}
					System.out.println("\n Outside the inner loop");
				}
				System.out.println("outside both the loops");
//			}
//			System.out.println("Outside block");
   }
}

