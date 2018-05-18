package Exercicio05;

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
		JLabel dia = new JLabel();
		dia.setText("Informe o dia");
		dia.setBounds(10,10, 150, 20);
		
		//JTextField
		JTextField campo = new JTextField();
		campo.setBounds(102, 10, 150, 20);
		
		//JButton
				JButton botao = new JButton("Clique aqui");
				botao.setBounds(40, 50, 150, 20);
				
				//Acao
				botao.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						 if ((Double.parseDouble(campo.getText()) < 1)||(Double.parseDouble(campo.getText()) > 28)) {
								JOptionPane.showMessageDialog(null,"dia invalido");
							}else if ((Double.parseDouble(campo.getText()) == 3)
								   || (Double.parseDouble(campo.getText()) == 4)
								   || (Double.parseDouble(campo.getText()) == 10)
								   || (Double.parseDouble(campo.getText()) == 11)
								   || (Double.parseDouble(campo.getText()) == 17)
								   || (Double.parseDouble(campo.getText()) == 18)
								   || (Double.parseDouble(campo.getText()) == 24)
								   || (Double.parseDouble(campo.getText()) == 25)) {
								JOptionPane.showMessageDialog(null, "é final de semana");
							}else{
					  			JOptionPane.showMessageDialog(null, "esse dia não é um final de semana");
						
							}
					}
				});
		
		//Adicionar elementos ao JFrame
		formulario.add(dia);
		formulario.add(campo);
		formulario.add(botao);
		
		//Exibir o formulario
		formulario.repaint();
		formulario.setVisible(true);

	}

}
