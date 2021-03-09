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
import utilities.Cursor;
import utilities.MySimpleNodo;
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
			getList();
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
		return "La distancia que mas se repite es: "+sphereList.getSphereDistance().getModa();
	}
	
	
	private void getList() {
		Cursor cursor = new Cursor(sphereList.getSphereDistance().getDistanceList());
		cursor.printList();
		
	}
	public static void main(String[] args) {
		Sphere[] sphere = new Sphere[30];
		for (int i = 0; i < sphere.length; i++) {
			sphere[i] = new Sphere(new Coordinate( (int)(Math.random()*1000+1),  
					(int)(Math.random()*1000+1),  (int)(Math.random()*1000+1)),
					new Speed( (int)(Math.random()*10+1), (int)(Math.random()*10+1),(int)( Math.random()*10+1)), 
					(int)(Math.random()*20+1));
		}
		new Controller(new SphereList(sphere,10),new View());
	}
	
	
	
	
}

