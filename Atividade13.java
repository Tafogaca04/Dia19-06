package Dia19;

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int menor = 0, maior = 0, entre = 0;
		int i = 0;
		
		
		System.out.println("Digite 20 números:");
		while (i < 20) {
		System.out.print("Número " + (i + 1) + ": ");
		int numero = ler.nextInt();
		
		
		if (numero >= 0 && numero <= 100) {
		menor++;
		} else if (numero >= 101 && numero <= 200) {
		entre++;
		} else if (numero > 200) {
		maior++;
		}
		i++;
		}
		System.out.println("Quantidade de números entre 0 e 100: " + menor);
		System.out.println("Quantidade de números entre 101 e 200: " + entre);
		System.out.println("Quantidade de números maiores que 200: " + maior);
		ler.close();
		}
		}

	
