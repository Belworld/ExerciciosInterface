package Exercicio02;

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
		JLabel produto = new JLabel();
		produto.setText("Nome do produto ");
		produto.setBounds(10,10, 150, 20);
		
		JLabel valor = new JLabel();
		valor.setText("Informe o valor ");
		valor.setBounds(10,20, 160, 40);
		
		
		//JTextField
		JTextField campo = new JTextField();
		campo.setBounds(170, 10, 150, 20);
		
		JTextField campo1 = new JTextField();
		campo1.setBounds(170, 30, 150, 20);
		
		//JButton
				JButton botao = new JButton("Clique aqui");
				botao.setBounds(170, 100, 150, 20);
				
				//Acao
				botao.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						double valor = Double.parseDouble(campo1.getText())*0.9;
						JOptionPane.showMessageDialog(null, " produto com 10% de desconto  " +valor);
						
						
					}
				});
		
		//Adicionar elementos ao JFrame
		formulario.add(produto);
		formulario.add(campo);
		formulario.add(valor);
		formulario.add(campo1);
		formulario.add(botao);
		
		//Exibir o formulario
		formulario.repaint();
		formulario.setVisible(true);

	}

}
