package co.edu.unbosque.view;

public class FachadaVista {


	private JPane jpane;
	private Ventanaprincipal vprin;
	

	public FachadaVista() {

		jpane = new JPane();
		vprin = new Ventanaprincipal();
	}


	public Ventanaprincipal getVprin() {
		return vprin;
	}

	public void setVprin(Ventanaprincipal vprin) {
		this.vprin = vprin;
	}

	public JPane getJpane() {
		return jpane;
	}

	public void setJpane(JPane jpane) {
		this.jpane = jpane;
	}

}
