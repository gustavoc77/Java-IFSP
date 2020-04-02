package Exercicio03;

public class Cliente {
	private int codigo;
	private String nome;
	private String cpf;
	

	int getCodigoCliente() {
		return codigo;
	}
	String getNomeCliente() {
		return nome;
	}
	String getCpfCliente() {
		return cpf;
	}
	
	void setCodigoCliente(int codigo) {
		this.codigo = codigo;
	}
	boolean setNomeCliente(String nome) {
		if(nome.contains(" ")){
			this.nome = nome;
			return true;
		}
		return false;
	}
	boolean setCpfCliente(String cpf) {
		if(cpf.length() == 11){
			this.cpf = cpf;
			return true;
		}
		return false;
	}
}
