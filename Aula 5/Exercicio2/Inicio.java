package Exercicio2;

public class Inicio {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setNome("Cr�nicas de N�rnia");
		livro.setDataLancamento(1950);
		livro.setIdioma("Ingl�s Brit�nico");
		livro.setAutor("C.S. Lewis", 122, "Masculino", "Irland�s");
		
		System.out.println("Dados do Livro: ");
		System.out.println("Nome do livro: " + livro.getNome());
		System.out.println("Ano de Lan�amento: " + livro.getDataLancamento());
		System.out.println("Idioma do livro: " + livro.getIdioma());
		System.out.println("Autor do livro: " + livro.getAutor());

	}

}
