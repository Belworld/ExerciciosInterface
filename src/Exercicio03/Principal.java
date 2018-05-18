package Exercicio03;

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
		JLabel nota1 = new JLabel();
		nota1.setText("Informe Nota 01");
		nota1.setBounds(10,10, 150, 20);
		
		JLabel nota2 = new JLabel();
		nota2.setText("Informe Nota 02");
		nota2.setBounds(10, 20, 160, 40);
		
		JLabel nota3 = new JLabel();
		nota3.setText("Informe Nota 03");
		nota3.setBounds(10,30,170, 60);
		
		JLabel nota4 = new JLabel();
		nota4.setText("Informe Nota 04");
		nota4.setBounds(10,40, 180, 80);
		
		//JTextField
		JTextField campo1 = new JTextField();
		campo1.setBounds(170, 10, 150, 20);
		
		JTextField campo2 = new JTextField();
		campo2.setBounds(170, 30, 150, 20);
		
		JTextField campo3 = new JTextField();
		campo3.setBounds(170, 50, 150, 20);
		
		JTextField campo4 = new JTextField();
		campo4.setBounds(170, 70, 150, 20);
		
		//JButton
				JButton botao = new JButton("Clique aqui");
				botao.setBounds(170, 100, 150, 20);
				
				//Acao
				botao.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						double media1 =  Double.parseDouble(campo1.getText())/4;
						double media2=  Double.parseDouble(campo2.getText())/4;
						double media3= Double.parseDouble(campo3.getText())/4;
						double media4=  Double.parseDouble (campo4.getText())/4;
						
						double media = media1+media2+media3+media4;
						             JOptionPane.showMessageDialog(null,"A media do aluno é " +media);
						if ((media >= 7) && (media <=10) ){
						  	JOptionPane.showMessageDialog(null, "Aprovado");
						}else if ((media >= 5) && (media <= 6.9)){
							JOptionPane.showMessageDialog(null, "Em exame");
						}else{
							JOptionPane.showMessageDialog(null, "Reprovado");
						} 
						
					}
				});
		
		//Adicionar elementos ao JFrame
		formulario.add(nota1);
		formulario.add(campo1);
		formulario.add(nota2);
		formulario.add(campo2);
		formulario.add(nota3);
		formulario.add(campo3);
		formulario.add(nota4);
		formulario.add(campo4);
		formulario.add(botao);
		
		//Exibir o formulario
		formulario.repaint();
		formulario.setVisible(true);

	}

}
