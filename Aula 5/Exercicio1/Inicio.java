package Exercicio1;

public class Inicio {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setAgencia(77);
		conta.setIdConta(0007);
		conta.setNumeroConta("Sete");
		conta.setTitular("Gustavo", "4887777777", "Rua Setecentos e Setenta e Sete", "gustavocosta77@email.com");
		
		//Testando a depend�ncia entre objetos
		conta = new Conta();
		
		System.out.println("Dados da Conta:");
		System.out.println("Ag�ncia: " + conta.getAgencia());
		System.out.println("id da Conta: " + conta.getIdConta());
		System.out.println("N�mero da Conta: " + conta.getNumeroConta());
		System.out.println("Titular da Conta: " + conta.getCliente());
		
	}

}
