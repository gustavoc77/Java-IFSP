package Exercicios;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String [] args) {
		int opcao=-1;
		int dias_adicionados, meses_adicionados, anos_adicionados, horas_adicionadas, minutos_adicionados;
		int dias_subtraidos, meses_subtraidos, anos_subtraidos,horas_subtraidas, minutos_subtraidos;
		String pausa;
		
		
		Calendar data_hora = Calendar.getInstance();
		Scanner s = new Scanner(System.in);
		System.out.println("Dia: " + data_hora.get(Calendar.DAY_OF_MONTH));
		System.out.println("M�s: " + data_hora.get(Calendar.MONTH));
		System.out.println("Ano: " + data_hora.get(Calendar.YEAR));
		
		System.out.print("Horas " + data_hora.get(Calendar.HOUR_OF_DAY));
		System.out.print(" : " + data_hora.get(Calendar.MINUTE));
		System.out.print(" : " + data_hora.get(Calendar.SECOND));
		
		do {
			System.out.println("\nEscolha uma op��o: ");
			System.out.println("0 - Sair ");
			System.out.println("1 - Adicionar dias: ");
			System.out.println("2 - Adicionar meses ");
			System.out.println("3 - Adicionar anos ");
			System.out.println("4 - Adicionar horas");
			System.out.println("5 - Adicionar minutos");
			System.out.println("6 - Subtrair dias ");
			System.out.println("7 - Subtrair meses");
			System.out.println("8 - Subtrair anos");
			System.out.println("9 - Subtrair horas");
			System.out.println("10 - Subtrair minutos");
			System.out.println("11 - Obter dia da semana");
			System.out.println("Op��o: "); opcao = s.nextInt();
			
			switch (opcao) {
				case 0:
					break;
					
				case 1:
					System.out.println("Quantos dias voc� deseja adicionar? "); 
					dias_adicionados = s.nextInt();
					data_hora.set(Calendar.DAY_OF_MONTH, data_hora.get(Calendar.DAY_OF_MONTH) + dias_adicionados);
					System.out.println(data_hora.get(Calendar.DAY_OF_MONTH));
					System.out.println(" / " + data_hora.get(Calendar.MONTH));
					System.out.println(" / " + data_hora.get(Calendar.YEAR));
					pausa = s.next(); 
					break;
					
				case 2:
					System.out.println("Quantos meses voc� deseja adicionar? ");
					meses_adicionados = s.nextInt();
					data_hora.set(Calendar.MONTH, data_hora.get(Calendar.MONTH) + meses_adicionados);
					System.out.print(data_hora.get(Calendar.DAY_OF_MONTH));
					System.out.print(" / " + data_hora.get(Calendar.MONTH));
					System.out.print("  " + data_hora.get(Calendar.YEAR));
					break;
					
				case 3:
					System.out.println("Quantos anos voc� deseja adicionar? ");
					anos_adicionados = s.nextInt();
					data_hora.set(Calendar.YEAR, data_hora.get(Calendar.YEAR) + anos_adicionados);
					System.out.print(data_hora.get(Calendar.DAY_OF_MONTH));
					System.out.print(" / " + data_hora.get(Calendar.MONTH));
					System.out.print("  " + data_hora.get(Calendar.YEAR));
					break;
					
				case 4:
					System.out.println("Quantas horas voc� deseja adicionar? ");
					horas_adicionadas = s.nextInt();
					data_hora.set(Calendar.HOUR, data_hora.get(Calendar.HOUR) + horas_adicionadas);
					System.out.print(data_hora.get(Calendar.HOUR));
					System.out.print(":" + data_hora.get(Calendar.MINUTE));
					System.out.print(":" + data_hora.get(Calendar.SECOND));
					break;
				
				case 5:
					System.out.println("Quantos minutos voc� deseja adicionar?");
					minutos_adicionados = s.nextInt();
					data_hora.set(Calendar.MINUTE, data_hora.get(Calendar.MINUTE) + minutos_adicionados);
					System.out.print("Horas " + data_hora.get(Calendar.HOUR_OF_DAY));
					System.out.print(" : " + data_hora.get(Calendar.MINUTE));
					System.out.print(" : " + data_hora.get(Calendar.SECOND));
					break;
					
				case 6:
					System.out.println("Quantos dias voc� deseja subtrair?");
					dias_subtraidos = s.nextInt();
					data_hora.set(Calendar.DAY_OF_MONTH, data_hora.get(Calendar.DAY_OF_MONTH ) - dias_subtraidos);
					System.out.println(data_hora.get(Calendar.DAY_OF_MONTH));
					System.out.println(" / " + data_hora.get(Calendar.MONTH));
					System.out.println(" / " + data_hora.get(Calendar.YEAR));
					break;
					
				case 7:
					System.out.println("Quantos meses voc� deseja subtrair?");
					meses_subtraidos = s.nextInt();
					data_hora.set(Calendar.MONTH, data_hora.get(Calendar.MONTH) - meses_subtraidos);
					System.out.println(data_hora.get(Calendar.DAY_OF_MONTH));
					System.out.println(" / " + data_hora.get(Calendar.MONTH));
					System.out.println(" / " + data_hora.get(Calendar.YEAR));
					
					break;
					
				case 8:
					System.out.println("Quantos anos voc� deseja subtrair?");
					anos_subtraidos = s.nextInt();
					data_hora.set(Calendar.YEAR, data_hora.get(Calendar.YEAR) - anos_subtraidos);
					System.out.println(data_hora.get(Calendar.DAY_OF_MONTH));
					System.out.println(" / " + data_hora.get(Calendar.MONTH));
					System.out.println(" / " + data_hora.get(Calendar.YEAR));
					break;
					
				case 9:
					System.out.println("Quantas horas voc� deseja subtrair?");
					horas_subtraidas = s.nextInt();
					data_hora.set(Calendar.HOUR, data_hora.get(Calendar.HOUR) - horas_subtraidas);
					System.out.print(data_hora.get(Calendar.HOUR));
					System.out.print(":" + data_hora.get(Calendar.MINUTE));
					System.out.print(":" + data_hora.get(Calendar.SECOND));
					break;
					
				case 10:
					System.out.println("Quantos minutos voc� deseja subtrair?");
					minutos_subtraidos = s.nextInt();
					data_hora.set(Calendar.MINUTE, data_hora.get(Calendar.MINUTE) - minutos_subtraidos);
					System.out.print(data_hora.get(Calendar.HOUR));
					System.out.print(":" + data_hora.get(Calendar.MINUTE));
					System.out.print(":" + data_hora.get(Calendar.SECOND));
					break;
					
				case 11:
					System.out.println("Dia da semana: " + data_hora.get(Calendar.DAY_OF_WEEK));
					break;	
				
				default:
					System.out.println("Digite uma op��o v�lida!");
					break;
			}
		}while(opcao != 0);
		
		
	}

}


/*1) Adicionar dias � Solicitar ao usu�rio quantos dias devem ser adicionados.
2) Adicionar meses � Solicitar ao usu�rio quantos meses devem ser adicionados.
3) Adicionar anos � Solicitar ao usu�rio quantos anos devem ser adicionados.
4) Adicionar horas � Solicitar ao usu�rio quantas horas devem ser adicionadas.
5) Adicionar minutos � Solicitar ao usu�rio quantos minutos devem ser adicionados.
6) Subtrair dias � Solicitar ao usu�rio quantos dias devem ser subtra�dos.
7) Subtrair meses � Solicitar ao usu�rio quantos meses devem ser subtra�dos.
8) Subtrair anos � Solicitar ao usu�rio quantos anos devem ser subtra�dos.
9) Subtrair horas � Solicitar ao usu�rio quantas horas devem ser subtra�das.
10) Subtrair minutos � Solicitar ao usu�rio quantos minutos devem ser subtra�dos.
11)Obter dia da semana*/