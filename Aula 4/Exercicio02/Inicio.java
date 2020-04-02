package Exercicio02;

public class Inicio {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.salario = 3500;
		
		Funcionario funcionario2 = funcionario1;
		funcionario2.salario = 800;
		
		Funcionario funcionario3 = funcionario2;
		funcionario3.salario += 400;
		
		System.out.println(funcionario1.salario);
		System.out.println(funcionario2.salario);
		System.out.println(funcionario3.salario);
		
		System.out.println(funcionario1);
		System.out.println(funcionario2);
		System.out.println(funcionario3);
		
		System.out.println("RESPOSTAS: ");
		System.out.println("A) Quantas inst�ncias e quantos objetos foram criados no programa?");
		System.out.println("Resposta: 3 inst�ncias foram criadas e apenas um objeto");
		System.out.println("\n");
		System.out.println("B) Quais s�o os nomes das inst�ncias? ");
		System.out.println("Resposta: funcionario1, funcionario2 e funcionario3");
		System.out.println("\n");
		System.out.println("C) Qual(is) o(s) endere�o(s) de mem�ria do objeto(s)?");
		System.out.println("Resposta: 15db9742");
	}

}
