
public class LabledContinue {
  public static void main(String[] args) {
	Outer:
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=4;j++) {
				if(i==2&& j==2) {
					continue Outer;
				}
				System.out.println(i+"\t"+j);
			}
				System.out.println("\n Outside the  inner loop");
			}
			System.out.println("Outside both the loops.");
		}

}
