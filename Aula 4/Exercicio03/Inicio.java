package Exercicio03;

import java.util.Scanner;
public class Inicio {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Cliente[] clientes = new Cliente[10];
		int index = 0;
		int opc;
		
		do {
			System.out.println("\nEscolha uma das seguintes op��es: ");
			System.out.println("0: Sair");
			System.out.println("1: Inserir Cliente");
			System.out.println("2: Consultar Cliente Espec�fico");		
			System.out.println("3: Consultar Clientes");
			opc = s.nextInt();
			String nomeCliente;
			String cpfCliente;
			
			switch (opc) {
			case 0:
				break;
			case 1:
				s.nextLine();
				clientes[index] = new Cliente();
				clientes[index].setCodigoCliente(index);
				//Loop de valida��o de nome
				do{
					System.out.println("Digite o nome do cliente: ");
					nomeCliente = s.nextLine();
					if(! (clientes[index].setNomeCliente(nomeCliente)))
						System.out.println("O nome est� inv�lido");
				}while(! (clientes[index].setNomeCliente(nomeCliente)));
				
				
				//Loop de valida��o de cpf
				do{
					System.out.println("Digite o cpf do cliente: ");
					cpfCliente = s.nextLine();
					if(! (clientes[index].setCpfCliente(cpfCliente)))
						System.out.println("Cpf inv�lido! O Cpf deve ter exatamente 11 d�gitos");
				}while(! (clientes[index].setCpfCliente(cpfCliente)));
				
				System.out.println("Cliente inserido com sucesso");
				index++;
				break;
			case 2:
				System.out.println("Digite o c�digo do cliente: ");
				int busca = s.nextInt();
				if(clientes[busca] != null){
					System.out.println("C�digo do cliente: "+clientes[busca].getCodigoCliente()+
							"\nNome do cliente: "+clientes[busca].getNomeCliente()+
							"\nCPF do cliente: "+clientes[busca].getCpfCliente());
				}
				else{
					System.out.println("Cliente n�o encontrado");
				}
				break;
			case 3:
				for(int i = 0; i <= clientes.length; i++) {
					System.out.println("C�digo: " + clientes[i].getCodigoCliente());
					System.out.println("Nome: " + clientes[i].getNomeCliente());
					System.out.println("CPF: " + clientes[i].getCpfCliente());
				}
				break;

			default:
				System.out.println("Op��o inv�lida!");
				break;
			}
			
		}while(opc != 0);
		s.close();
	}

	

}
