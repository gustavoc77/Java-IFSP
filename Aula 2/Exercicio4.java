/*Faça um programa console em Java que leia o nome de um mês do ano e apresente a
estação predominante neste mês. O programa deve informar caso o mês informado não
exista*/

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		String mes;
	
		Scanner resposta = new Scanner(System.in);
		System.out.println("Escolha um mês: ");
		mes = resposta.next();
		switch (mes) {
		case "Dezembro":
		case "Janeiro":
		case "Fevereiro":
			System.out.println("Estação: Verão!");
			break;
		case "Março":
		case "Abril":
		case "Maio":
			System.out.println("Estação: Outono!");
			break;
		case "Junho":
		case "Julho":
		case "Agosto":
			System.out.println("Estação: Inverno!");
			break;
		case "Setembro":
		case "Outubro":
		case "Novembro":
			System.out.println("Estação: Primavera!");
			break;
		}

	}

}
