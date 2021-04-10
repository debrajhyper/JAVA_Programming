import java.util.Scanner;
import java.util.Arrays;
public class Array4{
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
        int max=arr[0], min=arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
    
}
