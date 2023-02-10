/**
 * Paquete que pertenece al modelo que se encarga de que el objeto persista 
 */
package co.edu.unbosque.model.persistance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;

/**
 * Clase FileHandler del proyecto.
 *
 * @author Jose
 * @author Kevin
 */

public class FileHandler {

	/**
	 * Atributo tipo File file.
	 */
	private static File file;
	/**
	 * Atributo tipo Scanner reader.
	 */
	private static Scanner reader;
	/**
	 * Atributo tipo PrintWriter writer.
	 */
	private static PrintWriter writer;

	/**
	 * Metodo tipo String encargado de cargar el archivo
	 * 
	 * @param String filename
	 * @return content
	 */
	public static String loadFile(String filename) {
		file = new File("src/co/edu/unbosque/model/persistance/" + filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {

			}
		}
		String content = "";
		try {
			reader = new Scanner(file);
			while (reader.hasNext()) {
				content += reader.nextLine() + "\n";
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		reader.close();
		return content;

	}

	/**
	 * Metodo encargado de escribir el archivo
	 * 
	 * @param filename, content
	 * @param content
	 */
	public static void writeFile(String filename, String content) {
		file = new File("src/co/edu/unbosque/model/persistance/" + filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {

			}
		}
		try {
			writer = new PrintWriter(file);
			writer.print(content);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		writer.close();
	}

}
