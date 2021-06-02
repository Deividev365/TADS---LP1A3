package Aula_02;

import java.util.*;
import java.text.*;

public class exercicio4 {

	public static void main(String[] args) {
		
		int numero1 = 257;
		
		System.out.println(String.format("%05d", numero1));
		
		
		
		DecimalFormat decimalFormat = new DecimalFormat("##0.000");
		DecimalFormat decimalFormat2 = new DecimalFormat("##,##0");
		
		System.out.println(decimalFormat.format(5.6));
		System.out.println(decimalFormat2.format(2350000));
		
		
		double porcentagem = 1.278;
		
		NumberFormat numberFormat = NumberFormat.getPercentInstance();
		
		numberFormat.setMinimumFractionDigits(1);
		
		System.out.println(numberFormat.format(porcentagem));
		
		
		//julho = 5 (0, 11) //
		
		Calendar data = Calendar.getInstance();
		
		data.set(2016, 5, 17);
		
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM/yyyy");
		
		
		System.out.println(new DateFormatSymbols().getWeekdays()[data.get(Calendar.DAY_OF_WEEK)] + "," + sdf.format(data.getTime()));
		
		
		
		
		
		
		
		
	
		
		

	}

}
