import java.util.Scanner;
class NameAge{
	public static void main(String[]args){
		System.out.print("Enter your Name and Age: ");
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println(input1.next() + " you are " + input2.nextFloat() + " years old.");
	}
}