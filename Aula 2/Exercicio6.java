/*Escreva um programa console em Java que leia o nome e a idade de 10 pessoas. Em
seguida, o programa deve solicitar uma idade mínima e, com base nela, imprimir apenas os
dados das pessoas que tiverem esta idade ou mais. Use um vetor para cada informação
(nome e idade).*/

import java.util.Scanner;
public class Exercicio6 {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		String[] nome = new String[10];
		int [] idade = new int[10];
		int i, idademinima;
		
		for(i=0; i<10;i++) {
			System.out.println("Digite o nome da " + (i+1) + "ª pessoa: ");
			nome[i] = s.next();
			
			System.out.println("Digite também sua idade: ");
			idade[i] = s.nextInt();
			
		}
		
		System.out.println("Digite a idade mínima: ");
		idademinima = s.nextInt();
		
		for(i=0; i<10; i++) {
			if (idade[i] >= idademinima) {
				System.out.println("Nome: " + nome[i] + "Idade: " + idade[i] + " anos");
			}
		}
		
		
	}
}
