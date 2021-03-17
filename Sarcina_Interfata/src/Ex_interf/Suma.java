package Ex_interf;

import java.util.Scanner;


public class Suma {
	
	public void creareaClasei() {
		IO1 z = new IO1();
		z.crearea(0);
		IO2 x = new IO2();
		x.crearea(0);
	}
	
	public void afisare() {
	Scanner scan = new Scanner(System.in);
	System.out.print("¬ведите первое натуральное число: ");
    int a = scan.nextInt();
    System.out.print("¬ведите второе натуральное число: ");
    int b = scan.nextInt();
    
    int SumNat = 0;
    SumNat = a + b;
    System.out.println("—умма натуральных чисел равна " +SumNat);
	}

}
	

