package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora calc = new Calculadora();

	@Test
	public void testSomar() {
		int valor1 = 2;
		int valor2 = 3;
		int resultado = calc.somar(valor1,valor2);
		assertEquals(5, resultado);
	}

	@Test
	public void testSubtrair() {
		int valor1 = 2;
		int valor2 = 3;
		int resultado = calc.subtrair(valor1,valor2);
		assertEquals(-1, resultado);
	}

	@Test
	public void testMultiplicar() {
		int valor1 = 2;
		int valor2 = 3;
		int resultado = calc.multiplicar(valor1,valor2);
		assertEquals(6, resultado);
	}

	@Test
	public void testDividir() {
		int valor1 = 6;
		int valor2 = 3;
		int resultado = calc.dividir(valor1,valor2);
		assertEquals(2, resultado);
	}
}
