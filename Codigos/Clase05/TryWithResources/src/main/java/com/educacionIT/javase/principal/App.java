package com.educacionIT.javase.principal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author EducacionIT
 * @class App
 * @date 10 ene. 2021
 *
 */
public class App {
	public static void main(String[] args) {

		try (FileReader archivo = new FileReader("C:/archivo.txt")) {
			// algoritmo para leer el archivo
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * FileReader archivo = null; try { archivo = new FileReader("C:/archivo.txt");
		 * // algoritmo para leer el archivo } catch (FileNotFoundException e) {
		 * e.printStackTrace(); } finally { try { archivo.close(); } catch (IOException
		 * e) { e.printStackTrace(); } }
		 */
	}
}
