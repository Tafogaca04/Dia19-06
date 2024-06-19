package Dia19;

import java.util.Scanner;

public class Atividade11for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int pares = 0;
		System.out.println("Digite 20 números:");
		for (int i = 0; i < 20; i++) {
		System.out.print("Número " + (i + 1) + ": ");
		int numero = ler.nextInt();
		if (numero % 2 == 0) {
		pares++;
		}
		}
		System.out.println("Quantidade de números pares: " + pares);
		ler.close();

	}

}
