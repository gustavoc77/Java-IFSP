package Exercicio01;

public class Produto {
	private int codigo;
	private String descricao;
	private float preco;
	private boolean ativo;
	
	
	
	/*CONSTRUTOR*/
	
	public Produto() {
		this.codigo = 1;
		this.descricao = "";
		this.preco = (float) 03.20;
		this.ativo = true;
	}
	
	/*MÉTODOS GET*/
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public float getPreco() {
		return this.preco;
	}
	
	public boolean getAtivo() {
		return this.ativo;
	}
	
	
	/*MÉTODOS SET*/
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
