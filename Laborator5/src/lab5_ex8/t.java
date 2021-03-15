package lab5_ex8;

public class t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unu x;
		int n = 3;
		if (n == 1) {
			x = new Unu();
		}
		else {
			x = new Doi();
			x.afis();
		}
		System.out.println(x.a);
	}
}
