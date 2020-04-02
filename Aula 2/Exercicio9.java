/*Faça um programa console em Java que apresente ao usuário um menu com quatro
opções: 1-Cadastrar Cliente, 2-Alterar Cliente, 3-Excluir Cliente e 0-Sair. Se o usuário
informar a opção 1, o programa deve apenas imprimir o texto “Cadastro de Cliente” e logo
abaixo reapresentar o menu de opções. Siga a mesma lógica para as opções 2 e 3. Ao
escolher a opção 0, o programa deve ser finalizado. Note que o menu precisa ser
apresentado pelo menos uma primeira vez, para que o usuário possa escolher uma opção.*/

package src;

import java.util.Scanner;
public class Exercicio9 {
	public static void main(String[] args) {
		int opcao = 0;
		Scanner no = new Scanner(System.in);
		do {
			System.out.println("\n\n\t\t\t1 - Cadastrar Cliente");
			System.out.println("\t\t\t2 - Alterar Cliente");
			System.out.println("\t\t\t3 - Excluir Cliente");
			System.out.println("\t\t\t0 - Sair");
			System.out.print("\t\t\tOpção: ");
			opcao = no.nextInt();
			switch (opcao) {
			case 0: break;
			case 1:
				System.out.println("Cadastro de Cliente");
				break;
			case 2:
				System.out.println("Alteração de Cliente");
				break;
			case 3:
				System.out.println("Exclusão de Cliente");
				break;
			default:
				System.out.println("A opção digitada é inválida!");
				opcao = -1;
			}
		}while (opcao != 0);
	}
}
