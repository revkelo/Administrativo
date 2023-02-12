package co.edu.unbosque.view;
/*
* 
* Clase que conecta las clases en vista que hace que no se llene mucho el controller
*/
public class FachadaVista {

	/*
	* 
	* Atributos basados en la clases que estan en la vista
	*/
	private JPane jpane;
	private Ventanaprincipal vprin;
	/*
	* 
	* Constructor
	*/

	public FachadaVista() {

		jpane = new JPane();
		vprin = new Ventanaprincipal();
	}

	/**
	 * @return the jpane
	 */
	public JPane getJpane() {
		return jpane;
	}

	/**
	 * @param jpane the jpane to set
	 */
	public void setJpane(JPane jpane) {
		this.jpane = jpane;
	}

	/**
	 * @return the vprin
	 */
	public Ventanaprincipal getVprin() {
		return vprin;
	}

	/**
	 * @param vprin the vprin to set
	 */
	public void setVprin(Ventanaprincipal vprin) {
		this.vprin = vprin;
	}




}
