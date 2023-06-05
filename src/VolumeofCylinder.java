import java.util.Scanner;

class VolumeofCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       float radius;
       float height;
       
       
       System.out.println("Enter the radius of cylinder:");
       radius=sc.nextFloat();
       
       System.out.println("Enter the height of cylinder");
       height=sc.nextFloat();
       
        float volume= 3.14f*radius*radius*radius;
        System.out.println("Volume is:"+volume);
	}

}
