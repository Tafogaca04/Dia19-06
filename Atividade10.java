package Dia19;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int numero = 0, contador = 0;
		for (int i = 0; i < 20; i++) {
		System.out.print("Digite o número " + (i + 1) + ": ");
		numero = ler.nextInt();
		if (numero>= 8){
		contador ++;
		}
		System.out.println("Quantidade de números maiores que 8 é: " + contador);
		}
		}
		}


