package Ex_interf;

import java.util.Scanner;

public class Produs {
	public void afisare1() {
	Scanner scan = new Scanner(System.in);
	System.out.print("������� ������ ����������� �����: ");
    int a = scan.nextInt();
    System.out.print("������� ������ ����������� �����: ");
    int b = scan.nextInt();
    
    int ProdusNat = 0;
    ProdusNat = a * b;
    System.out.println("������������ ����������� ����� ����� " +ProdusNat);
}
}
