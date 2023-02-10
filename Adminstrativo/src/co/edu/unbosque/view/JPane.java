
package co.edu.unbosque.view;

import javax.swing.JOptionPane;


public class JPane {


	public double leerDato(String mensaje) {
		double dato = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return dato;
	}


	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Ventana de Informacion", JOptionPane.INFORMATION_MESSAGE);
	}



	public void mostrarAdvertencia(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Ventana de Advertencia", JOptionPane.WARNING_MESSAGE);
	}


	public void mostrarError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Ventana de Error", JOptionPane.ERROR_MESSAGE);
	}


	public void mostrarOk(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Oyeeeee", JOptionPane.PLAIN_MESSAGE);
	}


	public int mostrarYoN(String mensaje) {
		return JOptionPane.showConfirmDialog(null, mensaje, "Wait...", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
	}



	public String mostrarDialogo(String mensaje) {
		String aux = JOptionPane.showInputDialog(null, mensaje, "");
		return aux;
	}
}
