import java.util.Scanner;
class Pattern2{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer : ");
		int n = input.nextInt();
		for(int i = 1 ; i<=n ; i++){
			for(int j=1 ; j<=n-i ; j++){
				System.out.print(" ");
			}
			for(int j=1 ; j<=i ; j++){
				System.out.print("*" );
			}
			System.out.println();
		}
	}
}