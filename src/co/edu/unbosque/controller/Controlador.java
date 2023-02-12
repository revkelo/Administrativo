/**
 * 
 */
package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.FachadaModelo;
import co.edu.unbosque.view.FachadaVista;
/**
 * 
 * @author Kevin Gonzalez
 * @author Jose Carreño
 */

public class Controlador implements ActionListener {
	/**
	 * Atributo con fachadamodelo de candidatos
	 */
	private FachadaModelo model;
	/**
	 * Atributo con fachadavista de candidatos
	 */
	private FachadaVista vp;

	/**
	 * Metodo constructor <b> pre </b> Implementar las funcionalidaades del programa
	 * <br>
	 * <b> post </b> El programa funciona <br>
	 */
	
	public Controlador() {
		model = new FachadaModelo();
		vp = new FachadaVista();
		asignarOyentes();
		agregarTabla();
	}
	
	/**
	 * Borra todos los datos en el jtable
	 */
	private void borrarTabla() {
		if (vp.getVprin().getPb().getT_lista().getRowCount() > 0) {
			for (int i = vp.getVprin().getPb().getT_lista().getRowCount() - 1; i > -1; i--) {
				vp.getVprin().getPb().getT_lista().removeRow(i);
			}
		}
	}
	/**
	 * Sincroniza todo los datos de la lista al jtable 
	 */
	public void agregarTabla() {

		for (int i = 0; i < model.getCandao().getLista().size(); i++) {
			String nombre = model.getCandao().getLista().get(i).getNombre();
			String apellido = model.getCandao().getLista().get(i).getApellido();

			String cargo = model.getCandao().getLista().get(i).getCargo();

			int edad = model.getCandao().getLista().get(i).getEdad();
			long cedula = model.getCandao().getLista().get(i).getCedula();



			Object[] tabla = { nombre, apellido,cargo, edad, cedula};

			vp.getVprin().getPb().getT_lista().addRow(tabla);

		}
	}

	/**
	 * Asigna los oyentes a los botones <b> pre </b> La existencia de los botones
	 * <br>
	 * <b> post </b> Los botones tienen acciones <br>
	 */
	
	private void asignarOyentes() {
		vp.getVprin().getB_salir().addActionListener(this);
		vp.getVprin().getB_crud().addActionListener(this);
		vp.getVprin().getB_guardar().addActionListener(this);
		vp.getVprin().getB_borrar().addActionListener(this);
		vp.getVprin().getB_actualizar().addActionListener(this);
		vp.getVprin().getB_listar().addActionListener(this);
		vp.getVprin().getB_atras().addActionListener(this);
		vp.getVprin().getB_atras2().addActionListener(this);
		vp.getVprin().getB_ordenar().addActionListener(this);
	}
	
	/**
	 * Ejecuta el programa
	 */

	public void ejecutar() {
		vp.getVprin().setVisible(true);


	}

