package test;

import java.util.ArrayList;

import model.Coordinate;
import model.Sphere;
import model.SphereDistance;
import model.SphereList;
import utilities.BinaryTree;

public class TestBinaryTree {
	
	public static void main(String[] args) {
		//-------------------------------Test distance------------------------------------------------
		ArrayList<Sphere> a = new ArrayList<>();		
		
		for (int i = 0; i <10; i++){
			a.add(new Sphere(new Coordinate(Math.random()*400,Math.random()*400, Math.random()*400),6));
		}
		SphereList sphereList = new SphereList(a);
		sphereList.setDistances();
		//-------------------------------Test BinaryTree------------------------------------------------
		sphereList.getSphereDistance().getDistanceList().recorridoPosorden();
	}

}
