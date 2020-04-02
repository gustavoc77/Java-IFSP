//Faça um programa console em Java que leia um número inteiro, verifique se ele é par ou
//ímpar e apresente esta informação para o usuário

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int numero;
		Scanner resposta = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		numero = resposta.nextInt();
		if (numero % 2 == 0) {
			System.out.println("O número " + numero + "é par" );
		}
		else {
			System.out.println("O número "+ numero + "é ímpar");
		}

	}

}
