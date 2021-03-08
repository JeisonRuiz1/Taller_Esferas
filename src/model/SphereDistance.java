package model;

import utilities.BinaryTree;

public class SphereDistance {

	private BinaryTree distanceList;
	private	double averageDistance;
	private double mostDistance;
	
	public SphereDistance() {
		distanceList = new BinaryTree();
	}

	public BinaryTree getDistanceList() {
		return distanceList;
	}

	public void setDistanceList(BinaryTree distanceList) {
		this.distanceList = distanceList;
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
		double aux = Math.sqrt(((Math.pow(x, 2))+(Math.pow(y, 2))+(Math.pow(z, 2))));
		averageDistance += aux ;
		return aux;
	}
	
	/**
	 * La distancia total acomulada la divide en el numero de elementos y obtiene el promedio
	 * @return
	 */
	public double getAverageDistance() {
		averageDistance = averageDistance/distanceList.getSize();
		return averageDistance;
	}

	/**
	 * @return the mostDistance
	 */
	public double getMostDistance() {
		return mostDistance;
	}

	/**
	 * @param mostDistance the mostDistance to set
	 */
	public void setMostDistance(double mostDistance) {
		this.mostDistance = mostDistance;
	}
	
	


//	public static void main(String[] args) {
//		SphereDistance distance = new SphereDistance();
//		Sphere a = new Sphere(new Coordinate(5,15,78.5),78);
//		Sphere b = new Sphere(new Coordinate(10,30,63.4),78);
//		System.out.println("Distancia :"+distance.calculateDistance(a,b));
//	}
	
}
