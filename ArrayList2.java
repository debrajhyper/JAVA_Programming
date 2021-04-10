import java.util.*;
public class ArrayList2
{
    static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	   
		ArrayList <Integer> numbers = new ArrayList<>();
	    
	    while(true){
	        displayMenu();
	        int choice = input.nextInt();
	        
	        if(choice == 1){
	            add(numbers);
	        }
	        else if(choice == 2){
	            remove(numbers);
	        }
	        else if(choice == 3){
	            System.out.print("Your List : " + numbers);
	        }
	        else if(choice == 4){
	            System.out.println("Bye !");
	            break;
	        }
	        else{
	            System.out.println("Enter a correct choice (1-4)");
	        }
	    }
	}
	
	private static void displayMenu(){
	    System.out.println();
	    System.out.println("1. Add \n2. Remove \n3. Display \n4. Exit");
	    System.out.println();
	    System.out.print("Your Choice : ");
	}
	
	private static void add(ArrayList <Integer> numbers){
	    System.out.println("Your List : " + numbers);
	    System.out.print("Enter an integer : ");
	    numbers.add(input.nextInt());
	    System.out.println("Integer Added Successfully");
	}
	
	private static void remove(ArrayList <Integer> numbers){
	    System.out.println("Your List : " + numbers);
	    System.out.print("Enter the integer to remove : ");
	    int elementtoRemove = input.nextInt();
	    if(numbers.contains(elementtoRemove)){
	        numbers.remove(Integer.valueOf(elementtoRemove));
	        System.out.println("Integer Removed Successfully");
	    }
	    else{
	        System.out.println("Element not found !");
	    }
	}
	
}
