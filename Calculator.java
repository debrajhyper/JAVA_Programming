import java.util.Scanner;
class Calculator{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter num1 operation num2 ( 5 + 2 ) : ");
		double num1=input.nextDouble();
		char ch=input.next().charAt(0);
		double num2=input.nextDouble();

		if (ch == '+' ){
			System.out.println("The Result is: " + (num1+num2));
		}
		else if (ch == '-' ){
			System.out.println("The Result is: " + (num1-num2));
		}
		else if (ch == '*' ){
			System.out.println( "The Result is: " + (num1*num2));
		}
		else if (ch == '/' ){
			System.out.println("The Result is: " + (num1/num2));
		}
		else if (ch == '%' ){
			System.out.println("The Result is: " + (num1%num2));
		}
		else
			System.out.println(" Invalid Operator ");

	}
}