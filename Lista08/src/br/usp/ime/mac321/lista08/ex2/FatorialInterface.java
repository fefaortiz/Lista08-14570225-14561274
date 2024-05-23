package br.usp.ime.mac321.lista08.ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import br.usp.ime.mac321.lista08.ex1.FatorialController;

public class FatorialInterface extends JFrame {
    public JTextField textField;
    public JButton calcularButton;
    public JLabel resultadoLabel;
    public JPanel panel;
    public JDialog dialog;

    public FatorialInterface() {
    	setTitle("Cálculo de Fatorial");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textField = new JTextField(10);
        calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(new acionaBotão());
        resultadoLabel = new JLabel("Resultado: ");
        panel = new JPanel();
        
        panel.add(textField);
        panel.add(calcularButton);
        panel.add(resultadoLabel);
        
        add(panel);
    }
    
    private class acionaBotão implements ActionListener {
    	public acionaBotão() {
    	}
    	
    	public void actionPerformed(ActionEvent e) {
            calcularFatorial();
        }
    }
    
    private void calcularFatorial() {
        int num = Integer.parseInt(textField.getText());
        
        if(num < 0) {
        	throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        	
        BigDecimal resultado = FatorialController.calculaFatorial(num);
        resultadoLabel.setText("Resultado: " + resultado);    	
    }

    // nn uso no teste para nn dar erro
    private void fatorialRobusto() {
        try {
        	calcularFatorial();
        	
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(panel, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(panel, "O número não pode ser negativo.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panel, "Ocorreu um erro ao calcular o fatorial.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FatorialInterface().setVisible(true);;
            }
        });
    }
}

