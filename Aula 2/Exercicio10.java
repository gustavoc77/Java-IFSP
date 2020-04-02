/*Faça um programa console em Java que leia as informações de 10 clientes de uma loja
(nome, CPF, e-mail e telefone). Em seguida, o programa deve disponibilizar 4 opções de
consulta (1-Por nome, 2-Por CPF, 3-Por e-mail e 4-Por telefone). Por exemplo, se o usuário
escolher a opção 2, a consulta deverá solicitar um CPF e, com base nele, deverá imprimir os
dados do cliente que tenha este CPF. O programa deve informar caso não encontre
nenhum cliente com o dado informado. Use uma matriz 10 x 4 para representar os dados.*/

package src;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {
	static String nomeC, emailC, cpfC, telC;
	static String[][] clientes = new String[2][4];
	static int i, opcao, r=0;
	static Scanner op = new Scanner(System.in);
	static Scanner info = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite o Nome, CPF, E-mail e Telefone de 10 clientes:");
		for(i=0; i<2;i++) {
			r = 0;
			while(r != 4) {
				System.out.print("Nome: ");
				clientes[i][r] = info.next();
				r++;
				System.out.print("CPF: ");
				clientes[i][r] = info.next();
				r++;
				System.out.print("E-mail: ");
				clientes[i][r] = info.next();
				r++;
				System.out.print("Telefone: ");
				clientes[i][r] = info.next();
				r++;
			}
			/*for(r=0; r<4; r++) {
				clientes[i][r] = info.next();
			}*/
			System.out.println("Próximo Cliente: ");
		}
		do {
			System.out.println("\n\n\t\t\t\t\t CONSULTA");
			System.out.println("\t\t\t\t\t1 - Por Nome");
			System.out.println("\t\t\t\t\t2 - Por CPF");
			System.out.println("\t\t\t\t\t3 - Por E-mail");
			System.out.println("\t\t\t\t\t4 - Por Telefone");
			System.out.println("\t\t\t\t\t0 - Para Sair");
			System.out.print("\t\t\t\t\tOpção: "); opcao = op.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.print("Nome :"); nomeC = info.next();
					for(i=0; i<2; i++) {
						for(r=0; r<1; r++) {
							if(nomeC.equals(clientes[i][r])) {
								System.out.println("Nome: "+clientes[i][r]+ " CPF: "+clientes[i][r+1]+ " E-mail: "+clientes[i][r+2] + " Telefone: " + clientes[i][r+3]);	
								break;
							} 
							else {
								System.out.println("Nome não encontrado");
							}
						}
					}
					
				case 2:
					System.out.println("CPF: "); cpfC = info.next();
					for(i=0; i<2; i++) {
						for(r=0; r<4; r++) {
							if(cpfC.equals(clientes[i][r])) {
								System.out.println("Nome: "+clientes[i][r]+ " CPF: "+clientes[i][r+1]+ " E-mail: "+clientes[i][r+2] + " Telefone: " + clientes[i][r+3]);
							} 
								
						}
					}
					
				case 3:
					System.out.println("E-mail: "); emailC = info.next();
					for(i=0; i<2; i++) {
						for(r=0; r<4; r++) {
							if(emailC.equals(clientes[i][r])) {
								System.out.println("Nome: "+clientes[i][r]+ " CPF: "+clientes[i][r+1]+ " E-mail: "+clientes[i][r+2] + " Telefone: " + clientes[i][r+3]);
								break;
							} 
							else {
								System.out.println("E-mail não encontrado");
							}
								
						}
					}
				case 4:
					System.out.println("Telefone: "); telC = info.next();
					for(i=0; i<2; i++) {
						for(r=0; r<1; r++) {
							if(telC.equals(clientes[i][r])) {
								System.out.println("Nome: "+clientes[i][r]+ " CPF: "+clientes[i][r+1]+ " E-mail: "+clientes[i][r+2] + " Telefone: " + clientes[i][r+3]);
							} 
							else {
								System.out.println("Telefone não encontrado");
							}
								
						}
					}
					

			}
		}while(opcao != 0);

		
	} // fim função main

}
