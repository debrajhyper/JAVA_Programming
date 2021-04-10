import java.util.Scanner;
class WhileLoop{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter a no between 1 & 10 : ");
		int n= input.nextInt();
		while(n<1 || n>10){
			System.out.print(n + " is not between 1 & 10. try again : ");
			n = input.nextInt();
			
		}
		
		System.out.print(n + " is between 1 & 10. Thanks!");
	}
}