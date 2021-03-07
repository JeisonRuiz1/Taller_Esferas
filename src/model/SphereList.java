package model;

import java.util.ArrayList;

import utilities.BinaryTree;
/**
*
* @author Esteban Novoa Quiñones
*/

public class SphereList {
	
	private ArrayList<Sphere> spheresList;
	private SphereDistance sphereDistance;
	

	public SphereList() {
		spheresList = new ArrayList<Sphere>();
		sphereDistance = new SphereDistance();
	}
	/**
     * Recorre la lista de esferas e incrementa sus coordenadas
     */
    private void moveSpheres(){
        for (Sphere sphere : spheresList) {
			sphere.move();
		}
    }
    
    
   /**
    * Añade las distancias calculadas entre todas las esferas del arreglo
    */
	private void setDistances() {
		for (int i = 0; i < spheresList.size(); i++) {
			for (int j = i+1; j < spheresList.size()-1; j++) {
				double distanceSpheres = sphereDistance.calculateDistance(spheresList.get(i), spheresList.get(j));
				if (distanceSpheres>sphereDistance.getMostDistance()) {
					sphereDistance.setMostDistance(distanceSpheres);
				}
				sphereDistance.getDistanceList().add(distanceSpheres);
			}
			
		}
	}
	
    
}
