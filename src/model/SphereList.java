package model;

import utilities.BinaryTree;
/**
*
* @author Esteban Novoa Quiñones
*/

public class SphereList {
	
	private Sphere[] spheresList;
	private BinaryTree distanceList;
	

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
		for (int i = 0; i < spheresList.length; i++) {
			for (int j = i+1; j < spheresList.length-1; j++) {
				distanceList.add(calculateDistance(spheresList[i], spheresList[j]));
			}
			
		}
	}
	/**
	 * Calcula la distancia entre las esferas, tomando en cuenta la formula propuesta para coordenadas en 3d
	 * @param sphere1
	 * @param sphere2
	 * @return
	 */
    
	public double calculateDistance(Sphere sphere1,Sphere sphere2) {
		double x = (sphere1.getCoordinate().getxAxis()-sphere2.getCoordinate().getxAxis());
		double y = (sphere1.getCoordinate().getyAxis()-sphere2.getCoordinate().getyAxis());
		double z = (sphere1.getCoordinate().getzAxis()-sphere2.getCoordinate().getzAxis());
		return Math.sqrt(((Math.pow(2, x))+(Math.pow(2, y))+(Math.pow(2, z))));
	}
    
}
