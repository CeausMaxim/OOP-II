package lab5_ex7;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Caz 1
		System.out.println("Cazul 1");
		A a = new A();
		a.met();
		System.out.println(a.x);
		// Caz 2
		System.out.println("Cazul 2");
		B y = new B();
		y.met();
		System.out.println(y.x);
		// Caz 3
		System.out.println("Cazul 3");
		C z = new C();
		z.met();
		System.out.println(z.x);
		// Caz 4
		System.out.println("Cazul 4");
		A x = new B();
		x.met();
		System.out.println(x.x);
	}

}
