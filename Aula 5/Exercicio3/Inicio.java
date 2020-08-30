package ex3;

import java.util.Scanner;

public class Inicio {
	
	static PessoaFisica[] pessoafisica = new PessoaFisica[10];
	static PessoaJuridica[] pessoajuridica = new PessoaJuridica[10];
	
	//m�todo auxiliar na remo��o de pessoa f�sica ou jur�dica buscando o cliente pelo c�digo
	public static Cliente buscaCliente(int cod) {
		if (pessoafisica[cod - 1].getCodigo() == cod)
			return pessoafisica[cod - 1];
		if (pessoajuridica[cod - 1].getCodigo() == cod)
			return pessoajuridica[cod - 1];
		return null;
	}
	
	//m�todo auxiliar na impress�o da lista de pessoas f�sicas
	public static void imprimeListaPessoasFisicas() {
		for(PessoaFisica pes: pessoafisica) {
			if(pes != null)
				System.out.println(pes.getCodigo()+" "+pes.getNome()+" "+
		pes.getCpf()+" "+pes.getEndereco()+" "+pes.getTelefone());
		}
	}
	
	//m�todo auxiliar na impress�o da lista de pessoas jur�dicas
	public static void imprimeListaPessoasJuridicas() {
		for(PessoaJuridica pes: pessoajuridica) {
			if(pes != null)
				System.out.println(pes.getCodigo()+" "+pes.getRazaoSocial()+" "+
		pes.getCnpj()+" "+pes.getEndereco()+" "+pes.getTelefone());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao = -1, codigoPf = 0, codigoPj = 0, codigoCli = 0;
		char cli;
		
		while(opcao != 0) {
			System.out.println("Programa de opera��o de clientes. Digite uma das seguintes op��es:");
			System.out.println("1 para inserir clientes");
			System.out.println("2 para remover clientes");
			System.out.println("3 para consultar clientes");
			System.out.println("0 para encerrar ");
			Scanner entrada = new Scanner(System.in);
			opcao = entrada.nextInt();
			entrada.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("Digite uma das seguintes op��es:\nf para pessoa f�sica\nj para pessoa juridica ");
				cli = entrada.next().charAt(0);
				entrada.nextLine();
				if(cli == 'f' || cli == 'F') {
					PessoaFisica pessoaf = new PessoaFisica();
					System.out.println("Digite o nome do cliente: ");
					String nome = entrada.nextLine();
					pessoaf.setNome(nome);
					//entrada.nextLine();
					System.out.println("Digite o CPF do cliente: ");
					String cpf = entrada.next();
					pessoaf.setCpf(cpf);
					entrada.nextLine();
					System.out.println("Digite o endere�o do cliente: ");
					String endereco = entrada.nextLine();
					pessoaf.setEndereco(endereco);
					//entrada.nextLine();
					System.out.println("Digite o telefone do cliente: ");
					String telefone = entrada.next();
					pessoaf.setTelefone(telefone);
					entrada.nextLine();
					codigoCli++;
					pessoaf.setCodigo(codigoCli);
					pessoafisica[codigoPf] = pessoaf;
					codigoPf++;
					System.out.println("Pessoa f�sica cadastrada com sucesso!");
				}
				else if(cli == 'j' || cli == 'J') {
					PessoaJuridica pessoaj = new PessoaJuridica();
					System.out.println("Digite a raz�o social do cliente: ");
					String rs = entrada.nextLine();
					pessoaj.setRazaoSocial(rs);
					//entrada.nextLine();
					System.out.println("Digite o CNPJ do cliente: ");
					String cnpj = entrada.next();
					pessoaj.setCnpj(cnpj);
					entrada.nextLine();
					System.out.println("Digite o endere�o do cliente: ");
					String endereco = entrada.nextLine();
					pessoaj.setEndereco(endereco);
					//entrada.nextLine();
					System.out.println("Digite o telefone do cliente: ");
					String telefone = entrada.next();
					pessoaj.setTelefone(telefone);
					entrada.nextLine();
					codigoCli++;
					pessoaj.setCodigo(codigoCli);
					pessoajuridica[codigoPj] = pessoaj;
					codigoPj++;
					System.out.println("Pessoa jur�dica cadastrada com sucesso!");
				}
				else System.out.println("Op��o inv�lida!");
				break;
				
			case 2:
				System.out.println("Digite uma das seguintes op��es:\nf para pessoa f�sica\nj para pessoa juridica ");
				cli = entrada.next().charAt(0);
				if(cli == 'f' || cli == 'F') {
					System.out.println("Insira o c�digo do cliente: ");
					int codigo = entrada.nextInt();
					if (buscaCliente(codigo) == null)
						System.out.println("Cliente ou c�digo inexistente!");
					else {
						pessoafisica[buscaCliente(codigo).getCodigo() - 1] = null;
						System.out.println("Remo��o realizada com sucesso!");
					}
				}
				else if(cli == 'j' || cli == 'J') {
					System.out.println("Insira o c�digo do cliente: ");
					int codigo = entrada.nextInt();
					if (buscaCliente(codigo) == null)
						System.out.println("Cliente ou c�digo inexistente!");
					else {
						pessoajuridica[buscaCliente(codigo).getCodigo() - 1] = null;
						System.out.println("Remo��o realizada com sucesso!");
					}
				}
				else System.out.println("Op��o inv�lida!");
				break;
				
			case 3:
				System.out.println("Lista de pessoas f�sicas: ");
				imprimeListaPessoasFisicas();
				System.out.println("Lista de pessoas jur�dicas: ");
				imprimeListaPessoasJuridicas();
				break;
				
			case 0:
				entrada.close();
				break;

			default:
				System.out.println("Opera��o inv�lida!\n");
				break;
			}
		}
		
		System.out.println("Programa encerrado!\n");
		
	}

}
