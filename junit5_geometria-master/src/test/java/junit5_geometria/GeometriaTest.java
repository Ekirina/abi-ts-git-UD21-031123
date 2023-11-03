package junit5_geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	static Geometria calcular = new Geometria();
	Geometria figura = new Geometria(1);
	double area = 0.0;
	Geometria defaultfigura = new Geometria();
	
	@Test
	public void testApp() {
		calcular = new Geometria();
		area = calcular.getArea();
		calcular.setArea(area);		
		System.out.println(calcular);
	}

	@BeforeEach
	public void object() {
		 calcular = new Geometria();
	}
	
	@Test
	public void testDefault(){
		assertEquals(9, defaultfigura.getId());
        assertEquals("Default", defaultfigura.getNom());
        assertEquals(0.0, defaultfigura.getArea());
		}

	@BeforeEach
	public void before() {
		System.out.println("before()");
		calcular = new Geometria(1);
		calcular = new Geometria(2);
		calcular = new Geometria(3);
		calcular = new Geometria(4);
		calcular = new Geometria(5);
		calcular = new Geometria(6);
		calcular = new Geometria(7);
		calcular = new Geometria(8);
		calcular = new Geometria();
	}

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
	@Test
	public void getId() {
		assertEquals(1, figura.getId());
	}
	@Test
	public void setId() {
		figura.setId(1);
		assertEquals(1, figura.getId());
	}
	@Test
	public void getNom() {
		assertEquals("cuadrado", figura.getNom());
	}
	@Test
	public void setNom() {
		figura.setNom("cuadrado");
		assertEquals("cuadrado", figura.getNom());
	}
	@Test
	public void getArea() {
		area = calcular.getArea();
		assertEquals(0.0, calcular.getArea());
	}
	@Test
	public void setArea() {
		calcular.setArea(0.0);
		assertEquals(0.0, calcular.getArea());
	}
	@AfterAll
	public static void testToString() {
        String esperado = "Geometria [id=9, nom=Default, area=0.0]";
        assertEquals(esperado, calcular.toString());
	}
	
}
