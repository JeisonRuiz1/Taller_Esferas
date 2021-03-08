package model;
/*
 * Clase que contiene a la velocidad, esta se trabaja con x,y y z, como vector, la cual 
 * se maneja sobre dezplazamiento/segundo
 */
public class Speed {

	private double x;
	private double y;
	private double z;

	/**
	 * @param x
	 * @param y
	 * @param z
	 * Complejidad O(4)
	 */
	public Speed(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/*
	 * Cambia la direccion de la velocidad
	 * Complejidad O(10)
	 */
	public void changeDirection() {
		double r = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));
		double alpha = Math.toDegrees(Math.acos(Math.toRadians(z/r)));
		double fi = Math.toDegrees(Math.atan(Math.toRadians(y/x)));
		if(alpha<90 && alpha> 0) {
		  alpha = alpha + Math.random()*90;
		}
		if(alpha<180 && alpha> 90) {
			  alpha = alpha - Math.random()*90;
			}
		if(fi<180 && fi<0) {
			fi = fi + Math.random()*180;
		}
		if(fi<360 && fi<180) {
			fi = fi - Math.random()*180;
		}
		x = r* Math.toDegrees(Math.sin(Math.toRadians(alpha))*Math.cos(Math.toRadians(fi)));
		y = r* Math.toDegrees(Math.sin(Math.toRadians(alpha))*Math.sin(Math.toRadians(fi)));
		z = r* Math.toDegrees(Math.cos(Math.toRadians(alpha)));
	}
	

	/**
	 * @return the x
	 * Complejidad O(1)
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 * Complejidad O(1)
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 * Complejidad O(1)
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 * Complejidad O(1)
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * @return the z
	 * Complejidad O(1)
	 */
	public double getZ() {
		return z;
	}

	/**
	 * @param z the z to set
	 * Complejidad O(1)
	 */
	public void setZ(double z) {
		this.z = z;
	}

	
	
	
	
	
}
