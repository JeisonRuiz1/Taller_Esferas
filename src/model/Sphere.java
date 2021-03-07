package model;

import java.io.BufferedReader;

public class Sphere {

    public static final double PI = Math.PI;
    private double[] positions, speedct;
    private double diameter, radio, volume;

    public Sphere(){
        positions = new double[3];
        assingDiameter();
        calculateRadio();
        calculateVolume();
        assingPosition(positions);
  /*      System.out.println("El diametro de su esfera es de: "+ diameter);
        System.out.println("El radio de su esfera es de: "+ radio);
        System.out.println("El volumen de su esfera es de: "+ volume);
        System.out.println("La posiscion en X de su esfera es : " + positions[0]);
        System.out.println("La posiscion en Y de su esfera es : " + positions[1]);
        System.out.println("La posiscion en Z de su esfera es : "+ positions[2]);*/

    }

    /*
    * @params
    * asigna una posicion aleatoria para los ejes x,y,z en un area aleatoria de 500 unidades
    * */
    public void assingPosition(double[] positions){
        positions[0] = Math.random()*500+1;
        positions[1] = Math.random()*500+1;
        positions[2] = Math.random()*500+1;
    }

    /*
     * @params
     * asigna un diametro aleatorio a la esfera entre 1 y 100 unidades.
     * */
    public void assingDiameter(){
        diameter = Math.random()*100+1;
    }

    /*
     * @params
     * calcaula el radio de la esfera a partir de su diametro
     * */
    public void calculateRadio(){
        radio = diameter/2;
    }

    /*
     * @params
     * calcula el volumen de la esfera a partir del radio con la formula basica.
     * */
    public void calculateVolume(){
        volume = (4/3)*PI*(radio*radio*radio);
    }
    
	public void move() {

	}

    public static void main(String[] args) {
        new Sphere();
    }
    
}
