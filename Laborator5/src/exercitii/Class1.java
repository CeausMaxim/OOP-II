package exercitii;

public class Class1 {
	static int a;
	static int f() { 
		int a=3;
		return a;
	}
	
	static void g() {
		int a=3;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		a=2;
		System.out.print(a);
		g();
		System.out.print(f());
	}
} // Rezultat 
  // 23
  // 3
