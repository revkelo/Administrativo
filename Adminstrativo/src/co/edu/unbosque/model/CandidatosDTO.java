package co.edu.unbosque.model;

public class CandidatosDTO {

	private String nombre;
	private String apellido;
	private String cargo;
	private int edad;
	private long cedula;

	public CandidatosDTO() {
		// TODO Auto-generated constructor stub
	}


	public CandidatosDTO(String nombre, String apellido, String cargo, int edad, long cedula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargo = cargo;
		this.edad = edad;
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		String res = "";
		res += this.nombre + ";" + this.apellido + ";" + this.cargo + ";" + this.edad + ";"
				+ this.cedula + "\n";
		return res;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the cedula
	 */
	public long getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

}
