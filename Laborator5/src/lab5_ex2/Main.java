package lab5_ex2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (t(12));
	}
	static int t (int n) {
		if (n != 0)
	      return 10 * t (n / 10) + n % 10;
	    else
	      return 0;
	  }
} // result 12
