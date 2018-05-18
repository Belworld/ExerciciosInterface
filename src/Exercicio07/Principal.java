package Exercicio07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		// Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null); 
		
		//Jlabel
		JLabel numero = new JLabel();
		numero.setText("Informe o numero");
		numero.setBounds(10,10, 150, 20);
		
		//JTextField
		JTextField campo = new JTextField();
		campo.setBounds(150, 10, 150, 20);
		
		JButton botao = new JButton("Clique aqui para visualizar a tabuada");
		botao.setBounds(170, 100, 270, 20);
		
		//Acao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, Double.parseDouble(campo.getText()) + " x 0 = " + (Double.parseDouble(campo.getText()) * 0)
					    + "\n" + Double.parseDouble(campo.getText()) + " x 1 = " + (Double.parseDouble(campo.getText()) * 1)
					    + "\n" + Double.parseDouble(campo.getText()) + " x 2 = " + (Double.parseDouble(campo.getText()) * 2)
					    + "\n" + Double.parseDouble(campo.getText()) + " x 3 = " + (Double.parseDouble(campo.getText()) * 3)
					    + "\n" + Double.parseDouble(campo.getText()) + " x 4 = " + (Double.parseDouble(campo.getText()) * 4)
					    + "\n" + Double.parseDouble(campo.getText()) + " x 5 = " + (Double.parseDouble(campo.getText()) * 5)	
						    + "\n" + Double.parseDouble(campo.getText()) + " x 6 = " + (Double.parseDouble(campo.getText()) * 6)
					    + "\n" + Double.parseDouble(campo.getText()) + " x 7 = " + (Double.parseDouble(campo.getText()) * 7)
					    + "\n" + Double.parseDouble(campo.getText()) + " x 8 = " + (Double.parseDouble(campo.getText()) * 8)
						    + "\n" + Double.parseDouble(campo.getText()) + " x 9 = " + (Double.parseDouble(campo.getText()) * 9)
					    + "\n" + Double.parseDouble(campo.getText()) + " x 10 = " + (Double.parseDouble(campo.getText()) * 10));

		
			}
		});
		
		//Adicionar elementos ao JFrame
		formulario.add(numero);
		formulario.add(campo);
		formulario.add(botao);
		
		//Exibir o formulario
		formulario.repaint();
		formulario.setVisible(true);

	}

}