	/**
	 * Define las acciones de los botones <b> pre </b> Los botones deben tener
	 * acciones detectadas <br>
	 * <b> post </b> Los botones tienen sus acciones especificadas <br>
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("Salir")) {
			System.exit(0);
		}
		if (comando.equals("listar")) {

			borrarTabla();
			agregarTabla();
			vp.getVprin().getPb().setVisible(true);
			vp.getVprin().getMenu().setVisible(false);
			vp.getVprin().getOtras_opciones().setVisible(false);

		}
		if (comando.equals("crud")) {

			vp.getVprin().getMenu().setVisible(false);
			vp.getVprin().getOtras_opciones().setVisible(true);

		}

		if (comando.equals("actualizar")) {
			try {


				long cedula =  Long.parseLong(vp.getJpane().mostrarDialogo("Digite la cedula para actualizar"));
				String cargo = vp.getJpane().mostrarDialogo("Digite el cargo a actualizar a esa persona");
				if (model.getCandao().actualizarNombre(cedula,cargo)== true) {
					vp.getJpane().mostrarInformacion("Se actualizo correctamente");
				}else {
					vp.getJpane().mostrarInformacion("No se pudo actualizar");	
				}
			} catch (Exception e2) {
				vp.getJpane().mostrarError("Digitaste algo mal");
			}

		}
		if (comando.equals("borrar")) {

			try {


				long cedula =  Long.parseLong(vp.getJpane().mostrarDialogo("Digite la cedula para eliminarlo"));
				if (model.getCandao().eliminar(cedula)== true) {
					vp.getJpane().mostrarInformacion("Se elimino correctamente");
				}else {
					vp.getJpane().mostrarInformacion("No se pudo eliminar");

				}

				borrarTabla();
			} catch (Exception e2) {
				vp.getJpane().mostrarError("Digitaste algo mal");
			}
		}
		if (comando.equals("guardar")) {
			try {

				String nombre = vp.getJpane().mostrarDialogo("Digite su nombre");
				String apellido = vp.getJpane().mostrarDialogo("Digite su apellido");
				String cargo = vp.getJpane().mostrarDialogo("Digite su cargo");
				int edad = Integer.parseInt(vp.getJpane().mostrarDialogo("Digite su edad"));
				long cedula = Long.parseLong(vp.getJpane().mostrarDialogo("Digite su cedula sin puntos"));
				for (int i = 0; i < model.getCandao().getLista().size(); i++) {
					if (model.getCandao().getLista().get(i).getCedula() == cedula) {
						vp.getJpane().mostrarError("Esta cedula ya esta en la base de datos");
						break;
					} else {
						model.getCandao().guardar(nombre, apellido, cargo, edad, cedula);
						vp.getJpane().mostrarInformacion("Se agrega correctamente");
						break;
					}
				}

			} catch (Exception e2) {
				vp.getJpane().mostrarError("Digitaste algo mal");
			}
		}

		if (comando.equals("atras_crud")) {
			vp.getVprin().getMenu().setVisible(true);
			vp.getVprin().getOtras_opciones().setVisible(false);
		}
		if (comando.equals("atras_listar")) {
			borrarTabla();
			vp.getVprin().getPb().setVisible(false);
			vp.getVprin().getMenu().setVisible(true);
		}

		if (comando.equals("ordenamiento")) {
			if (vp.getVprin().getPb().getOrdenar().getSelectedItem()=="Nombre"&&vp.getVprin().getPb().getAscendente().isSelected()) {
				borrarTabla();
				model.getOrde().ordenamientoNombreAscendente(model.getCandao().getLista());
				agregarTabla();
			}else if (vp.getVprin().getPb().getOrdenar().getSelectedItem()=="Nombre"&&vp.getVprin().getPb().getDescendente().isSelected()) {
				borrarTabla();
				model.getOrde().ordenamientoNombreDescendente(model.getCandao().getLista());
				agregarTabla();
			}if (vp.getVprin().getPb().getOrdenar().getSelectedItem()=="Apellido"&&vp.getVprin().getPb().getAscendente().isSelected()) {
				borrarTabla();
				model.getOrde().ordenamientoApellidoAscendente(model.getCandao().getLista());
				agregarTabla();
			}else if (vp.getVprin().getPb().getOrdenar().getSelectedItem()=="Apellido"&&vp.getVprin().getPb().getDescendente().isSelected()) {
				borrarTabla();
				model.getOrde().ordenamientoApellidoDescendente(model.getCandao().getLista());
				agregarTabla();
			}if (vp.getVprin().getPb().getOrdenar().getSelectedItem()=="Cargo"&&vp.getVprin().getPb().getAscendente().isSelected()) {
				borrarTabla();
				model.getOrde().ordenamientoCargoAscendente(model.getCandao().getLista());
				agregarTabla();
			}else if (vp.getVprin().getPb().getOrdenar().getSelectedItem()=="Cargo"&&vp.getVprin().getPb().getDescendente().isSelected()) {
				borrarTabla();
				model.getOrde().ordenamientoCargoDescendente(model.getCandao().getLista());
				agregarTabla();
			}if (vp.getVprin().getPb().getOrdenar().getSelectedItem()=="Edad"&&vp.getVprin().getPb().getAscendente().isSelected()) {
				borrarTabla();
				model.getOrde().burbujaEdadAscendente(model.getCandao().getLista());
				agregarTabla();
			}else if (vp.getVprin().getPb().getOrdenar().getSelectedItem()=="Edad"&&vp.getVprin().getPb().getDescendente().isSelected()) {
				borrarTabla();
				model.getOrde().burbujaEdadDescendente(model.getCandao().getLista());
				agregarTabla();
			}if (vp.getVprin().getPb().getOrdenar().getSelectedItem()=="Cedula"&&vp.getVprin().getPb().getAscendente().isSelected()) {
				borrarTabla();
				model.getOrde().burbujaCedulaAscendente(model.getCandao().getLista());
				agregarTabla();
			}else if (vp.getVprin().getPb().getOrdenar().getSelectedItem()=="Cedula"&&vp.getVprin().getPb().getDescendente().isSelected()) {
				borrarTabla();
				model.getOrde().burbujaEdadDescendente(model.getCandao().getLista());
				agregarTabla();
			}
		}
	}

	/**
	 * @return the model
	 */
	public FachadaModelo getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(FachadaModelo model) {
		this.model = model;
	}

	/**
	 * @return the vp
	 */
	public FachadaVista getVp() {
		return vp;
	}

	/**
	 * @param vp the vp to set
	 */
	public void setVp(FachadaVista vp) {
		this.vp = vp;
	}
	

}
