/**
 * @Author Edwar Malpica
 * @NameClass TestCaseProbe.java
 * @NameProyect Taller_Esferas
 * @Date mar 8, 2021
 */
package test;

import java.util.ArrayList;
import java.util.Random;

import model.Coordinate;
import model.Speed;
import model.Sphere;
import model.SphereList;

/**
 * @author eduar
 *
 */
public class TestCaseProbe {

	/**
	 * Complejidad O(log N)
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Sphere> sphereList = new ArrayList<>();
		Random random = new Random();
		for(int i = 0;i<100;i++) {
			sphereList.add(new Sphere(new Coordinate(random.nextDouble()*1000, random.nextDouble()*1000, random.nextDouble()*1000)
					, new Speed(random.nextDouble()*10,random.nextDouble()*10,random.nextDouble()*10), random.nextDouble()*50));
		}
		
		 SphereList list = new SphereList(sphereList);
		 list.setDistances();
		 System.out.println("Mayor distancia:" + list.getSphereDistance().getMostDistance());
	}
	
}
