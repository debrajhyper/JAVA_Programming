import java.util.Scanner;
import java.util.Arrays;
public class Array1{

     public static void main(String []args){
         Scanner input = new Scanner(System.in);
        System.out.print("Enter a no between 1 - 20 : ");
        int n=input.nextInt();
        
        while(n>20 || n<=0){
            System.out.println("Invalid no , Try again : ");
            n=input.nextInt();
        }
        
        int []arr = new int[n];
        fillArrayofIntegers(arr);
        printArrayofIntegers(arr);
     }
     
     public static void fillArrayofIntegers(int[] arr){
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the elements of the array : ");
         for(int i=0 ; i<arr.length ; i++){
             arr[i] = input.nextInt();
         }
         
     }
     
     public static void printArrayofIntegers (int[] arr){
         System.out.print("The array is : ");
         System.out.print(Arrays.toString(arr));
     }
     
}
