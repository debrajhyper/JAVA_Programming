import java.util.*;
public class ArrayList1
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		ArrayList <Integer> numbers = new ArrayList<>();
	    System.out.print("Enter 10 integers : ");
	    for(int i=0 ; i<10 ; i++){
	        int n = input.nextInt();
	        if(!numbers.contains(n)){
	            numbers.add(n);
	        }
	    }
	    System.out.println(numbers);
	    System.out.println("----After sorting----");
	    Collections.sort(numbers);
	    System.out.println(numbers);
	}
	
}
