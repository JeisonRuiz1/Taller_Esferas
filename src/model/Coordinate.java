package model;

public class Coordinate {

    private double xAxis, yAxis, zAxis;

	/**
	 * Complejidad O(4)
	 * @param xAxis
	 * @param yAxis
	 * @param zAxis
	 */
	public Coordinate(double xAxis, double yAxis, double zAxis) {
		super();
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.zAxis = zAxis;
	}

	/**
	 * @return the xAxis
	 */
	public double getxAxis() {
		return xAxis;
	}

	/**
	 * @param xAxis the xAxis to set
	 * Complejidad O(1)
	 */
	public void setxAxis(double xAxis) {
		this.xAxis = xAxis;
	}

	/**
	 * @return the yAxis
	 * Complejidad O(1)
	 */
	public double getyAxis() {
		return yAxis;
	}

	/**
	 * @param yAxis the yAxis to set
	 * Complejidad O(1)
	 */
	public void setyAxis(double yAxis) {
		this.yAxis = yAxis;
	}

	/**
	 * @return the zAxis
	 * Complejidad O(1)
	 */
	public double getzAxis() {
		return zAxis;
	}

	/**
	 * @param zAxis the zAxis to set
	 * Complejidad O(1)
	 */
	public void setzAxis(double zAxis) {
		this.zAxis = zAxis;
	}

   
}
