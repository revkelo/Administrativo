package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {

	private Scanner lector;
	
	public Consola() {
		lector= new Scanner(System.in);
	}

	public Scanner getLector() {
		return lector;
	}

	public void setLector(Scanner lector) {
		this.lector = lector;
	}
	
	public int leerEntero() {
		int aux=lector.nextInt();
		return aux;
	}
	
	public long leerEnteroLargo() {
		long aux = lector.nextLong();
		return aux;
	}
	
	public float leerFlotante() {
		float aux = lector.nextFloat();
		return aux;
	}
	
	public double leerDoble() {
		double aux=lector.nextDouble();
		return aux;
	}
	
	public String leerTexto() {
		String aux=lector.nextLine();
		return aux;
	}
	
	public void imprimirEntero(int a_imprimir) {
		System.out.println(a_imprimir);
	}
	public void imprimirLong(long a_imprimir) {
		System.out.println(a_imprimir);
	}
	public void imprimirFloat(float a_imprimir) {
		System.out.println(a_imprimir);
	}
	public void imprimirDouble( double a_imprimir) {
		System.out.println(a_imprimir);
	}
	public void imprimirString(String a_imprimir) {
		System.out.println(a_imprimir);
	}
	
}
