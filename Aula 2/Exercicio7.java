/*Faça um programa console em Java que leia os códigos, os nomes e os preços de 10
produtos. Após a leitura, o programa deve solicitar ao usuário um determinado valor em reais. Com base neste valor, o programa deve imprimir os dados dos produtos que tenham
o preço igual ou abaixo do valor informado. Use um vetor para cada informação (código,
nome e preço).*/

import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] codigoProduto = new int[10];
		String [] nomeProduto = new String[10];
		float [] precoProduto = new float[10];
		int i = 1;
		float valor;
		
		for(i=0; i<10; i++) {
			System.out.println("Digite o código do produto: ");
			codigoProduto[i] = s.nextInt();
			System.out.println("Digite o nome do produto: ");
			nomeProduto[i] = s.next();
			System.out.println("Digite o preço do produto em R$: ");
			precoProduto[i] = s.nextFloat();
		}
		
		System.out.println("Digite um valor em reais: ");
		valor = s.nextFloat();
	
		for(i=0; i<10; i++) {
			if ((valor == precoProduto[i]) || (valor > precoProduto[i])) {
				System.out.println("Código Produto: " + codigoProduto + "Produto: " +nomeProduto[i] + "Preço: R$ " + precoProduto);
				
			}
		}
	}

}
