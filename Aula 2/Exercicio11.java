/*Escreva um programa console em Java que leia os nomes de 10 pessoas e armazene-os em
um vetor. Em seguida, crie uma consulta onde o usuário informa um nome e o programa
busca a primeira ocorrência deste nome imprimindo a posição dele no vetor. Utilize os
comandos WHILE, IF e BREAK.*/

package src;

import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		String[] nomes = new String[10];
		String nomeP;
		Scanner s = new Scanner(System.in);
		int i=0, j=0;
		while (i != 10) {
			System.out.print("Digite o nome da " + (i+1)+ " ª pessoa: "); nomes[i] = s.next(); 
			i++;
		}
		System.out.print("Digite o nome que deseja procurar: "); nomeP = s.next();
		while(j<nomes.length) {
			if (nomeP.equals(nomes[j])) {
	            System.out.println("o nome é: " + nomeP + " e sua posição é: " + (j + 1));
	            break;
	        } 
			j++;
		}

	}

}
