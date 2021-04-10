import java.util.Scanner;
class ReverseString{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = input.nextLine();
		System.out.print("Reverse of the String is : ");
		for( int i = s.length() - 1 ; i>=0 ; i--){
			System.out.print(s.charAt(i));
		}
	}
}