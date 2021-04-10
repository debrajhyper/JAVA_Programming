public class Constructor2
{
	public static void main(String[] args) {
	    Test obj = new Test();
	}
}
class Test{
    int a;
    Test(){
        int x=a=10;
        System.out.println("X = "+x);
        System.out.println("a = "+a);
        System.out.println("default constructor invoked");
    }
}