/*Escreva um programa console em Java que leia o nome de um determinado número de
pessoas e armazene-os em um vetor. Antes de mais nada, o usuário deve informar quantos
nomes serão armazenados no vetor. Em seguida, imprima todos os nomes utilizando o
comando FOR (sem índice).*/

package src;

import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int qtd = 0, i=0, tamanho;
		System.out.println("Quantos nomes você vai informar? ");
		qtd = s.nextInt();
		tamanho = qtd;
		String[] nomes = new String[tamanho];
		if (tamanho != -1) {
			for(i=0; i<tamanho; i++) {
				System.out.println("Digite o " + (i+1) + " º nome: ");
				nomes[i] = s.next();
			}
		}
		for (String n : nomes ) {
			System.out.println(n);
		}

	}

}
