
package co.edu.unbosque.view;

import javax.swing.JOptionPane;


public class JPane {

	/**
	 * Metodo encargado de tomar lo que usuario escriba en el joptionpane
	 *  @return dato
	 */
	public double leerDato(String mensaje) {
		double dato = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return dato;
	}
	/**
	 * Metodo de mostrar informacion
	 */

	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Ventana de Informacion", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Metodo de mostrar informacion
	 */

	public void mostrarAdvertencia(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Ventana de Advertencia", JOptionPane.WARNING_MESSAGE);
	}
	/**
	 * Metodo de mostrar error
	 */

	public void mostrarError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Ventana de Error", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Metodo de mostrar informacion adicional 
	 */
	public void mostrarOk(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Oyeeeee", JOptionPane.PLAIN_MESSAGE);
	}
	/**
	 * Metodo de mostrar informacion de si el usuario si o no
	  *  @return int
	 */

	public int mostrarYoN(String mensaje) {
		return JOptionPane.showConfirmDialog(null, mensaje, "Wait...", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
	}

	/**
	 * Metodo de mostrar dialogo
	 	  *  @return string
	 */

	public String mostrarDialogo(String mensaje) {
		String aux = JOptionPane.showInputDialog(null, mensaje, "");
		return aux;
	}
}
