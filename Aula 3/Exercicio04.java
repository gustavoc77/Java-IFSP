package Exercicios;

import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exercicio04 {

	public static void main(String[] args) {
		int numero1 = 257;
		System.out.println(String.format("%05d", numero1));
		
		String numero2 = "2350000";
		System.out.println(numero2.replaceAll("(\\d{0})(\\d{1})(\\d{2})" , "$2.$3"));
		
		DecimalFormat df = new DecimalFormat("##0.000");
		System.out.println(df.format(5.6));
		
		double porcentagem = 1.278;
		NumberFormat nf = NumberFormat.getPercentInstance();
		nf.setMinimumFractionDigits(1);
		System.out.println(nf.format(porcentagem));
		
		Calendar data_hora = Calendar.getInstance();
		data_hora.set(2016, 06, 15);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/YYYY");
		System.out.print(new DateFormatSymbols().getWeekdays()[data_hora.get(Calendar.DAY_OF_WEEK)] + ", ");
		System.out.println(sdf.format(data_hora.getTime()));
		
	}

}
