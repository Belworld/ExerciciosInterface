package Ex02_Jlabel;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciar JFrame
				JFrame formulario = new JFrame();
				formulario.setVisible(true);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setSize(500, 300);
				formulario.setLocationRelativeTo(null);
				formulario.setTitle("Utilizando JFrame");
				formulario.setLayout(null);
				
				//Instanciar Jlabel
				JLabel rotulo = new JLabel();
				rotulo.setText("Ola mundo");
				rotulo.setBounds(50, 50, 300, 20);
				
				//Adicionar componante ao Jlabel
				formulario.add(rotulo);
				

	}

}
