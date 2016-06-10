package playlist;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Ventana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJavaEsEl = new JLabel("JAVA ES EL CAMINO, LA VERDAD Y LA LUZ");
		lblJavaEsEl.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblJavaEsEl.setBounds(44, 42, 349, 160);
		contentPane.add(lblJavaEsEl);
	}
}
