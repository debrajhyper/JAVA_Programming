import java.util.Scanner;
class Calculator{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter num1 operation num2: ");
		int num1=input.nextInt;
		String s=input.next;
		int num2=input.nextInt;
		System.out.print("The Result is: ");
		switch(s){
			case +:
				System.out.println(num1+num2);
				break;
			case -:
				System.out.println(num1-num2);
				break;
			case *:
				System.out.println(num1*num2);
				break;
			case /:
				System.out.println(num1/num2);
				break;
			default:
				System.out.println("undefine");
		}
	}
}