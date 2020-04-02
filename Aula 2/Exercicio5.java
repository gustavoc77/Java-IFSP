/*Escreva um programa console em Java que leia os nomes de 10 produtos (use um vetor
para armazená-los). Em seguida, o programa deve solicitar a faixa de produtos que deve
ser apresentada (por exemplo: de 3 a 7) e, com base nesta faixa, deve imprimir apenas os
produtos nela situados*/

import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner escolha = new Scanner(System.in);
		int origem, fim;
		String[] produtos = new String[11];
		int i;
		for(i=0; i<11; i++) {
			System.out.println("Digite o "+(++i) + "º produto: ");
			produtos[i] = escolha.next();
		}
		System.out.println("De onde você quer começar a ver? ");
		origem = escolha.nextInt();
		System.out.println("Até onde você quer ver?");
		fim = escolha.nextInt();
		
		for(i=origem + 1; (i-1) < fim; i++) {
			System.out.println("Produto: "+ produtos[i]);
		}
	}

}
