/*Escreva um programa console em Java que leia as informações sobre o faturamento (em
R$) de um armazém em cada um dos 12 meses de um determinado ano. O programa deve
imprimir se o faturamento no ano foi baixo (menor ou igual a R$ 50.000,00), médio (entre
R$ 50.000,01 e R$ 100.000,00) ou alto (acima de R$ 100.000,00).*/

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		float soma = 0, faturamento[] = new float[13];
		int i = 1;
		Scanner resposta = new Scanner(System.in);
		
		for(i=1; i<13; i++) {
			System.out.println("Qual foi o faturamento do mês " + i + "?" );
			faturamento[i] = resposta.nextFloat();
			soma+= faturamento[i];
		}
		
		if((soma <= 50000)) {
			System.out.println("Faturamento baixo!");
		}
		else if((soma >= 50000.01) && (soma <= 100000) ) {
			System.out.println("Faturamento médio!");
		}
		else {
			System.out.println("Faturamento Alto");
		}
		
	}

}
