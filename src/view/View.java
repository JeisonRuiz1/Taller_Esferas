/**
 * @Author Edwar Malpica
 * @NameClass View.java
 * @NameProyect Taller_Esferas
 * @Date mar 8, 2021
 */
package view;

import java.util.Scanner;

/**
 * @author eduar
 *
 */
public class View {
	
	private Scanner scanner;
	
	public View() {
		scanner = new Scanner(System.in);
	}
	
	/*
	 * Imprime un mensaje 
	 */
	public void showMessage(String message) {
		System.out.println(message);
	};
	
	
	public int getOption() {
		int result = 0;
		try {
			Integer.parseInt(scanner.nextLine());	
		} catch (NumberFormatException e) {
			showMessage("Ingrese una opcion valida:");
			getOption();
		}
		return result;
	}
	
	public void spaceMoment() {
		System.out.println("Enter para continuar");
		scanner.nextLine();
	}
}
