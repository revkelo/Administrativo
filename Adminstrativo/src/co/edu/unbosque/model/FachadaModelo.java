package co.edu.unbosque.model;
/*
* 
* Clase que conecta las clases en modelo que hace que no se llene mucho el controller
*/
public class FachadaModelo {
	/*
	* 
	* Atributos basados en la clases que estan en la vista
	*/
	private CandidatosDAO candao;
	private Ordenamiento orde;
	/*
	* 
	* Constructor
	*/

	public FachadaModelo() {
		setOrde(new Ordenamiento());
		candao = new CandidatosDAO();
	}

	/**
	 * @return the candao
	 */
	public CandidatosDAO getCandao() {
		return candao;
	}

	/**
	 * @param candao the candao to set
	 */
	public void setCandao(CandidatosDAO candao) {
		this.candao = candao;
	}

	/**
	 * @return the orde
	 */
	public Ordenamiento getOrde() {
		return orde;
	}

	/**
	 * @param orde the orde to set
	 */
	public void setOrde(Ordenamiento orde) {
		this.orde = orde;
	}




}
