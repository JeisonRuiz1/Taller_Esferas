/**
 * @Author Edwar Malpica
 * @NameClass Controller.java
 * @NameProyect Taller_Esferas
 * @Date mar 8, 2021
 */
package controller;

import java.util.ArrayList;

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
		return "La distancia mas lejana: "+sphereList.getSphereDistance().getMostDistance();
	}
	private String getModa() {
		return "La distancia que mas se repite es: "+sphereList.getSphereDistance().getModa();
	}
	
	
	private void getList() {
		Cursor<Double> cursor = new Cursor<>(sphereList.getSphereDistance().getDistanceList());
		cursor.printList();
		
	}
	public static void main(String[] args) {
		if(args.length == 2) {
			int args1 = 0;
			int args2 = 0;
			try {
				args1 = Integer.parseInt(args[0]);
				args2 = Integer.parseInt(args[1]);
			} catch (NumberFormatException e) {
				System.out.println("Argumentos invalidos\n Inserte numero de esferas y tiempo en segundos");
			}
			ArrayList<Sphere> sphere = new ArrayList<Sphere>();
			for (int i = 0; i < args1; i++) {
				sphere.add( new Sphere(new Coordinate( (int)(Math.random()*1000+1),  
						(int)(Math.random()*1000+1),  (int)(Math.random()*1000+1)),
						new Speed( (int)(Math.random()*10+1), (int)(Math.random()*10+1),(int)( Math.random()*10+1)), 
						(int)(Math.random()*20+1)));
			}
//			for (Sphere sphere2 : sphere) {
//				System.out.println(sphere2.toString());
//			}
			new Controller(new SphereList(sphere,args2),new View());
		}else {
			System.out.println("Argumentos invalidos\n Inserte numero de esferas y tiempo en segundos");
		}
		
	}
	
	
	
	
}

