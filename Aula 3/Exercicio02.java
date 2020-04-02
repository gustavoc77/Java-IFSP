package Exercicios;

public class Exercicio02 {
	public static void main(String [] args) {
		String frase = "Uma ideia traz outra; o boticário imaginou que, uma vez preso o alienista, viriam também buscá-lo a ele, na qualidade de cúmplice. Esta ideia foi o melhor dos vesicatórios. Crispim Soares ergueu-se, disse que estava bom, que ia sair; e apesar de todos os esforços e protestos da consorte vestiu-se e saiu. Os velhos cronistas são unânimes em dizer que a certeza de que o marido ia colocar-se	nobremente ao lado do alienista consolou grandemente a esposa do boticário; e notam com muita perspicácia, o imenso poder moral de uma ilusão; porquanto, o boticário caminhou resolutamente ao palácio do governo, não à casa do alienista. Ali chegando, mostrou-se admirado de não ver o barbeiro, a quem ia apresentar os seus protestos de adesão, não o tendo feito desde a véspera por enfermo. E tossia com algum custo. Os altos funcionários que lhe ouviam esta declaração, sabedores da intimidade do boticário com o alienista, compreenderam toda a importância da adesão nova e trataram a Crispim Soares com apurado carinho; afirmaram-lhe que o barbeiro não tardava; Sua Senhoria tinha ido à Casa Verde, a negócio importante, mas não tardava. Deram-lhe cadeira, refrescos, elogios; disseram-lhe que a causa do ilustre Porfírio era a de todos os patriotas;ao que o boticário ia repetindo que sim, que nunca pensara outra coisa, que isso mesmo mandaria declarar a Sua Majestade.";
		System.out.println("A frase é: " + frase.substring(frase.indexOf("E tossia"), frase.lastIndexOf("Os altos")));
		
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
		System.out.println(frase.indexOf("não"));
		System.out.println(frase.lastIndexOf("não"));
		System.out.println(frase.substring(604, 1122));
		//System.out.println("Quantas vezes a palavra não aparece no texto? " + + "vezes.");
		
		int tamanho_frase = frase.length();
		System.out.println("Número de caracteres do texto: " + frase.length());
		String frase_sem_espaco = frase.replace(" ", "");
		int tamanho_frase_espaco = frase_sem_espaco.length();
		System.out.println("Quantidade de espaços: " + (tamanho_frase - tamanho_frase_espaco));
		
	}
}
