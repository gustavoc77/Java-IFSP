//Fa�a um programa console em Java que leia um n�mero inteiro, verifique se ele � par ou
//�mpar e apresente esta informa��o para o usu�rio

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int numero;
		Scanner resposta = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		numero = resposta.nextInt();
		if (numero % 2 == 0) {
			System.out.println("O n�mero " + numero + "� par" );
		}
		else {
			System.out.println("O n�mero "+ numero + "� �mpar");
		}

	}

}
