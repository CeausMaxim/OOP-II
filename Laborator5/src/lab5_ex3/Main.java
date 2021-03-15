package lab5_ex3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (t (12));
	}
	static int t (int n) {
	    if (n != 0)
	      return (n % 2) * n + t (n - 1);
	    else
	      return 0;
	  }
} // result 36
