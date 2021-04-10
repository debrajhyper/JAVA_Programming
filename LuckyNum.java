import java.util.Scanner;
class LuckyNum{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = input.nextInt();
		if(!(num>999 && num<10000)){
			System.out.println(" Number is not a four-digit number ");
		}
		else{
					//ABCD
		int d = num % 10;		//4th digit ABCD % 10 = D
		int c = (num / 10) % 10;	//3rd digit ABC % 10 = C
		int b = (num / 100) % 10;	//2nd digit AB % 10 = B
		int a = (num / 1000) %10;	//1st digit A % 10 = A
		if(a+b == c+d)
			System.out.println("The Number " + num + " is a lucky number since " + a + " + " + b + " = " + c + " + " + d );
		else if(a+b != c+d)
			System.out.println("The Number " + num + " is not a lucky number since " + a + " + " + b + " != " + c + " + " + d  );
		else
			System.out.println("The Number " + num + " is not a Valid number");
		}

	}
}