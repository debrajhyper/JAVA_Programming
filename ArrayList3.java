import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {
	
	public static boolean isPrime(int val) {
		// TODO Auto-generated method stub
		for(int i=2 ; i<val ; i++) {
			if(val % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void solution(ArrayList<Integer> al) {
		// TODO Auto-generated method stub
		for(int i=al.size()-1 ; i>=0 ; i--) {
			int val = al.get(i);
			if(isPrime(val) == true) {
				al.remove(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the arraylist : ");
		int n = input.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0 ; i<n ; i++) {
			al.add(input.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
