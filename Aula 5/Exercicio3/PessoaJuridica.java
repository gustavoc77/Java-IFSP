package ex3;

public class PessoaJuridica extends Cliente{
	
	private String razaoSocial;
	private String cnpj;
	
	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
