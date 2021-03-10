
package model;

import java.util.ArrayList;

/**
 * @Author Edwar Malpica-Esteban Novoa Quiniones
 * @NameClass SphereList.java
 * @NameProyect Taller_Esferas
 * @Date mar 7, 2021
 */

public class SphereList {
	
	private ArrayList<Sphere> spheresList;
	private SphereDistance sphereDistance;
	
	/**
	 * @param sphereList
	 * Complejidad O(1)
	 */
	public SphereList(ArrayList<Sphere> sphereList, int time) {
		spheresList = sphereList;
		sphereDistance = new SphereDistance();
		for (Sphere sphere : sphereList) {
			
		}
		moveSpheres(time);
	}
	
	/**
     * Recorre la lista de esferas e incrementa sus coordenadas
     * Complejidad O(log N)
     */
    private void moveSpheres(int time){
    	new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<time ; i++) {
					
		    		 for (Sphere sphere : spheresList) {
		    				sphere.move();
		    				setDistances();
		    	      }
		    		 
		    		 System.out.println(""+i);
		    		 System.out.println("Mayor distancia "+ sphereDistance.getMostDistance());
		    		 System.out.println(spheresList.get(0).getCoordinate().getxAxis());
		    		 System.out.println(spheresList.get(0).toString());
		    		
		    	}
				
			}
		}).start();; 
			
    	
     
    }
 
   /**
    * Aniade las distancias calculadas entre todas las esferas del arreglo
    * Complejidad O(N log N)
    */
	public void setDistances() {
		for (int i = 0; i < spheresList.size() - 1; i++) {
			for (int j = i+1; j < spheresList.size(); j++) {
				double distanceSpheres = sphereDistance.calculateDistance(spheresList.get(i), spheresList.get(j));
				if (distanceSpheres>sphereDistance.getMostDistance()) {
					sphereDistance.setMostDistance(distanceSpheres);
				}
				if(coolision(spheresList.get(i), spheresList.get(j))){
					changeDirection(spheresList.get(i), spheresList.get(j));
				}	
				sphereDistance.getDistanceList().add((double) distanceSpheres);
				
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
