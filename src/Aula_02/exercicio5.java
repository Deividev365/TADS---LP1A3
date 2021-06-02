package Aula_02;

	import java.util.*;
	import java.text.*;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner entradaDeDados = new Scanner(System.in);
		
		
		System.out.println("Ler string para int: ");
		String stringToInteger = entradaDeDados.next();
		
		System.out.println("Conversao String -> int: " + (Integer.parseInt(stringToInteger) + 10));
		
		
		
		System.out.println("Ler string para float: ");
		String stringToFloat = entradaDeDados.next();
		
		System.out.println("Conversao String -> float: " + (Float.parseFloat(stringToFloat) + 10));
		
		
		
		System.out.println("Ler string para double: ");
		String stringToDouble = entradaDeDados.next();
		
		System.out.println("Conversao String -> double: " + (Double.parseDouble(stringToDouble) + 10));
		
		
		
		System.out.println("Ler string para double: ");
		String stringToCalendarData = entradaDeDados.next();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Conversao String -> Calendar(Data): " + (Double.parseDouble(stringToCalendarData) + 10));
		
		
		


		
		
	}

}
