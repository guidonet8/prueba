package ar.edu.unlam.pb2.dado;

import org.junit.Assert;
import org.junit.Test;

public class DadoTest {

	@Test
	public void testQueAlLanzarMiDadoObtengoValorEsperado() {
		// 1. Preparación
		Dado miDado = new Dado(6);
		
		Integer min = 1;
		Integer max = 6;
		
		// 2. Ejecución
		Integer miCaraDado = miDado.lanzar();
		
		// 3. Constrastación
		Assert.assertTrue("El valor está entre 1 y 6", miCaraDado >= min && miCaraDado <= max);
	}
}
