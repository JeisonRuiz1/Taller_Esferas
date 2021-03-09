
package model;
/**
 * @Author Edwar Malpica-Esteban Novoa Quiniones
 * @NameClass SphereList.java
 * @NameProyect Taller_Esferas
 * @Date mar 7, 2021
 */

public class SphereList {
	
	private Sphere[] spheresList;
	private SphereDistance sphereDistance;
	
	/**
	 * @param sphereList
	 * Complejidad O(1)
	 */
	public SphereList(Sphere[] sphereList) {
		spheresList = sphereList;
		sphereDistance = new SphereDistance();
		runSpheres();
	}
	
	/**
     * Recorre la lista de esferas e incrementa sus coordenadas
     * Complejidad O(log N)
     */

	 /**
    private void moveSpheres(){
      for (Sphere sphere : spheresList) {
			sphere.move();
      }
    }
	 */
 
	public void runSpheres(){
		for (int i = 0; i < spheresList.length; i++) {
			spheresList[i].start();
		}
    }
   /**
    * Aniade las distancias calculadas entre todas las esferas del arreglo
    * Complejidad O(N log N)
    */
	public void setDistances() {
		for (int i = 0; i < spheresList.length - 1; i++) {
			for (int j = i+1; j < spheresList.length; j++) {
				double distanceSpheres = sphereDistance.calculateDistance(spheresList[i], spheresList[j]);
				if (distanceSpheres>sphereDistance.getMostDistance()) {
					sphereDistance.setMostDistance(distanceSpheres);
				}
				
				if(coolision(spheresList[i], spheresList[j])){
					changeDirection(spheresList[i], spheresList[j]);
				}	
				sphereDistance.getDistanceList().add(distanceSpheres);
			}
			
		}
	}

	/**
	 * @return the sphereDistance
	 * Complejidad O(1)
	 */
	public SphereDistance getSphereDistance() {
		return sphereDistance;
	}

	/**
	 * @param sphereDistance the sphereDistance to set
	 * Complejidad O(1)
	 */
	public void setSphereDistance(SphereDistance sphereDistance) {
		this.sphereDistance = sphereDistance;
	}
	
	/*
	 * Analiza si entre dos esfereas hay colision
	 * Complejidad O(3)
	 */
	public boolean coolision(Sphere sphere1,Sphere sphere2) {
		boolean result  =false;
		
		if((sphere1.getRadio()+sphere2.getRadio()) <= (int)(sphereDistance.calculateDistance(sphere1,sphere2))) {
			result = true;
		}
		return result;
	}
	
	/*
	 * Cambia la direccion de la velocidad de dos esferas en colision
	 * Complejidad O(20)
	 */
	public void changeDirection(Sphere sphere1,Sphere sphere2) {
		sphere1.getSpeed().changeDirection();
		sphere2.getSpeed().changeDirection();
	}

}
