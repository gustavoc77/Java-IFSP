package Exercicio1;

public class Conta {
	
	private int idConta;
	private int agencia;
	private String numeroConta;
	private Cliente titular;
	
	public Conta() {
		this.titular = new Cliente();
	}
	
	//GETTERS
	public int getIdConta() {
		return idConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public String getCliente() {
		return titular.getCliente();
	}
	
	//SETTERS
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public void setTitular(String nome, String cpf, String endereco, String email) {
		this.titular.setCliente(nome, cpf, endereco, email);
	}
}
