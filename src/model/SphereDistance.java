package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utilities.Cursor;
import utilities.MySimpleList;

public class SphereDistance {

	private Cursor cursor;
	private MySimpleList<Double> distanceList;
	private	double averageDistance;
	private double mostDistance;
	
	/**
	 * Complejidad O(1)
	 */
	public SphereDistance() {
		distanceList = new MySimpleList<Double>(new Comparator<Double>() {
			@Override
			public int compare(Double o1, Double o2) {
				return o2.compareTo(o1);
			}			
		});
		cursor = new Cursor<Double>(distanceList);
	}

	/**
	 * Complejidad O(1)
	 * @return arbol binario
	 */
	public BinaryTree getDistanceList() {
		return distanceList;
	}

	/**
	 * Complejidad O(1)
	 * @param distanceList
	 */
	public void setDistanceList(BinaryTree distanceList) {
		this.distanceList = distanceList;
	}
	
	/**
	 * Calcula la distancia entre las esferas, tomando en cuenta la formula propuesta para coordenadas en 3d
	 * @param sphere1
	 * @param sphere2
	 * @return la sumatoria total de las distancias de las esferas
	 * Complejidad O(5)
	 */
	public double calculateDistance(Sphere sphere1,Sphere sphere2) {
		double x = (sphere1.getCoordinate().getxAxis()-sphere2.getCoordinate().getxAxis());
		double y = (sphere1.getCoordinate().getyAxis()-sphere2.getCoordinate().getyAxis());
		double z = (sphere1.getCoordinate().getzAxis()-sphere2.getCoordinate().getzAxis());
		double aux = Math.sqrt(((Math.pow(x, 2))+(Math.pow(y, 2))+(Math.pow(z, 2))));
		averageDistance += aux ;
		
		return aux;
	}
	
	/**
	 * La distancia total acomulada la divide en el numero de elementos y obtiene el promedio
	 * @return
	 * Complejidad O(1)
	 */
	public double getAverageDistance() {
		averageDistance = averageDistance/distanceList.getSize();
		return averageDistance;
	}

	/**
	 * @return the mostDistance
	 * Complejidad O(1)
	 */
	public double getMostDistance() {
		return mostDistance;
	}

	/**
	 * @param mostDistance the mostDistance to set
	 * Complejidad O(1)
	 */
	public void setMostDistance(double mostDistance) {
		this.mostDistance = mostDistance;
	}
	
	/**
	 * Obtiene las distancias que mas se repiten
	 * @return
	 * Complejidad O(log N)
	 */
	public List<Double> getModa() {
		cursor.reset();
        Map<Double, Integer> auxNumber = new HashMap();
        for (int i = 0; i < distanceList.size(); i++){
            if(!auxNumber.containsKey(cursor.getCurrentElement())) {
                auxNumber.put((Double) cursor.getCurrentElement().getInfo(), 1);
            }else {
                auxNumber.replace((Double) cursor.getCurrentElement().getInfo(), auxNumber.get(cursor.getCurrentElement()) + 1);
            }
        }
        int max = Collections.max(auxNumber.values());
        ArrayList<Double> mostDistancesReps = new ArrayList<Double>();
        auxNumber.forEach((num, cant) -> {
            if(cant == max) {
                mostDistancesReps.add(num);
            }
        });
        for (Double double1 : mostDistancesReps) {
			System.out.println("Distancia : "+double1);
		}
        return mostDistancesReps;
	}	
	
	
	


//	public static void main(String[] args) {
//		SphereDistance distance = new SphereDistance();
//		Sphere a = new Sphere(new Coordinate(5,15,78.5),78);
//		Sphere b = new Sphere(new Coordinate(10,30,63.4),78);
//		System.out.println("Distancia :"+distance.calculateDistance(a,b));
//	}
	
	
}
