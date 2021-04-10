import java.util.Scanner;
class FavNum{
	public static void main(String[]args){
		System.out.print("Enter your favourit number: ");
		Scanner input = new Scanner(System.in);
		System.out.println(input.nextInt() + " is your favourit number");
	}
}