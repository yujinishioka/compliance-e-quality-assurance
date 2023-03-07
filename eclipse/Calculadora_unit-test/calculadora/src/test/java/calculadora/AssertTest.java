package calculadora;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AssertTest {

	@Test
	public void testAssertArrayEquals() {
		// compara arrays: pegar arrays e comparar bytes
		byte[] esperado = "teste".getBytes();
		
		// Teste passando
		// byte[] atual = "teste".getBytes();
		// assertArrayEquals(esperado, atual);
		
		// Teste falhando
		byte[] atual = "testeError".getBytes();
		assertArrayEquals(esperado, atual);
	}

	@Test
	public void testAssertEquals() {
		// compara arrays: validar duas strings
		assertEquals("text", "text");
	}

	@Test
	public void testAssertFalse() {
		// validar booleano: validar se objeto é false ou verdadeiro
		assertFalse(false);
	}

	@Test
	public void testAssertNotNull() {
		// Validar assert notNull "se objetos não esta retornando valor null"
		assertNotNull(new Object());

	}

	@Test
	public void testAssertNotSame() {
		// Validar assert notSame "se objetos não são os mesmos"
		assertNotSame(new Object(), new Object());

	}

	@Test
	public void testAssertNull() {
		// Validar assert Null "se objetos realmente esta null"
		assertNull(null);

	}

	@Test
	public void testAssertSame() {
		// Validar assert Same "se objetos são os mesmos"
		Integer aNumber = Integer.valueOf(765);
		assertSame(aNumber, aNumber);

	}

}
