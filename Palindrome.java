 import java.util.Scanner;
class Palindrome{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter a string : ");
		String s = input.nextLine();
		boolean result=true ;
		for( int i = 0 , r = s.length() - 1 ; i < r ;  i++, r-- ){
			result = s.charAt(i) == s.charAt(r) ? true : false ;
		}
		System.out.println( result == true ? s+ " is a palindromic string." : s+ " is not a palindromic string." );
	}
}