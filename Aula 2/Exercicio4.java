/*Fa�a um programa console em Java que leia o nome de um m�s do ano e apresente a
esta��o predominante neste m�s. O programa deve informar caso o m�s informado n�o
exista*/

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		String mes;
	
		Scanner resposta = new Scanner(System.in);
		System.out.println("Escolha um m�s: ");
		mes = resposta.next();
		switch (mes) {
		case "Dezembro":
		case "Janeiro":
		case "Fevereiro":
			System.out.println("Esta��o: Ver�o!");
			break;
		case "Mar�o":
		case "Abril":
		case "Maio":
			System.out.println("Esta��o: Outono!");
			break;
		case "Junho":
		case "Julho":
		case "Agosto":
			System.out.println("Esta��o: Inverno!");
			break;
		case "Setembro":
		case "Outubro":
		case "Novembro":
			System.out.println("Esta��o: Primavera!");
			break;
		}

	}

}
