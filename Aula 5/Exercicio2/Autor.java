package Exercicio2;

public class Autor {
	
	private String nome;
	private int idade;
	private String sexo;
	private String nacionalidade;
	
	
	public String getAutor() {
		return ("\n Nome: " + nome + "\n Idade: " + idade + "\n Sexo: " + sexo + "\n Nacionalidade: " + nacionalidade);
	}
	
	public void setAutor(String nome, int idade, String sexo, String nacionalidade) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.nacionalidade = nacionalidade;
	}
}
