package junit5_geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;


class GeometriaTest {

	Geometria calcular = new Geometria();

	@BeforeAll
	public static void testBeforeClass(){
		System.out.println("beforeClass");
	}

	@AfterAll
	public static void AfterClass() {
		System.out.println("afterClass");
	}

	@BeforeEach
	public void before() {
		System.out.println("before()");
		Geometria calcular = new Geometria();
	}

	/*@AfterEach
	public void after() {
		System.out.println("after()");
		calcular.clear();
	}*/

	@Test
	public void testAreaCuadrado() {
		double resultado = calcular.areacuadrado(5);
		double esperado = 25;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaCirculo() {
		double resultado = calcular.areaCirculo(4);
		double esperado = 50.265;
		double delta = 0.3;
		assertEquals(esperado, resultado, delta);
	}
	@Test
	public void testAreaTriangulo() {
		double resultado = calcular.areatriangulo(4, 6);
		double esperado = 12;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaRectangulo() {
		double resultado = calcular.arearectangulo(4, 6);
		double esperado = 24;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaPentagono() {
		double resultado = calcular.areapentagono(4, 8);
		double esperado = 16;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaRombo() {
		double resultado = calcular.arearombo(4, 4);
		double esperado = 8;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaRomboide() {
		double resultado = calcular.arearomboide(4, 6);
		double esperado = 24;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testAreaTrapecio() {
		double resultado = calcular.areatrapecio(4, 6, 8);
		double esperado = 40;
		assertEquals(esperado, resultado);
	}
	
	/*@Test
	public void testSetArea() {
	
		double resultado = calcular.setArea(20);
		
	}*/
}
