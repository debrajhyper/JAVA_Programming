import java.util.Scanner;

public class Toggle_Case_Characters2 {
	
	private static String Toggle_Case(String name) {
		// TODO Auto-generated method stub
		StringBuilder st = new StringBuilder(name);
		for(int i=0 ; i<st.length() ; i++) {
			char ch = st.charAt(i);
			if(ch>='a' && ch<='z'){
				char upch = (char) ('A' + ch - 'a');
				st.setCharAt(i, upch);
			}
			else if(ch>='A' && ch<='Z') {
				char loch = (char) ('a' + ch - 'A');
				st.setCharAt(i, loch);
			}
		}
		return st.toString();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String name = input.nextLine();
//		String name = "DeBRaj";
		System.out.println(Toggle_Case(name));
	}


}
