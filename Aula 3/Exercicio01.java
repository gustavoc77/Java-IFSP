package Exercicios;

import java.math.*;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int i=-1;
		double decimal;
		do {
			System.out.println("1 - Arredondar N�mero");
			System.out.println("2 - Arredondar para o pr�ximo inteiro menor");
			System.out.println("3 - Arredondar para o pr�ximo inteiro maior");
			System.out.println("4 - Calcular ra�z quadrada");
			System.out.println("5 - Calcular a potencia");
			System.out.println("0 - Sair");
			i = s.nextInt();
			switch(i) {
		    	case 1: 
		    		System.out.println("Digite um valor decimal: "); 
		    		decimal = s.nextFloat();
		    		System.out.println("Valor arredondado:  " + Math.round(decimal));
		    		break;
		    		
		    	case 2:
		    		System.out.println("Digite um valor decimal: ");
		    		decimal = s.nextFloat();
		    		System.out.println("Valor arredondado:  " + Math.floor(decimal));
		    		break;
		    		
		    	case 3: 
		    		System.out.println("Digite um valor decimal: ");
		    		decimal = s.nextDouble();
		    		System.out.println("Valor arredondado: " + Math.ceil(decimal));
		    		break;
		    		
		    	case 4: 
		    		System.out.println("Digite um n�mero maior ou igual a zero: ");
		    		decimal = s.nextDouble();
		    		if(decimal < 0) {
		    			System.out.println("ERRO! N�MERO INV�LIDO");
		    			break;
		    		}
		    		else {
		    			System.out.println("Ra�z Quadrada do " + decimal + ": " + Math.sqrt(decimal));
		    			break;
		    		}
		    		
		    	case 5: 
		    		System.out.print("Digite a base: "); int base = s.nextInt();
		    		System.out.print("Digite o expoente: "); double expoente = s.nextDouble();
		    		System.out.println("Potencia de  " + base + "elevado a "+ expoente + "= " + Math.pow(base, expoente));
		    		break;
		    		
		    		
			}
		}while(i != 0);
	}

}
