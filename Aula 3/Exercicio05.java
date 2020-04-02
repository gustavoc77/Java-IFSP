package Exercicios;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) throws ParseException {
		int opcao=-1;
		Scanner s = new Scanner(System.in);
		String pausa, numero = "150";
		String data = "09/03/2020";
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Converter para int");
			System.out.println("2 - Converter para long");
			System.out.println("3 - Converter para float");
			System.out.println("4 - Converter para double");
			System.out.println("5 - Converter para Calendar (data)");
			System.out.println("6 - Converter para Calendar (hora)");
			System.out.print("Escolha: ");opcao = s.nextInt();

			switch (opcao) {
			case 0:
				break;
				
			case 1: 
				System.out.println("String->Integer: " + Integer.parseInt(numero));
				pausa = s.next();
				break;
			
			case 2: 
				System.out.println("String->Long: " + Long.parseLong(numero) );
				pausa = s.next();
				break;
			
			case 3:
				System.out.println("String->Float: " + Float.parseFloat(numero) );
				pausa = s.next();
				break;
				
			case 4: 
				System.out.println("String->Double: " + Double.parseDouble(numero) );
				pausa = s.next();
				break;
				
			case 5:
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Calendar d =  Calendar.getInstance();
				d.setTime(sdf.parse(data));
				System.out.println("String->Calendar: \n"+ 
				"Dia: " + d.get(Calendar.DAY_OF_MONTH) + "\n" +
				"Mês " + d.get(Calendar.MONTH) + "\n" + 
				"Ano: " + d.get(Calendar.YEAR));
				break;
				
			case 6:
				String str = "06:50"; 
				SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
				Date data2 = formatador.parse(str); 
				Time time = new Time(data2.getTime());
				break;
				
			}
		}while(opcao != 0);
	}
}
