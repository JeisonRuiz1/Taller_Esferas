package model;



public class Sphere {

    private Coordinate coordinate;
    private Speed speed;
    private double radio;
    
    /**
	 * @param coordinate posicion  de la esfera
	 * @param speed velocidad de la esfera
	 * @param radio radio de la esfera
	 * Complejidad O(4)
	 */
	public Sphere(Coordinate coordinate, Speed speed, double radio) {
		super();
		this.coordinate = coordinate;
		this.speed = speed;
		this.radio = radio;
	}
	/*
	 * Mueve la esfera a una interaccion de la velocidad
	 * Complejidad O(n^3)
	 */
	public void move() {
		coordinate.setxAxis(coordinate.getxAxis()+speed.getX());
		coordinate.setyAxis(coordinate.getyAxis()+speed.getY());
		coordinate.setzAxis(coordinate.getzAxis()+speed.getZ());
	}

	/**
	 * @return the coordinate
	 * Complejidad O(1)
	 */
	public Coordinate getCoordinate() {
		return coordinate;
	}
	
	/**
	 * @param coordinate the coordinate to set
	 * Complejidad O(1)
	 */
	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	/**
	 * @return the speed
	 * Complejidad O(1)
	 */
	public Speed getSpeed() {
		return speed;
	}
	
	/**
	 * @param speed the speed to set
	 * Complejidad O(1)
	 */
	public void setSpeed(Speed speed) {
		this.speed = speed;
	}
	
	/**
	 * @return the radio
	 * Complejidad O(1)
	 */
	public double getRadio() {
		return radio;
	}
	
	/**
	 * @param radio the radio to set
	 * Complejidad O(1)
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public String toString() {
		return "Sphere [coordinate=" + coordinate.toString() + ", speed=" + speed.toString() + ", radio=" + radio + "]";
	}
	
	
}
