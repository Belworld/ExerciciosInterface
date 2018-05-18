package Ex05_JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
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
		formulario.setTitle("Utilizando JComboBox");
		formulario.setLayout(null); 
		
		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(10, 10, 270, 30);
		combo.addItem("Item 01");
		combo.addItem("Item 02");
		combo.addItem("Item 03");
		
		//Acao no Combo
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, combo.getSelectedItem());
				
			}
		});
		
		//Adicionar ao JFrame
		formulario.add(combo);
		
		//Exibir componente
		formulario.repaint();
		formulario.setVisible(true);
		
	}

}
