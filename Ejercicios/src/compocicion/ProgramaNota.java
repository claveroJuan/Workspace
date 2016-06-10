package compocicion;

import javax.swing.JOptionPane;

public class ProgramaNota {

	public static void main(String[] args) {
	
		
//		Nota[] nota = 
//			{
//				new Nota ("control 1", 50, 60),
//				new Nota ("control 2", 70,25),
//				new Nota ("control 3",30,50)
//			};

		Nota[] notax= new Nota [3];
		for (int i=0;i < notax.length;i++)
		{
			String nota1 =JOptionPane.showInputDialog("ingrese numero");
			String porcentaje=JOptionPane.showInputDialog("ingrese % ");
			notax[i]= new Nota ("",Integer.parseInt(nota1),Integer.parseInt(porcentaje));
		}
		Alumno alumno= new Alumno("juan", notax);
		JOptionPane.showMessageDialog(null,"Promedio es :"+ alumno.calcularPrpomedio());
	}

}
