import java.util.Scanner;

public class Palindrome_Substring {
	
	private static boolean isPalindrome(String ss) {
		// TODO Auto-generated method stub
		int i=0;
		int j=ss.length()-1;
		
		while(i<=j) {
			char ch1=ss.charAt(i);
			char ch2=ss.charAt(j);
			
			if(ch1 != ch2) {
				return false;
			}else {
				i++;
				j--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String name = input.nextLine();
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<=name.length();j++) {
				String ss = name.substring(i,j);
				if(isPalindrome(ss)== true) {
					System.out.println(ss);
				}
			}
		}

	}



}
