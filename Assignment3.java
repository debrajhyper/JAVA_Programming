//Variables
class MyVar{
	static int a=50;	//static variable or class variable
	int b=100;		//instance variable
	void area(int c){
		int d=80;
		System.out.println("Local variable 1 of MyVar: " + c);
		System.out.println("Local variable 1 of MyVar: " + d);
	}
}
//Main class
class Assignment3{
	public static void main(String[]args){
		System.out.println("Static variable of MyVar: " + MyVar.a);
		MyVar s1 = new MyVar();
		s1.area(23);
		System.out.println("Instance variable of MyVar: " + s1.b);
	}

}