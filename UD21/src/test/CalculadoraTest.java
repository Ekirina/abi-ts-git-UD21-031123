package test;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JButton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio4.Calculadora;

class CalculadoraTest {
	
	Calculadora calculator = new Calculadora();
	String mas = "+";
	String menos = "-";
	String por = "x";
	String div = "/";
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Calculadora calculator = new Calculadora();
	}
	
	@Test
	void makeOperationsuma() {
		calculator.num1="2";
		calculator.signo=mas;
		calculator.textField.setText("4");
		String result = "6.0";
		calculator.makeOperation();
		assertEquals(result, calculator.num1);
	}
	@Test
	void makeOperationmenos() {
		calculator.num1="4";
		calculator.signo=menos;
		calculator.textField.setText("4");
		String result = "0.0";
		calculator.makeOperation();
		assertEquals(result, calculator.num1);
	}
	@Test
	void makeOperationpor() {
		calculator.num1="2";
		calculator.signo=por;
		calculator.textField.setText("4");
		String result = "8.0";
		calculator.makeOperation();
		assertEquals(result, calculator.num1);
	}
	@Test
	void makeOperationdiv() {
		calculator.num1="4";
		calculator.signo=div;
		calculator.textField.setText("4");
		String result = "1.0";
		calculator.makeOperation();
		assertEquals(result, calculator.num1);
	}
	@Test
	void makeOperationdiv0() {
		calculator.num1="4";
		calculator.signo=div;
		calculator.textField.setText("0");
		String result = "0.0";
		calculator.makeOperation();
		assertEquals(result, calculator.num1);
	}

	@Test
	void textField() {
		boolean vacio = true;
		calculator.makeOperation();
		assertEquals(vacio, calculator.textField.getText().isEmpty());
	}
}
