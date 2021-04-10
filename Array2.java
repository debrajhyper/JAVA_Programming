import java.util.Scanner;
import java.util.Arrays;
public class Array2{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = input.nextInt();
        
        int[] arr = new int[n];
        
        fillArrayofIntegers(arr);
        printArrayofIntegers(arr);
        calculationArrayofIntegers(arr);
    }
    
    public static void fillArrayofIntegers(int[] arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements of the array : ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print("Element "+ (i+1) + " : ");
            arr[i] = input.nextInt();
        }
    }
    
    public static void printArrayofIntegers(int[] arr){
        System.out.print("The array is : ");
        System.out.println(Arrays.toString(arr));
    }
    
    public static void calculationArrayofIntegers(int[] arr){
        double sum=0, product=1, average; 
        for(int i=0 ; i<arr.length ; i++){
            sum += arr[i];
            product *= arr[i];
        }
        average = sum/arr.length;
        
        System.out.println("Sum = " + (int)sum);
        System.out.println("Product = " + (int)product);
        System.out.println("Average = " + average);
    }
    
}