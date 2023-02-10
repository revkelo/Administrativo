package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel destinado a que el usuario escoja que funcion va a usar
 * 
 * @author Kevin
 * @author Jose
 */
public class Ventanaprincipal extends JFrame {

	PanelBase pb;
	JButton b_atras, b_atras2, b_guardar,b_borrar,b_actualizar;
	JButton b_listar;
	JButton b_ordenar;
	JButton b_crud;
	JButton b_salir;
	JPanel  menu, otras_opciones;
	JLabel  e1, e2;

	/**
	 * Metodo en el que asignamos las caracteristicas a cada atributo
	 */
	public Ventanaprincipal() {

		this.setTitle("Listado de Candidatos");
		setSize(1200, 700);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);


		b_salir = new JButton("Salir");
		b_salir.setForeground(Color.white);
		b_salir.setBackground(Color.decode("#C81F32"));
		b_salir.setFont(new Font("Arial", Font.BOLD, 30));
		b_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_salir.setBounds(440, 490, 300, 100);
		b_salir.setFocusable(false);
		b_salir.setActionCommand("Salir");
		b_salir.setVisible(true);


		b_crud = new JButton("Administrar");
		b_crud.setForeground(Color.white);
		b_crud.setBackground(Color.decode("#C81F32"));
		b_crud.setFont(new Font("Arial", Font.BOLD, 30));
		b_crud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_crud.setBounds(440, 215, 300, 100);
		b_crud.setFocusable(false);
		b_crud.setActionCommand("crud");
		b_crud.setVisible(true);

		b_listar = new JButton("Listar");
		b_listar.setForeground(Color.white);
		b_listar.setBackground(Color.decode("#C81F32"));
		b_listar.setFont(new Font("Arial", Font.BOLD, 27));
		b_listar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_listar.setBounds(440, 350, 300, 100);
		b_listar.setFocusable(false);
		b_listar.setActionCommand("listar");
		b_listar.setVisible(true);

		b_atras = new JButton("Atras");
		b_atras.setForeground(Color.white);
		b_atras.setBackground(Color.decode("#C81F32"));
		b_atras.setFocusable(false);
		b_atras.setFont(new Font("Arial", Font.BOLD, 20));
		b_atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_atras.setBounds(50, 570, 200, 70);
		b_atras.setActionCommand("atras_crud");
		b_atras.setVisible(true);

		b_atras2 = new JButton("Atras");
		b_atras2.setForeground(Color.white);
		b_atras2.setBackground(Color.decode("#C81F32"));
		b_atras2.setFocusable(false);
		b_atras2.setFont(new Font("Arial", Font.BOLD, 20));
		b_atras2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_atras2.setBounds(1000, 17, 150, 50);
		b_atras2.setActionCommand("atras_listar");
		b_atras2.setVisible(true);

		b_guardar = new JButton("Guardar");
		b_guardar.setForeground(Color.white);
		b_guardar.setBackground(Color.decode("#C81F32"));
		b_guardar.setFocusable(false);
		b_guardar.setFont(new Font("Arial", Font.BOLD, 10));
		b_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_guardar.setBounds(170, 300, 200, 70);
		b_guardar.setActionCommand("guardar");
		b_guardar.setVisible(true);

		b_borrar = new JButton("Borrar");
		b_borrar.setForeground(Color.white);
		b_borrar.setBackground(Color.decode("#C81F32"));
		b_borrar.setFocusable(false);
		b_borrar.setFont(new Font("Arial", Font.BOLD, 10));
		b_borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_borrar.setBounds(490, 300, 200, 70);
		b_borrar.setActionCommand("borrar");
		b_borrar.setVisible(true);

		b_actualizar = new JButton("Actualizar");
		b_actualizar.setForeground(Color.white);
		b_actualizar.setBackground(Color.decode("#C81F32"));
		b_actualizar.setFocusable(false);
		b_actualizar.setFont(new Font("Arial", Font.BOLD, 10));
		b_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_actualizar.setBounds(800, 300, 200, 70);
		b_actualizar.setActionCommand("actualizar");
		b_actualizar.setVisible(true);

		b_ordenar = new JButton("ordenar");
		b_ordenar.setForeground(Color.white);
		b_ordenar.setBackground(Color.decode("#C81F32"));
		b_ordenar.setFocusable(false);
		b_ordenar.setFont(new Font("Arial", Font.BOLD, 20));
		b_ordenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		b_ordenar.setBounds(870, 555, 200, 70);
		b_ordenar.setActionCommand("ordenamiento");
		b_ordenar.setVisible(true);

