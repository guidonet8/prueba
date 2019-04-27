package ar.edu.unlam.pb2.dado;

import org.junit.Assert;
import org.junit.Test;

public class DadoTest {

	@Test
	public void testQueAlLanzarMiDadoObtengoValorEsperado() {
		// 1. Preparaci�n
		Dado miDado = new Dado(6);
		
		Integer min = 1;
		Integer max = 6;
		
		// 2. Ejecuci�n
		Integer miCaraDado = miDado.lanzar();
		
		// 3. Constrastaci�n
		Assert.assertTrue("El valor est� entre 1 y 6", miCaraDado >= min && miCaraDado <= max);
	}
}
