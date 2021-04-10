import java.util.Scanner;
import java.util.Arrays;
public class Array5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = input.nextInt();
        int []arr = new int[n];
        fillArrayofIntegers(arr);
        printArrayofIntegers(arr);
        maxminArrayofIntergers(arr);
	}
	
	public static void fillArrayofIntegers(int[] arr){
        Scanner input = new Scanner(System.in);
        System.out.println("-------------Enter the elements-------------");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print("Element " + (i+1) + " : ");
            arr[i] = input.nextInt();
        }
    }
    
    public static void printArrayofIntegers(int[] arr){
        System.out.print("The array is : ");
        System.out.println(Arrays.toString(arr));
    }
    
    public static void maxminArrayofIntergers(int[] arr){
        Arrays.sort(arr);
        System.out.println("Max = " + arr[arr.length-1]);
        System.out.println("Min = " + arr[0]);
    }
    
}
