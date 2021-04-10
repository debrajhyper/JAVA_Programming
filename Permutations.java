
public class Permutations {
	
	private static void PermutationsCheack(String name) {
		int n =name.length();
		int f = factorial(n);
		
		for(int i=0 ; i<f ; i++) {
			int temp = i;
			StringBuilder str = new StringBuilder(name);
			
			for(int div=n ; div>=1 ; div--) {
				int q = temp / div;
				int r = temp % div;
				
				System.out.print( str.charAt(r) );
				str.deleteCharAt(r);
				
				temp = q;
			}
			
			System.out.println();
		}
	}
	
	private static int factorial (int n) {
		int val = 1;
		for(int i = 2 ; i<=n ; i++) {
			val *= i;
		}
		System.out.println(val);
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "abc";
		PermutationsCheack(name);
	}

}
