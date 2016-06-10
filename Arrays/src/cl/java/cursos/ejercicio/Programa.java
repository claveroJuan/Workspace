package cl.java.cursos.ejercicio;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		Auto autoToyota = new Auto();
		Motor motorToyota = new Motor();
		autoToyota.setMotor(motorToyota);//INSERTAR OBJETO DENTRO DE OTRO OBJETO
		boolean opcSalir = false;
		
		do {
			String opc = JOptionPane
					.showInputDialog("Opc 1 encender \n" + "Opc 2 avanzar \n" + "Opc 3 imprimir \n" + "Opc 4 salir ");
			switch (opc) {
			case "1": {
				autoToyota.encender();
				break;
			}
			case "2": {
				String kilometros = JOptionPane.showInputDialog("ingrese km");
				int km = Integer.parseInt(kilometros);
				autoToyota.avanzar(km);
				break;
			}

			case "3": {
				autoToyota.escribir();
				break;
			}
			case "4": {
				opcSalir = !opcSalir;
				break;
			}
			default:

			}
		} while (!opcSalir);

	}
}
