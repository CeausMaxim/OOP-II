package sarcini;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncFactory;

public class Media {

	public static void main(String[] args) {
		/* 2. Se citește un șir de numere întregi pînă la întîlnirea numărului 0. 
		   Să se calculeze media aritmetică a numerelor din șir. */
		
		int n, i=0, suma=0;
		float media;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		suma = n;
		while (n != 0) {
			n = scan.nextInt();
			i++;
			suma += n; 
		}
		//System.out.println("Suma =: " +suma);
		//System.out.println("I =: " +i);
		media = (float)suma / i; 
		System.out.println("Media este egala cu: " +media);
	}

}
