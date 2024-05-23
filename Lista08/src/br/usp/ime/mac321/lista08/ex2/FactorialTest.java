package br.usp.ime.mac321.lista08.ex2;

import org.junit.Test;
import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
	
	@Test
	public void TestWithNumbers() {
		FatorialInterface teste = new FatorialInterface();
		JTextField textField = teste.textField;
	    JButton calcularButton = teste.calcularButton;
	    JLabel resultadoLabel = teste.resultadoLabel;
	    
	    textField.setText("9");
	    calcularButton.doClick();
	    
	    assertEquals("Resultado: 362880", resultadoLabel.getText());
	    
	    textField.setText("4");
	    calcularButton.doClick();
	    
	    assertEquals("Resultado: 24", resultadoLabel.getText());
	    
	    textField.setText("6");
	    calcularButton.doClick();
	    
	    assertEquals("Resultado: 720", resultadoLabel.getText());
	}
	
	@Test
	public void TestWithNegative() throws IllegalArgumentException{
		FatorialInterface teste = new FatorialInterface();
		JTextField textField = teste.textField;
	    JButton calcularButton = teste.calcularButton;
	    JLabel resultadoLabel = teste.resultadoLabel;
	    JDialog dialog = teste.dialog;
	    
	    textField.setText("-1");
	    assertThrows( IllegalArgumentException.class, () -> calcularButton.doClick());
	   
	    textField.setText("-8");
	    assertThrows( IllegalArgumentException.class, () -> calcularButton.doClick());
	 
	}
	
	@Test
	public void TestWithVoid() throws NumberFormatException {
		FatorialInterface teste = new FatorialInterface();
		JTextField textField = teste.textField;
	    JButton calcularButton = teste.calcularButton;
	    JLabel resultadoLabel = teste.resultadoLabel;
	    JDialog dialog = teste.dialog;
	    
	    textField.setText("");
	    assertThrows(NumberFormatException.class, () -> calcularButton.doClick());

	}
	
	@Test
	public void TestWithMoreThan10() throws NumberFormatException {
		FatorialInterface teste = new FatorialInterface();
		JTextField textField = teste.textField;
	    JButton calcularButton = teste.calcularButton;
	    JLabel resultadoLabel = teste.resultadoLabel;
	    JDialog dialog = teste.dialog;
	    
	    textField.setText("10000000000");
	    assertThrows(NumberFormatException.class, () -> calcularButton.doClick());
	    
	}
}
