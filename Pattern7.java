import java.util.Scanner;
class Pattern7{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer : ");
		int n = input.nextInt();
		for(int i=1 ; i<=n ; i++){
			for(int j=1 ; j<=n ; j++){
				if(i==n || i==1)
					System.out.print("*");
				else if( j==1 || j==n)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}