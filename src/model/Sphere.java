package model;

import java.io.BufferedReader;

public class Sphere {

    private double radio, area, volumen;
    private double PI = 3.1416;

    public Sphere(){
        radio = (double)(Math.random());
        System.out.println("El radio de la esfera es : " + radio);
        area = PI * (radio*radio);
        System.out.println("El area de la esfera es : " + area);
        volumen = 4*PI*(radio*radio);
        System.out.println("El volumen de la esfera es : " + volumen);
    }

    public static void main(String[] args) {
        new Sphere();
    }
}
