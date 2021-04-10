import java.util.Scanner;
class SumOfInt{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int n,sum=0;
		while(sum<=100){
			System.out.print("Enter a number : ");
			sum += input.nextInt();
		}
		System.out.println("Done : " + sum );
	}
}