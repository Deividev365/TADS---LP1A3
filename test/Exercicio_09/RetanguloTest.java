package Exercicio_09;

import org.junit.Assert;
import org.junit.Test;

import Aula_09.Retangulo;

public class RetanguloTest {

	
	
	Retangulo retangulo;
	
	@Test
	public void testCalcularArea() {
		
		retangulo = new Retangulo(10, 2);
		
		int resultadoEsperado = 20;
		
		
		int resultado = retangulo.calcularArea();
		
		
		if(resultado == resultadoEsperado) {
			
				Assert.assertTrue(true);		
		} else {
			
			Assert.assertTrue(false);		
			
		}
	}
	
	@Test
	public void testCalcularPerimetro() {
		
		retangulo = new Retangulo(10, 2);
		
		int resultadoEsperado = 24;
		
		int resultado = retangulo.calcularPerimetro();
		
		
		if(resultado == resultadoEsperado) {
			
			Assert.assertTrue(true);		
			
		} else {
			
			Assert.assertTrue(false);		
		}
	}	
}
