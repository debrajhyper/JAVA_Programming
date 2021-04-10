import java.util.Scanner;
class DoWhileLoop{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int n;
		do{
			System.out.print("enter a no between 1 & 10 : ");
			n = input.nextInt();
		}while(n<1 || n>10);
		
		System.out.print(n + " is between 1 & 10. Thanks!");
	}
}