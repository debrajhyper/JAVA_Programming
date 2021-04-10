import java.util.Scanner;
import java.util.Arrays;
public class Array6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = input.nextInt();
        int []arr = new int[n];
        int []temp = new int[n];
        fillArrayofIntegers(arr);
        printArrayofIntegers(arr);
        oddevenArrayofIntergers(arr,temp);
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
    
    public static void oddevenArrayofIntergers(int[] arr , int[] temp){
        int l=0, r=arr.length-1;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]%2 != 0){
                temp[l++] = arr[i];
            }
            else if(arr[i]%2 == 0){
                temp[r--] = arr[i];
            }
        }
        System.out.print("The modified array : " + Arrays.toString(temp));
    }
    
}
