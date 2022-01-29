package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um nr qualquer: ");
		int n = sc.nextInt();
		
		System.out.print("O nr informado foi: " + n);
		
		sc.close();
		

	}

}
