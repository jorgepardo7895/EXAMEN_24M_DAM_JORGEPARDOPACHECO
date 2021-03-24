package paquete;

import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Buenos días Ceinmark, soy Jorge");
		System.out.println("Introduce un número para averiguar si es primo o no:");
		int num=sc.nextInt(), contador=0;
		
		for(int i = num; i > 0; i--){
		    if(num % i == 0 ){
		        contador++;
		    }
		}
		
		if (contador==2) {
			System.out.println("Es primo");
		}else {
			System.out.println("no es primo");
		}
		
		sc.close();
	}

}
