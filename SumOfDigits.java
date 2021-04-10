import java.util.Scanner;
class SumOfDigits{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = input.nextInt();
		int sum=0;
		while(n>0){
			sum += n%10;	//ABC
			n /= 10;		//AB
		}
		System.out.println("Sum = " + sum);
	}
}