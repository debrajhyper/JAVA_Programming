class Assignment4{
	public static void main(String []args){
		try{
			int a=100;
			System.out.println("A: "+a);
			int s = a/0;
			try{
				int arr[] = new int[5];
				arr[40]=5;
				System.out.println("arr[40]: "+arr[40]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Error in nested try");
			}
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
			System.out.println("Error in the code");
		}
		catch(Exception e){
			System.out.println("Error!!");
		}
	}
}