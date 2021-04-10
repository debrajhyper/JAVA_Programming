import java.util.Scanner;
class SpaceString{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any string : ");
		String s = input.nextLine();
		for( int i=0 ; i<s.length() ; i++){
			System.out.print(s.charAt(i) + " " );
		}
	}
}