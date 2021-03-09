/**
 * @Author Edwar Malpica
 * @NameClass Controller.java
 * @NameProyect Taller_Esferas
 * @Date mar 8, 2021
 */
package controller;

import model.Coordinate;
import model.Speed;
import model.Sphere;
import model.SphereList;
import view.View;

/**
 * @author eduar
 *
 */
public class Controller {

	private SphereList sphereList;
	private View view;
	/**
	 * @param sphereList
	 * @param view
	 */
	public Controller(SphereList sphereList, View view) {
		super();
		this.sphereList = sphereList;
		this.view = view;
		sphereList.setDistances();
		init();
	}
	
	private void init() {
		view.showMessage(Constants.MENU);
		int a = view.getOption();
		System.out.println(a);
		switch (a) {
		case 1:
			view.showMessage(getMostDistance());
			view.spaceMoment();
			init();
			break;
		case 2:
			view.showMessage(getModa());
			view.spaceMoment();
			init();
			break;
		case 3:
			view.showMessage(getList());
			view.spaceMoment();
			init();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			view.showMessage(Constants.MESSAGE_DEFAULT);
			view.spaceMoment();
			init();
			break;
		}
		
		
		
	}
	private String getMostDistance() {	
		return "Promedio: "+sphereList.getSphereDistance().getAverageDistance();
	}
	private String getModa() {
		return "La distancia que mas se repite es: "/*Moda aritmetica*/;
	}
	
	private String getList() {
		String result = "";
		//recorrer estructura
		
		return result = "";
	}
	public static void main(String[] args) {
		Sphere[] sphere = new Sphere[10];
		for (int i = 0; i < sphere.length; i++) {
			sphere[i] = new Sphere(new Coordinate( Math.random()*100+1,  Math.random()*100+1,  Math.random()*100+1), new Speed( Math.random()*10, Math.random()*10, Math.random()*10), Math.random()*50+1);
		}
		new Controller(new SphereList(sphere),new View());
	}
	
	
	
	
}

