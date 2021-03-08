package run;

import java.util.ArrayList;
import java.util.Random;

import controller.Controller;
import model.Coordinate;
import model.Speed;
import model.Sphere;
import model.SphereList;
import view.View;

public class Run {

	/**
	 * Complejidad O(log N)
	 * @param args
	 */
    public static void main(String[] args) {
    	
    	if(args.length == 1) {
    		ArrayList<Sphere> sphereList = new ArrayList<>();
    		Random random = new Random();
    		for(int i = 0;i<Integer.parseInt(args[0]);i++) {
    			sphereList.add(new Sphere(new Coordinate(random.nextDouble()*1000, random.nextDouble()*1000, random.nextDouble()*1000)
    					, new Speed(random.nextDouble()*10,random.nextDouble()*10,random.nextDouble()*10), random.nextDouble()*50));
    		}
    		
    		 SphereList list = new SphereList(sphereList);
    		 View view = new View();
    		 
            new Controller(list,view);

    	}
    	    }
}
