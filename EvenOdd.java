import java.util.Scanner;
class EvenOdd{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the Integer: ");
	double n = input.nextDouble();
	if(n%2==0){
		System.out.println(n+" is Even no");
		}
	else{
		System.out.println(n+" is Odd no");
		}
	}
}