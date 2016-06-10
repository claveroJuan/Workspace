package graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class NotasGUI {

	private JFrame frame;
	private JTextField nota1;
	private JTextField nota2;
	private JTextField nota3;
	private JTextField promedio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotasGUI window = new NotasGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NotasGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblIngreseNota = new JLabel("ingrese nota 1");
		lblIngreseNota.setBounds(63, 27, 105, 31);
		frame.getContentPane().add(lblIngreseNota);

		JLabel lblIngreseNota_1 = new JLabel("ingrese nota 2");
		lblIngreseNota_1.setBounds(63, 90, 105, 31);
		frame.getContentPane().add(lblIngreseNota_1);

		JLabel lblIngreseNota_2 = new JLabel("ingrese nota 3");
		lblIngreseNota_2.setBounds(63, 153, 105, 31);
		frame.getContentPane().add(lblIngreseNota_2);

		JButton btnCalcularPromedio = new JButton("calcular promedio");
		btnCalcularPromedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// codigo que hace el botton
				int promedio = (Integer.parseInt(nota1.getText()) + Integer.parseInt(nota2.getText()) + Integer.parseInt(nota3.getText()))/ 3;
				System.out.println(promedio);
				NotasGUI.this.promedio.setText(""+promedio);
			

			}

		});

		btnCalcularPromedio.setBounds(152, 195, 129, 38);
		frame.getContentPane().add(btnCalcularPromedio);

		nota1 = new JTextField();
		nota1.setBounds(178, 32, 86, 20);
		frame.getContentPane().add(nota1);
		nota1.setColumns(10);

		nota2 = new JTextField();
		nota2.setBounds(178, 95, 86, 20);
		frame.getContentPane().add(nota2);
		nota2.setColumns(10);

		nota3 = new JTextField();
		nota3.setBounds(178, 158, 86, 20);
		frame.getContentPane().add(nota3);
		nota3.setColumns(10);
		
		promedio = new JTextField();
		promedio.setBounds(316, 90, 86, 38);
		frame.getContentPane().add(promedio);
		promedio.setColumns(10);
	}
}
