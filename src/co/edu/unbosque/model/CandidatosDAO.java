package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Iterator;

import co.edu.unbosque.model.persistance.FileHandler;
/*
* 
* Clase candidatosDAO
*/
public class CandidatosDAO {

	/**
	 * Lista basada en el dto
	 */
	private ArrayList<CandidatosDTO> lista;

	/**
	 * Constructor
	 */
	public CandidatosDAO() {
		lista = new ArrayList<CandidatosDTO>();
		loadFile();
	}

	/**
	 * Metodo encargado de ver el contenido de la base de datos
	 */
	public String contentBase() {
		String res = "";
		for (CandidatosDTO s : lista) {
			res += s.toString();
		}
		return res;
	}

	/**
	 * Metodo encargado de escribir en la base de datos
	 */
	public void writeFile() {
		String content = contentBase();
		FileHandler.writeFile("datos.csv", content);
	}

	/**
	 * Metodo encargado de subir la informacion a la base de datos
	 */
	public void loadFile() {
		String content = FileHandler.loadFile("datos.csv");
		String[] lines = content.split("\n");
		for (String s : lines) {
			if (s.equals(""))
				continue;
			String[] columnas = s.split(";");
			lista.add(new CandidatosDTO(columnas[0], columnas[1], columnas[2], Integer.parseInt(columnas[3]),Long.parseLong(columnas[4]) ));

		}

	}
	public int buscadorCedu(long cedula) {
		int aux = -1;
		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i).getCedula()==cedula) {

				try {
					System.out.println(""+i);
aux = i;
				

					return aux;

				} catch (Exception e) {

					return aux;

				}

			}
		}
		return aux;
	}

	/**
	 * Metodo encargado de guardar en la lista y en el archivo cvs
	 */
	public void guardar(String nombre, String apellido, String cargo, int edad, long cedula) {

		CandidatosDTO a = new CandidatosDTO(nombre, apellido, cargo, edad, cedula);
		lista.add(a);
		writeFile();

	}
	
	/**
	 * Metodo encargado de eliminar
	 */

	public boolean eliminar(long cedula) {

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCedula()==cedula) {
				try {
					lista.remove(i);
					writeFile();
					return true;

				} catch (Exception e) {
					return false;
				}

			}
		}
	
		return false;


	}
	/**
	 * Metodo encargado de actualizar el cargo
	 */

	public boolean actualizarNombre(long cedula, String cargo) {
		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i).getCedula()==cedula) {

				try {

					lista.get(i).setCargo(cargo);
writeFile();
					return true;

				} catch (Exception e) {

					return false;

				}

			}
		}
		return false;
	}

	/**
	 * Metodo encargado de mostrar en consola
	 */
	public String mostrar(int i) {
		String res = "" ;


	


			res +="Nombre " + lista.get(i).getNombre()+ "\n";
			res +="Apellido " + lista.get(i).getApellido()+ "\n";
			res +="Cargo " + lista.get(i).getCargo()+ "\n";
			res +="Edad " + lista.get(i).getEdad()+ "\n";
			res +="Cedula " + lista.get(i).getCedula()+ "\n";


		
		return res;
	}

	/**
	 * @return the lista
	 */
	public ArrayList<CandidatosDTO> getLista() {
		return lista;
	}

	/**
	 * @param lista the lista to set
	 */
	public void setLista(ArrayList<CandidatosDTO> lista) {
		this.lista = lista;
	}

}
