import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String name  = input.nextLine();
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<=name.length();j++) {
				System.out.println(name.substring(i,j));
			}
		}
	}
	
}
