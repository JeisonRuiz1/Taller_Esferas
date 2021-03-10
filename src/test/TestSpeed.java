/**
 * @Author Edwar Malpica
 * @NameClass TestSpeed.java
 * @NameProyect Taller_Esferas
 * @Date mar 9, 2021
 */
package test;

import model.Speed;

/**
 * @author eduar
 *
 */
public class TestSpeed {
  
	public static void main(String[] args) {
		Speed speed = new Speed(5, 10, 5);
		System.out.println(speed.toString());
		speed.changeDirection();
		System.out.println(speed.toString());
		
		
	}
}
