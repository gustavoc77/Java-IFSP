/*Faça um programa console em Java que leia o nome e a altura de 10 pessoas. Em seguida,
crie uma consulta onde o usuário informa um valor de altura mínima e o programa
imprime os nomes de todas as pessoas, exceto aquelas que tiverem altura menor que a
informada. Utilize os comandos WHILE, IF e CONTINUE. Use um vetor para cada
informação (nome e altura).*/

package src;

import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		String[] nomes = new String[2];
		float[] alturas = new float[2];
		float alturaM;
		Scanner r = new Scanner(System.in);
		Scanner a = new Scanner(System.in);
		int i=0;
		while(i != 2) {
			System.out.print("Digite o nome da "+(i+1) + " ª pessoa: "); nomes[i] = r.next();
			System.out.print("Digite a altura da "+(i+1) + " ª pessoa: "); alturas[i] = a.nextFloat();
			i++;
		}
		System.out.print("Digite a altura mínima: "); alturaM = r.nextFloat();
		i=0;
		while(i != 2) {
			if(alturas[i] > alturaM) {
				i++;
				continue;
			}
			System.out.println(nomes[i]);
			i++;
		}
	}

}
