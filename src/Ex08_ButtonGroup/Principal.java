package Ex08_ButtonGroup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {
		// JFrame 
		JFrame formulario = new JFrame("Usando ButtonGroup");
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null); 
		
		//JRadioButton
		JRadioButton turnoMatutino = new JRadioButton("Matutino");
		turnoMatutino.setBounds(10, 10, 100, 20);
		turnoMatutino.setActionCommand("Matutino");
		
		JRadioButton turnoVespertino = new JRadioButton("Vespertino");
		turnoVespertino.setBounds(110, 10, 100, 20);
		turnoVespertino.setActionCommand("Matutino");
		
		JRadioButton turnoNoturno = new JRadioButton("Noturno");
		turnoNoturno.setBounds(210, 10, 110, 20);
		turnoNoturno.setActionCommand("Noturno");
		
		//ButtonGroup
		ButtonGroup turnos = new ButtonGroup();
		turnos.add(turnoMatutino);
		turnos.add( turnoVespertino);
		turnos.add(turnoNoturno);
		
		//JButton
		JButton botao = new JButton("Verificar turno");
		botao.setBounds(50, 50, 200, 20);
		
		//Acao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{
					JOptionPane.showMessageDialog(null, turnos.getSelection().getActionCommand());
				}catch(Exception erro){
					JOptionPane.showMessageDialog(null, "Selecione um turno");
				}
				
			}
		});

		//Adicionar componentes ao JFrame
		formulario.add(turnoMatutino);
		formulario.add(turnoVespertino);
		formulario.add(turnoNoturno);
		
		//Exibir a estrutura				
		formulario.setVisible(true);


		

	}

}
