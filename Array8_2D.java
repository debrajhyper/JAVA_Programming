import java.util.Scanner;
public class Array8_2D
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of rows and columns of the array : ");
		int r = input.nextInt();
		int c = input.nextInt();
		int[][] arr = new int[r][c];
		
		inputArray(arr);
		printArray(arr);
		maxofArray(arr);
	}
	
	public static void inputArray(int[][]  arr){
	    Scanner input = new Scanner(System.in);
	    System.out.println("-------------Enter the elements-------------");
	    for(int i=0 ; i<arr.length ; i++){
	        for(int j=0 ; j<arr[i].length ; j++){
	            arr[i][j] = input.nextInt();
	        }
	    }
	}
	
	public static void printArray(int[][] arr){
	    System.out.println("You entered : ");
	    for(int i[] : arr){
	        for(int j : i){
	            System.out.print(j + " ");
	        }
	        System.out.println();
	    }
	}
	
	public static void maxofArray(int[][] arr){
	    int a=1;
        System.out.println();
	    for(int i[] : arr){
	        int max = i[0];
	        for(int j : i){
	            max = (j>max) ? j : max;
	        }
	        System.out.println("Max of Row "+ a++ +" = " + max);
	    }
	}
}
