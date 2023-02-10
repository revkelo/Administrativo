/**
 * Paquete que pertenece al modelo el cual se encarga de la representacion de objetos 
 */
package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Clase Ordenamiento del proyecto.
 *
 * @author Jose
 * @author Kevin
 */
public class Ordenamiento {

	/**
	 * Metodo estatico con el ordenamiento burbuja para organizar los cedula de forma descendente
	 * @param ArrayList<PersonaDTO> arreglo
	 */
	public static void burbujaCedulaDescendente(ArrayList<CandidatosDTO> arreglo) {
		for (int i = 0; i < arreglo.size(); i++) {
			CandidatosDTO temporal;
			for (int j = i + 1; j < arreglo.size(); j++) {
				if (arreglo.get(i).getCedula() < arreglo.get(j).getCedula()) {
					temporal = arreglo.get(j);
					arreglo.set(j, arreglo.get(i));
					arreglo.set(i, temporal);
				}
			}
		}
	}

	/**
	 * Metodo estatico con el ordenamiento burbuja para organizar los cedula de forma ascendente
	 * @param ArrayList<PersonaDTO> arreglo
	 */

	public static void burbujaCedulaAscendente(ArrayList<CandidatosDTO> arreglo) {
		for (int i = 0; i < arreglo.size(); i++) {
			CandidatosDTO temporal;
			for (int j = i + 1; j < arreglo.size(); j++) {
				if (arreglo.get(i).getCedula() > arreglo.get(j).getCedula()) {
					temporal = arreglo.get(j);
					arreglo.set(j, arreglo.get(i));
					arreglo.set(i, temporal);
				}
			}
		}
	}

	/**
	 * Metodo estatico con el ordenamiento burbuja para organizar la edad de forma descendente
	 * @param ArrayList<PersonaDTO> arreglo
	 */

	public static void burbujaEdadDescendente(ArrayList<CandidatosDTO> arreglo) {
		for (int i = 0; i < arreglo.size(); i++) {
			CandidatosDTO temporal;
			for (int j = i + 1; j < arreglo.size(); j++) {
				if (arreglo.get(i).getEdad() < arreglo.get(j).getEdad()) {
					temporal = arreglo.get(j);
					arreglo.set(j, arreglo.get(i));
					arreglo.set(i, temporal);
				}
			}
		}
	}

	/**
	 * Metodo estatico con el ordenamiento burbuja para organizar la edad de forma ascendente
	 * @param ArrayList<PersonaDTO> arreglo
	 */

	public static void burbujaEdadAscendente(ArrayList<CandidatosDTO> arreglo) {
		for (int i = 0; i < arreglo.size(); i++) {
			CandidatosDTO temporal;
			for (int j = i + 1; j < arreglo.size(); j++) {
				if (arreglo.get(i).getEdad() > arreglo.get(j).getEdad()) {
					temporal = arreglo.get(j);
					arreglo.set(j, arreglo.get(i));
					arreglo.set(i, temporal);
				}
			}
		}
	}

	/**
	 * Metodo con el ordenamiento QuickSort para organizar el nombre de forma ascendente
	 * @param ArrayList<PersonaDTO> arreglo
	 */
	public void ordenamientoNombreAscendente(ArrayList<CandidatosDTO> arreglo) {
		Collections.sort(arreglo, new Comparator<CandidatosDTO>() {
			public int compare(CandidatosDTO obj1, CandidatosDTO obj2) {
				return obj1.getNombre().compareTo(obj2.getNombre());
			}
		});

	}

	/**
	 * Metodo con el ordenamiento QuickSort para organizar el nombre de forma descendente
	 * @param ArrayList<PersonaDTO> arreglo
	 */
	public void ordenamientoNombreDescendente(ArrayList<CandidatosDTO> arreglo) {
		Collections.sort(arreglo, new Comparator<CandidatosDTO>() {
			public int compare(CandidatosDTO obj1, CandidatosDTO obj2) {
				return obj2.getNombre().compareTo(obj1.getNombre());
			}
		});

	}

	/**
	 * Metodo con el ordenamiento QuickSort para organizar el Apellido de forma ascendente
	 * @param ArrayList<PersonaDTO> arreglo
	 */
	public void ordenamientoApellidoAscendente(ArrayList<CandidatosDTO> arreglo) {
		Collections.sort(arreglo, new Comparator<CandidatosDTO>() {
			public int compare(CandidatosDTO obj1, CandidatosDTO obj2) {
				return obj1.getApellido().compareTo(obj2.getApellido());
			}
		});

	}

	/**
	 * Metodo con el ordenamiento QuickSort para organizar el apellido de forma descendente
	 * @param ArrayList<PersonaDTO> arreglo
	 */
	public void ordenamientoApellidoDescendente(ArrayList<CandidatosDTO> arreglo) {
		Collections.sort(arreglo, new Comparator<CandidatosDTO>() {
			public int compare(CandidatosDTO obj1, CandidatosDTO obj2) {
				return obj2.getApellido().compareTo(obj1.getApellido());
			}
		});

	}

	/**
	 * Metodo con el ordenamiento QuickSort para organizar el cargo de forma ascendente
	 * @param ArrayList<PersonaDTO> arreglo
	 */
	public void ordenamientoCargoAscendente(ArrayList<CandidatosDTO> arreglo) {
		Collections.sort(arreglo, new Comparator<CandidatosDTO>() {
			public int compare(CandidatosDTO obj1, CandidatosDTO obj2) {
				return obj1.getCargo().compareTo(obj2.getCargo());
			}
		});

	}

	/**
	 * Metodo con el ordenamiento QuickSort para organizar el cargo de forma descendente
	 * @param ArrayList<PersonaDTO> arreglo
	 */
	public void ordenamientoCargoDescendente(ArrayList<CandidatosDTO> arreglo) {
		Collections.sort(arreglo, new Comparator<CandidatosDTO>() {
			public int compare(CandidatosDTO obj1, CandidatosDTO obj2) {
				return obj2.getCargo().compareTo(obj1.getCargo());
			}
		});

	}

}
