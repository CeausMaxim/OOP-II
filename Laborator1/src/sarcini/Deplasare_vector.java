package sarcini;

import java.util.Scanner;

public class Deplasare_vector {

	public static void main(String[] args) {
		// 5. Se citește un vector cu n componente numere naturale. Se cere să se
		// obțină toate permutările circulare la dreapta.
		
		System.out.print("Lungimea vectorului =: " );
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] vector = new int[n];
		
		for(int i = 0; i < n; i++)
			vector[i] = scan.nextInt();
		
		for(int i = 0; i < n; i++)
			System.out.print(vector[i] + " ");
		System.out.println();
		
		for(int i = n - 1; i > 0; i--) {
			for(int j = i; j < n; j++)
				System.out.print(vector[j] + " ");
			
			for(int j = 0; j < i; j++)
				System.out.print(vector[j] + " ");
			System.out.println();
		}
	}
}
