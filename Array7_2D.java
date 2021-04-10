import java.util.Scanner;
public class Array7_2D
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of rows and columns of the array : ");
		int r = input.nextInt();
		int c = input.nextInt();
		int[][] arr = new int[r][c];
		
		inputArray(arr);
		printArray(arr);
		SumofArray(arr,r,c);
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
	
	public static void SumofArray(int[][] arr, int r, int c){
	    int a=1, sum_column=0;
        System.out.println();
	    for(int i[] : arr){
	        int sum_row=0;
	        for(int j : i){
	            sum_row += j;
	        }
	        System.out.println("Sum of " + a++ + " row = " + sum_row);
	    }
	    System.out.println();
	    for(int i=0 ; i<c ; i++){
	       for(int j=0 ; j<r ; j++){
	           sum_column += arr[j][i];
	       }
	       System.out.println("Sum of " + (i+1) + " column = " + sum_column);
	      sum_column=0; 
	   }
	}
}
