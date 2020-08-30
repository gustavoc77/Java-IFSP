package Exercicio2;

public class Livro {

	private String nome;
	private int dataLancamento;
	private String idioma;
	private Autor autor;
	
	public Livro() {
		this.autor = new Autor();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(int dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getAutor() {
		return autor.getAutor();
	}

	public void setAutor(String nome, int idade, String sexo, String nacionalidade) {
		this.autor.setAutor(nome, idade, sexo, nacionalidade);
	}
	
	
}