		e1 = new JLabel("Candidatos a Empleados");
		e1.setBounds(270, 20, 700, 100);
		e1.setFont(new Font("Algerian", Font.ITALIC, 50));
		e1.setForeground(Color.white);

		menu = new JPanel();
		menu.setBackground(Color.black);
		menu.setBounds(0, 0, 1200, 700);
		menu.setLayout(null);
		menu.add(b_listar);
		menu.add(b_crud);
		menu.add(b_salir);
		menu.setVisible(true);
		menu.add(e1);

		e2 = new JLabel("Guarde, borre o actualice la lista");
		e2.setBounds(120, 20, 1000, 100);
		e2.setFont(new Font("Algerian", Font.ITALIC, 50));
		e2.setForeground(Color.white);

		otras_opciones = new JPanel();
		otras_opciones.setBackground(Color.black);
		otras_opciones.setBounds(0, 0, 1200, 700);
		otras_opciones.setLayout(null);
		otras_opciones.setVisible(false);
		otras_opciones.add(b_atras);
		otras_opciones.add(b_guardar);
		otras_opciones.add(b_borrar);
		otras_opciones.add(b_actualizar);
		otras_opciones.add(e2);

		pb = new PanelBase();
		pb.add(b_atras2);
		pb.add(b_ordenar);
		pb.setLocation(0, 5);
		add(pb);


		add(otras_opciones);
		add(menu);
	}
	public JButton getB_ordenar() {
		return b_ordenar;
	}
	public void setB_ordenar(JButton b_ordenar) {
		this.b_ordenar = b_ordenar;
	}
	/**
	 * @return the pb
	 */
	public PanelBase getPb() {
		return pb;
	}
	/**
	 * @param pb the pb to set
	 */
	public void setPb(PanelBase pb) {
		this.pb = pb;
	}
	/**
	 * @return the b_atras2
	 */
	public JButton getB_atras2() {
		return b_atras2;
	}
	/**
	 * @param b_atras2 the b_atras2 to set
	 */
	public void setB_atras2(JButton b_atras2) {
		this.b_atras2 = b_atras2;
	}
	/**
	 * @return the b_atras
	 */
	public JButton getB_atras() {
		return b_atras;
	}
	/**
	 * @param b_atras the b_atras to set
	 */
	public void setB_atras(JButton b_atras) {
		this.b_atras = b_atras;
	}
	/**
	 * @return the b_guardar
	 */
	public JButton getB_guardar() {
		return b_guardar;
	}
	/**
	 * @param b_guardar the b_guardar to set
	 */
	public void setB_guardar(JButton b_guardar) {
		this.b_guardar = b_guardar;
	}
	/**
	 * @return the b_borrar
	 */
	public JButton getB_borrar() {
		return b_borrar;
	}
	/**
	 * @param b_borrar the b_borrar to set
	 */
	public void setB_borrar(JButton b_borrar) {
		this.b_borrar = b_borrar;
	}
	/**
	 * @return the b_actualizar
	 */
	public JButton getB_actualizar() {
		return b_actualizar;
	}
	/**
	 * @param b_actualizar the b_actualizar to set
	 */
	public void setB_actualizar(JButton b_actualizar) {
		this.b_actualizar = b_actualizar;
	}
	/**
	 * @return the b_listar
	 */
	public JButton getB_listar() {
		return b_listar;
	}
	/**
	 * @param b_listar the b_listar to set
	 */
	public void setB_listar(JButton b_listar) {
		this.b_listar = b_listar;
	}
	/**
	 * @return the b_crud
	 */
	public JButton getB_crud() {
		return b_crud;
	}
	/**
	 * @param b_crud the b_crud to set
	 */
	public void setB_crud(JButton b_crud) {
		this.b_crud = b_crud;
	}
	/**
	 * @return the b_salir
	 */
	public JButton getB_salir() {
		return b_salir;
	}
	/**
	 * @param b_salir the b_salir to set
	 */
	public void setB_salir(JButton b_salir) {
		this.b_salir = b_salir;
	}

	/**
	 * @return the menu
	 */
	public JPanel getMenu() {
		return menu;
	}
	/**
	 * @param menu the menu to set
	 */
	public void setMenu(JPanel menu) {
		this.menu = menu;
	}
	/**
	 * @return the otras_opciones
	 */
	public JPanel getOtras_opciones() {
		return otras_opciones;
	}
	/**
	 * @param otras_opciones the otras_opciones to set
	 */
	public void setOtras_opciones(JPanel otras_opciones) {
		this.otras_opciones = otras_opciones;
	}

}
