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
    
    
    	
    private void setDistances() {
    	for (int i = 0; i < spheresList.length; i++) {
			for (int j = i+1; j < spheresList.length; j++) {
				
		}
    }
    }
    
    
}
