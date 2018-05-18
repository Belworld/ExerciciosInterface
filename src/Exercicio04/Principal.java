package Exercicio04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
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
		formulario.setSize(500, 200);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null); 
		
		//Jlabel
		JLabel nome = new JLabel();
		nome.setText("Nome do Produto");
		nome.setBounds(10,10, 150, 20);
		
		JLabel valor = new JLabel();
		valor.setText("Informe o valor");
		valor.setBounds(10, 20, 160, 40);
		
		JLabel Text = new JLabel();
		Text.setText("FORMA DE PAGAMENTO");
		Text.setBounds(10, 80, 160, 40);
		
		//JRadioButton
		JRadioButton avista = new JRadioButton("A vista");
		avista.setBounds(10, 120, 100, 20);
		avista.setActionCommand("A vista");
		
		//JRadioButton
		JRadioButton aprazo = new JRadioButton("A prazo");
		aprazo.setBounds(110, 120, 100, 20);
		aprazo.setActionCommand("A prazo");
		
		//ButtonGroup
		ButtonGroup formadepaga = new ButtonGroup();
		formadepaga.add(avista);
		formadepaga.add( aprazo);
		
		//JTextField
		JTextField campo1 = new JTextField();
		campo1.setBounds(170, 10, 150, 20);
		
		JTextField campo2 = new JTextField();
		campo2.setBounds(170, 30, 150, 20);
		
		//JButton
				JButton botao = new JButton("Click Here");
				botao.setBounds(220, 120, 200, 20);
				
				//Acao
				botao.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if((avista.isSelected() == true) && (Double.parseDouble(campo2.getText()) >= 500)) {					
						
							
							
							 JOptionPane.showMessageDialog(null,"Desconto de 10%. Você irá pagar R$"+(Double.parseDouble(campo2.getText())*0.90));
						}else{
							 JOptionPane.showMessageDialog(null,"Você irá pagar R$"+campo2.getText());
						}
						 
						
						
					   
						
					}
				});
		
		//Adicionar elementos ao JFrame
		formulario.add(nome);
		formulario.add(campo1);
		formulario.add(valor);
		formulario.add(campo2);
		formulario.add(avista);
		formulario.add(aprazo);
		formulario.add(Text);
		formulario.add(botao);
		
		
		
		//Exibir o formulario
		formulario.repaint();
		formulario.setVisible(true);


	}

}
