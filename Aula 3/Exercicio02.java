package Exercicios;

public class Exercicio02 {
	public static void main(String [] args) {
		String frase = "Uma ideia traz outra; o botic�rio imaginou que, uma vez preso o alienista, viriam tamb�m busc�-lo a ele, na qualidade de c�mplice. Esta ideia foi o melhor dos vesicat�rios. Crispim Soares ergueu-se, disse que estava bom, que ia sair; e apesar de todos os esfor�os e protestos da consorte vestiu-se e saiu. Os velhos cronistas s�o un�nimes em dizer que a certeza de que o marido ia colocar-se	nobremente ao lado do alienista consolou grandemente a esposa do botic�rio; e notam com muita perspic�cia, o imenso poder moral de uma ilus�o; porquanto, o botic�rio caminhou resolutamente ao pal�cio do governo, n�o � casa do alienista. Ali chegando, mostrou-se admirado de n�o ver o barbeiro, a quem ia apresentar os seus protestos de ades�o, n�o o tendo feito desde a v�spera por enfermo. E tossia com algum custo. Os altos funcion�rios que lhe ouviam esta declara��o, sabedores da intimidade do botic�rio com o alienista, compreenderam toda a import�ncia da ades�o nova e trataram a Crispim Soares com apurado carinho; afirmaram-lhe que o barbeiro n�o tardava; Sua Senhoria tinha ido � Casa Verde, a neg�cio importante, mas n�o tardava. Deram-lhe cadeira, refrescos, elogios; disseram-lhe que a causa do ilustre Porf�rio era a de todos os patriotas;ao que o botic�rio ia repetindo que sim, que nunca pensara outra coisa, que isso mesmo mandaria declarar a Sua Majestade.";
		System.out.println("A frase �: " + frase.substring(frase.indexOf("E tossia"), frase.lastIndexOf("Os altos")));
		
		String frase1 = frase.replace("alienista", "psiquiatra");
		System.out.println(frase1);
		
		String frase2 = frase.replace("Crispim Soares","Crispim Soares".toUpperCase());
		System.out.println(frase2);
		
		String custo = "custo";
		String vila = "vila";
		String receio = "receio";
		System.out.println("O Texto possui a palavra Vila? " + frase.contains(vila)); 
		System.out.println("O Texto possui a palavra Custo? " + frase.contains(custo)); 
		System.out.println("O Texto possui a palavra Receio? " + frase.contains(receio)); 
		
		System.out.println(frase.length());
		System.out.println(frase.indexOf("n�o"));
		System.out.println(frase.lastIndexOf("n�o"));
		System.out.println(frase.substring(604, 1122));
		//System.out.println("Quantas vezes a palavra n�o aparece no texto? " + + "vezes.");
		
		int tamanho_frase = frase.length();
		System.out.println("N�mero de caracteres do texto: " + frase.length());
		String frase_sem_espaco = frase.replace(" ", "");
		int tamanho_frase_espaco = frase_sem_espaco.length();
		System.out.println("Quantidade de espa�os: " + (tamanho_frase - tamanho_frase_espaco));
		
	}
}
