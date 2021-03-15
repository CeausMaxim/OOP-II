package lab5_ex6;

public class A {
	int a,b;
	A(int a, int b) {
		this.a=a; 
		this.b=b;
	}
	A(int x) {
		b=x;
	}
	void Afis() { 
		System.out.print(a+ " " +b);
	}
}
