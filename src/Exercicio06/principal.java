package Exercicio06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class principal {

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
		JLabel numero1 = new JLabel();
		numero1.setText("Informe o primeiro numero");
		numero1.setBounds(10,10, 160, 20);
		
		JLabel numero2 = new JLabel();
		numero2.setText("Informe o segundo numero");
		numero2.setBounds(10, 20, 160, 40);
		
		//JTextField
		JTextField campo1 = new JTextField();
		campo1.setBounds(190, 10, 150, 20);
		
		JTextField campo2 = new JTextField();
		campo2.setBounds(190, 30, 150, 20);
		
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(170, 100, 150, 20);
		
		//Acao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 if (Double.parseDouble(campo1.getText()) == Double.parseDouble(campo2.getText())){
					    JOptionPane.showMessageDialog(null,  Double.parseDouble(campo1.getText())+ Double.parseDouble(campo2.getText()));
					}else{
					    JOptionPane.showMessageDialog(null,  Double.parseDouble(campo1.getText())*Double.parseDouble(campo2.getText()));
					}
				
			}
		});
		
		//Adicionar elementos ao JFrame
		formulario.add(numero1);
		formulario.add(campo1);		
		formulario.add(numero2);
		formulario.add(campo2);
		formulario.add(botao);
		
		//Exibir o formulario
		formulario.repaint();
		formulario.setVisible(true);


	}

}
