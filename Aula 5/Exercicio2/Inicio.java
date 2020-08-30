package Exercicio2;

public class Inicio {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setNome("Crônicas de Nárnia");
		livro.setDataLancamento(1950);
		livro.setIdioma("Inglês Britânico");
		livro.setAutor("C.S. Lewis", 122, "Masculino", "Irlandês");
		
		System.out.println("Dados do Livro: ");
		System.out.println("Nome do livro: " + livro.getNome());
		System.out.println("Ano de Lançamento: " + livro.getDataLancamento());
		System.out.println("Idioma do livro: " + livro.getIdioma());
		System.out.println("Autor do livro: " + livro.getAutor());

	}

}
