import java.util.Scanner;
class PostivePrimeNo{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any positive number : ");
		int n = input.nextInt();
		int i,sum=0;
		if(n>=0){
			for(i = 2 ; i <= n/2 ; i++){
			if(n%i == 0){
				//sum +=i;
				sum++;
				}
			}
			if(sum == 0)
				System.out.println(n + " is a prime number");
			else
				System.out.println(n + " is not a prime number");
		}
		else{
			System.out.println(n + " is not a positive integer. ");
		}
		
	}
}