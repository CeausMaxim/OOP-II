package Ex_interf;

import java.util.Scanner;

public class Produs {
	public void afisare1() {
	Scanner scan = new Scanner(System.in);
	System.out.print("Введите первое натуральное число: ");
    int a = scan.nextInt();
    System.out.print("Введите второе натуральное число: ");
    int b = scan.nextInt();
    
    int ProdusNat = 0;
    ProdusNat = a * b;
    System.out.println("Произведение натуральных чисел равно " +ProdusNat);
}
}
