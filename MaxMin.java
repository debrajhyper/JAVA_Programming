import java.util.Scanner;
class MaxMin{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i,max=n,min=n;
		
		while(n>=0){
			n = input.nextInt();
			if(n>max){
				max = n;
				
			}
			else if(n<min && n>=0){
				min = n;
				
			}
		}
		System.out.println("Max = " + max + "	" + "Min = " + min);
	}
}