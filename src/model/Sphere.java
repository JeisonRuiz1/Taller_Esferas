package model;

import java.io.BufferedReader;

public class Sphere {

//    public static final double PI = Math.PI;
    private Coordinate coordinate;
    private Speed speed;
    private double radio;

    
    
    
    /**
	 * @param coordinate posicion  de la esfera
	 * @param speed velocidad de la esfera
	 * @param radio radio de la esfera
	 */
	public Sphere(Coordinate coordinate, Speed speed, double radio) {
		super();
		this.coordinate = coordinate;
		this.speed = speed;
		this.radio = radio;
	}
	/*
	 * Mueve la esfera a una interaccion de la velocidad
	 */
	public void move() {
		coordinate.setxAxis(coordinate.getxAxis()+speed.getX());
		coordinate.setyAxis(coordinate.getyAxis()+speed.getY());
		coordinate.setzAxis(coordinate.getzAxis()+speed.getZ());
	}
	/**
	 * @return the coordinate
	 */
	public Coordinate getCoordinate() {
		return coordinate;
	}
	/**
	 * @param coordinate the coordinate to set
	 */
	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	/**
	 * @return the speed
	 */
	public Speed getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(Speed speed) {
		this.speed = speed;
	}
	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}
	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	

	
	
//	public Sphere(){
//        positions = new double[3];
//        assingDiameter();
//        calculateRadio();
//        calculateVolume();
//        assingPosition(positions);
  /*      System.out.println("El diametro de su esfera es de: "+ diameter);
        System.out.println("El radio de su esfera es de: "+ radio);
        System.out.println("El volumen de su esfera es de: "+ volume);
        System.out.println("La posiscion en X de su esfera es : " + positions[0]);
        System.out.println("La posiscion en Y de su esfera es : " + positions[1]);
        System.out.println("La posiscion en Z de su esfera es : "+ positions[2]);*/

//    }

    /*
    * @params
    * asigna una posicion aleatoria para los ejes x,y,z en un area aleatoria de 500 unidades
    * */
//    public void assingPosition(double[] positions){
//        positions[0] = Math.random()*500+1;
//        positions[1] = Math.random()*500+1;
//        positions[2] = Math.random()*500+1;
//    }

    /*
     * @params
     * asigna un diametro aleatorio a la esfera entre 1 y 100 unidades.
     * */
//    public void assingDiameter(){
//        diameter = Math.random()*100+1;
//    }

    /*
     * @params
     * calcaula el radio de la esfera a partir de su diametro
     * */
//    public void calculateRadio(){
//        radio = diameter/2;
//    }

    /*
     * @params
     * calcula el volumen de la esfera a partir del radio con la formula basica.
     * */
//    public void calculateVolume(){
//        volume = (4/3)*PI*(radio*radio*radio);
//    }

//    public static void main(String[] args) {
//        new Sphere();
//    }
}
