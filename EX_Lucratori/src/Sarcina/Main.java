package Sarcina;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		       
        System.out.print("������� ����� ������: ");
		Scanner scann = new Scanner(System.in);
        int ore = scann.nextInt();
        
        System.out.print("�������� ��������� ������� ����� 1 - 3: ");
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        if (n == 1) {
        	Muncitor muncitor = new Muncitor();
        	muncitor.getTime(ore);
        	int sal = 0;
			muncitor.salary(sal);
			System.out.println("������� " + n + " ��������� - �������. �������� ����� " + muncitor.salary(sal));
        } else if (n == 2) {
        	Sef_echipa sef = new Sef_echipa();
        	sef.getTime(ore);
        	int sal = 0;
			sef.salary(sal);
			System.out.println("������� " + n + " ��������� - ��� ������. �������� ����� " + sef.salary(sal));
        } else if (n == 3) {
        	Maistru maistru = new Maistru();
        	maistru.getTime(ore);
        	int sal = 0;
        	maistru.salary(sal);
        	System.out.println("������� " + n + " ��������� - ������. �������� ����� " + maistru.salary(sal));
        } else System.out.print("Error");
        
	}

}
