import java.util.Scanner;
class FibonacciNumber{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer n : ");
		int n = input.nextInt();
		int n1=1, n2=1, result=0;
		for( int i=1 ; i<= n-2 ; i++){
			result = n1 + n2;
			n1 = n2;
			n2 = result;
		}
		System.out.printf("Result = %2d", (result == 0 ? 1 : result ));
	}
}