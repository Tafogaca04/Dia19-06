package Dia19;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int pares = 0;
		int i = 0;
		System.out.println("Digite 20 números:");
		while (i < 20) {
		System.out.print("Número " + (i + 1) + ": ");
		int numero = ler.nextInt();
		if (numero % 2 == 0) {
		pares++;
		}
		i++;
		}
		System.out.println("Quantidade de números pares: " + pares);
		ler.close();

	}

}
