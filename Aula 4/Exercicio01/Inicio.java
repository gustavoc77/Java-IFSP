package Exercicio01;

import java.util.Scanner;
public class Inicio {

		private static Scanner s;

		public static void main(String [] args) {
			s = new Scanner(System.in);
			int codigoProd; 
			String descricaoProd;
			float precoProd;
			boolean ativoProd;
			Produto produto1 = new Produto();
			System.out.println("Digite o codigo do produto: "); codigoProd = s.nextInt();
			produto1.setCodigo(codigoProd);
			System.out.println("Descri��o do produto: ");
			descricaoProd = s.next();
			produto1.setDescricao(descricaoProd);
			
			
			System.out.println("Digite o pre�o do produto: ");
			precoProd = s.nextFloat();
			produto1.setPreco(precoProd);
			
			
			System.out.println("Produto ativo? ");
			ativoProd = s.next() != null;
			
			System.out.println("C�digo do Produto: " + produto1.getCodigo() + "\n" + 
					"Descric�o do Produto: " + produto1.getDescricao() + "\n" +
					"Pre�o do Produto: R$" + produto1.getPreco() + "\n" +
					"Produto Ativo? " + produto1.getAtivo());
		}
}
