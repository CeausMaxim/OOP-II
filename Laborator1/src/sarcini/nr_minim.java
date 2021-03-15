package sarcini;

import java.util.Scanner;

public class nr_minim {

	public static void main(String[] args) {
		// 1. Se citesc n numere reale. Să se afișeze valoarea minimă citită.
		
		int i=1, min, n, s;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti va rog numarul de cifre pe care doriti sa le verificati = ");
		n = scan.nextInt();
		s = scan.nextInt();
		min = s;
		while (i<n) {
			i++;
			s = scan.nextInt();
			if( s < min ) {
				min = s;
			}
		}
	System.out.print("Valoarea minima =: "+min); 
	}

}
