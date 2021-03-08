
package model;
/**
 * @Author Edwar Malpica-Esteban Novoa Qui�ones
 * @NameClass SphereList.java
 * @NameProyect Taller_Esferas
 * @Date mar 7, 2021
 */
import java.util.ArrayList;

public class SphereList {
	
	private Sphere[] spheresList;
	private SphereDistance sphereDistance;
	
	public SphereList( int size) {
		spheresList = new Sphere[size];
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
    * A�ade las distancias calculadas entre todas las esferas del arreglo
    */
	public void setDistances() {
		for (int i = 0; i < spheresList.length; i++) {
			for (int j = i+1; j < spheresList.length-1; j++) {
				double distanceSpheres = sphereDistance.calculateDistance(spheresList[i], spheresList[j]);
				if (distanceSpheres>sphereDistance.getMostDistance()) {
					sphereDistance.setMostDistance(distanceSpheres);
				}
				if(coolision(spheresList[i], spheresList[j])){
					changeDirection(spheresList[i], spheresList[j]);
				}	
				System.out.println("Distancia "+i+"  "+distanceSpheres);
				sphereDistance.getDistanceList().add(distanceSpheres);
			}
			
		}
	}

	/**
	 * @return the sphereDistance
	 */
	public SphereDistance getSphereDistance() {
		return sphereDistance;
	}

	/**
	 * @param sphereDistance the sphereDistance to set
	 */
	public void setSphereDistance(SphereDistance sphereDistance) {
		this.sphereDistance = sphereDistance;
	}
	
	/*
	 * Analiza si entre dos esfereas hay colision
	 */
	public boolean coolision(Sphere sphere1,Sphere sphere2) {
		boolean result  =false;
		
		if((sphere1.getRadio()+sphere2.getRadio()) <= (int)(sphereDistance.calculateDistance(sphere1,sphere2))) {
			result = true;
		}
		return result;
	}
	
	
	/**
	 * @return the spheresList
	 */
	public Sphere[] getSpheresList() {
		return spheresList;
	}

	/*
	 * Cambia la direccion de la velocidad de dos esferas en colision
	 */
	public void changeDirection(Sphere sphere1,Sphere sphere2) {
		sphere1.getSpeed().changeDirection();
		sphere2.getSpeed().changeDirection();
	}

}
