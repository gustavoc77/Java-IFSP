/*Fa�a um programa console em Java que leia um ano (de 0 � 9999), verifique se ele � um
ano bissexto e apresente esta informa��o para o usu�rio.*/

import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ano;
		Scanner escolha = new Scanner(System.in);
		System.out.println("Escolha um ano: ");
		ano = escolha.nextInt();
		if (ano % 400 == 0) {
			System.out.println("O ano "+ano+" � bissexto");
		}
		else if((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println("O ano "+ ano + " � bissexto");
			
		}
		else {
			System.out.println("O ano " + " n�o � bissexto");
		}
	}

}
