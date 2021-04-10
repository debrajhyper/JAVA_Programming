import java.util.Scanner;
class StrictDivisor{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = input.nextInt();
		int i,sum=0;
		for( i = 1 ; i <= n/2 ; i++){
			if(n%i == 0){
				//System.out.printf("%2d + ", i);
				sum += i;
			}
		}
		System.out.print(sum);
	}
}