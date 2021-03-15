package sarcini;

import java.util.Scanner;

public class Numere {

	public static void main(String[] args) {
		// 3. Se citește un număr natural cu 5 cifre. Afișați numpărul format după eliminarea cifrei din mijloc. 
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Num =: " +((num/1000)*100 + (num % 100)));
	}

}
