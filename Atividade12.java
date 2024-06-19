package Dia19;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		
		int intervalo = 0;
		for (int i = 0; i < 20; i++) {
		System.out.print("Digite um número: ");
		int numero = ler.nextInt();
		if (numero >= 0 && numero <= 100) {
	      intervalo++;
		}
		}
		System.out.println("Quantidade de números entre 0 e 100: " + intervalo);
		ler.close();
		}
		

	}

