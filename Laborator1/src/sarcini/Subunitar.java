package sarcini;

import java.util.Scanner;

public class Subunitar {

	public static void main(String[] args) {
		/* 4. Se citește un vector cu n componente, numere naturale. 
		   Să se afișeze cel mai mare număr rațional subunitar în care numărătorul 
		   și numitorul fac parte din mulțimea valorilor citite. 
		   Exemplu: dacă am citit valorile 1 2 3 se afișează 2/3. */
		
		int max, max1, imax = 0, i, n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Lungimea vectorului =: " );
		n = scan.nextInt();
		int [] V = new int [n]; // declararea vectorului
		for(i = 0; i<n; i++)  { 
			//initializarea componentelor
			V[i] = scan.nextInt();
		}
		// determinarea primei valori maxime
		max = V[0];
		for (i = 0; i < n; i++) {
			if (V[i] > max) {
				max = V[i];
				imax = i;
			}
		}
		
		// determinarea valorii a doua maxime
		V[imax] = 0;
		max1 = V[0];
		for (i = 0; i < n; i++) {
			if (V[i] > max1) {
				max1 = V[i];
			}
		}
		System.out.println("Rezultatul =: "+max1 +"/" +max );
	}

}
