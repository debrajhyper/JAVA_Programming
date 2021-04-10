import java.util.Scanner;
class Pattern{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer : ");
		int n = input.nextInt();
		for(int i = 1 ; i<=n ; i++){
			for(int j=0 ; j<i ; j++){
				System.out.printf("%2d", i );
			}
			System.out.println();
		}
	}
}