package Dia19;

import java.util.Scanner;

public class Atividade10while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
	
	
		int contador = 0;
		int numero;
		while (contador < 20) {
		System.out.print("Digite o número " + (contador + 1) + ": ");
		numero = ler.nextInt();
		if (numero > 8) {
		contador++;
		}
		contador++;
		}
		System.out.println("Quantidade de números maiores que 8: " + contador);
		ler.close();
		}
		}
