package Exercicio08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
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
		JLabel numero1 = new JLabel();
		numero1.setText("Informe o primeiro numero");
		numero1.setBounds(10,10, 170, 20);
		
		JLabel numero2 = new JLabel();
		numero2.setText("Informe o segundo numero");
		numero2.setBounds(10,30, 170, 20);
		
		JRadioButton operacao1 = new JRadioButton("SOMA");
		operacao1.setBounds(10, 120, 100, 20);
		operacao1.setActionCommand("SOMA");
		
		JRadioButton operacao2 = new JRadioButton("SUBSTRACAO");
		operacao2.setBounds(110, 120, 120, 20);
		operacao2.setActionCommand("SUBSTRACAO");
		
		JRadioButton operacao3 = new JRadioButton("MULTIPLICACAO");
		operacao3.setBounds(230, 120, 120, 20);
		operacao3.setActionCommand("MULTIPLICACAO");
		
		JRadioButton operacao4 = new JRadioButton("DIVISAO");
		operacao4.setBounds(350, 120, 120, 20);
		operacao4.setActionCommand("DIVISAO");
		
		//JTextField
		JTextField campo1 = new JTextField();
		campo1.setBounds(170, 10, 150, 20);
		
		JTextField campo2 = new JTextField();
		campo2.setBounds(170, 30, 150, 20);
		
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(170, 200, 150, 20);
		
		ButtonGroup operacao = new ButtonGroup();
		operacao.add(operacao1);
		operacao.add( operacao2);
		operacao.add(operacao3);
		operacao.add(operacao4);
		
		//Acao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double valor1 =  Double.parseDouble(campo1.getText());
				double valor2 =  Double.parseDouble(campo2.getText());
				
				
				if((operacao1.isSelected()) == true){
					JOptionPane.showMessageDialog(null, valor1+" + "+valor2+" = "+(valor1+valor2));
		                 }else if((operacao2.isSelected()) == true){
		                        JOptionPane.showMessageDialog(null,  Double.parseDouble(campo1.getText())+" - "+ Double.parseDouble(campo2.getText())+" = "+( Double.parseDouble(campo1.getText())- Double.parseDouble(campo2.getText())));
				}else if(operacao3.isSelected() == true){
					JOptionPane.showMessageDialog(null,  Double.parseDouble(campo1.getText())+" * "+ Double.parseDouble(campo2.getText())+" = "+( Double.parseDouble(campo1.getText())* Double.parseDouble(campo2.getText())));
				}else if(operacao4.isSelected() == true){
					JOptionPane.showMessageDialog(null,  Double.parseDouble(campo1.getText())+" / "+ Double.parseDouble(campo2.getText())+" = "+( Double.parseDouble(campo1.getText())/ Double.parseDouble(campo2.getText())));
				
				}
				
			}
		});
		
		//Adicionar elementos ao JFrame
		formulario.add(numero1);
		formulario.add(campo1);
		formulario.add(numero2);
		formulario.add(campo2);
		formulario.add(operacao1);
		formulario.add(operacao2);
		formulario.add(operacao3);
		formulario.add(operacao4);
		formulario.add(botao);
		
		
		//Exibir o formulario
		formulario.repaint();
		formulario.setVisible(true);

	}

}
