package paquete;

import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Buenos d�as Ceinmark, soy Jorge");
		System.out.println("Introduce un n�mero para averiguar si es primo o no:");
		int num=sc.nextInt();
		
		for (int i = 2; i < num; i++) {
			if (num/i==0) {
				System.out.println("no es primo");
			}else {
				System.out.println("es primo");
				break;
			}
		}
		

	}

}
