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
		double alpha = Math.acos(z/r);
		double fi = Math.atan(y/x);
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
		x =  (int)(r* Math.sin(alpha)*Math.cos(fi));
		y =  (int)(r* Math.sin(alpha)*Math.sin(fi));
		z = (int)(r* Math.cos(alpha));
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
	 */
	public double getZ() {
		return z;
	}

	/**
	 * @param z the z to set
	 */
	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Speed [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	
	
	
	
	
}
