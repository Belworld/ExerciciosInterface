package Exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	private static final String ActionListener = null;

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
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe seu nome");		
		rotulo.setBounds(10,10, 150, 20);
		
		JLabel rotulo1 = new JLabel();
		rotulo1.setText("informe sua idade");		
		rotulo1.setBounds(10, 20, 160, 40);
		
		JLabel rotulo2 = new JLabel();
		rotulo2.setText("informe sua Cidade");		
		rotulo2.setBounds(10,30,170, 60);
		
		
		//JTextField
		JTextField campo = new JTextField();
		campo.setBounds(170, 10, 150, 20);
		
		JTextField campo1 = new JTextField();
		campo1.setBounds(170, 30, 150, 20);
		
		JTextField campo2 = new JTextField();
		campo2.setBounds(170, 50, 150, 20);
		
		//JButton
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(170, 100, 150, 20);
		
		//Acao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, " Olá " +campo.getText()+" você tem " +campo1.getText()+" anos de idade e mora em "+campo2.getText());
				
			}
		});
		
		
		
		//Adicionar elementos ao JFrame
		formulario.add(rotulo);
		formulario.add(campo);
		formulario.add(rotulo1);
		formulario.add(campo1);
		formulario.add(rotulo2);
		formulario.add(campo2);
		formulario.add(botao);
		
		//Exibir o formulario
		formulario.repaint();
		formulario.setVisible(true);


	}

}
