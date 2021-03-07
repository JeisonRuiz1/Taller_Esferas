/**
 * @Author Edwar Malpica
 * @NameClass SphereList.java
 * @NameProyect Taller_Esferas
 * @Date mar 7, 2021
 */
package model;

/**
 * @author eduar
 *
 */
public class SphereList {

	
	
	
	
	
	/*
	 * Analiza si entre dos esfereas hay colision
	 */
	public boolean coolision(Sphere sphere1,Sphere sphere2) {
		boolean result  =false;
		
		if((sphere1.getRadio()+sphere2.getRadio()) <= 0/*Distancia entre esferas*/) {
			result = true;
		}
		return result;
	}
	
	/*
	 * Cambia la direccion de la velocidad de dos esferas en colision
	 */
	public void changeDirection(Sphere sphere1,Sphere sphere2) {
		sphere1.getSpeed().changeDirection();
		sphere2.getSpeed().changeDirection();
	}
}
