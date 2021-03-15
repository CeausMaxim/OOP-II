package exercitii;

public class clasa1 {
	static int f (int x) {
	    return x + 1;
	  }

	  static void t (int a) {
	    System.out.println (++a);
	  }

	  public static void main (String[]args) {
		  t (f (f (f (1))));
	  }
} // rezultat = 5, f(1) = 2, f(f(1)=3, f(f(f(1)=4, t(f(f(f(1)= ++4 =5. 
