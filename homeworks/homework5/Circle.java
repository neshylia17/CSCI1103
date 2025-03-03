/**
 * What does this class represent?  WRITE IT HERE
 * @author YOUR NAMES GO HERE
 *
 */
public class Circle extends Closed {
	private int radius;
	
	/**
	 * FILL IN DESCRIPTION
	 * @param x - x cordinites
	 * @param y - y cordinates
	 * @param radius - part of formula
	 */
	//WRITE THE CODE FOR THIS METHOD. FIX THIS.
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	/**
	 * get the radius 
	 * @return FILL IN DESCRIPTION
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS 0.  FIX THIS WITH YOUR CODE.
	public int getRadius() {
		return radius;
	}
	
	/**
	 * reintionalize
	 * @param radius FILL IN DESCRIPTION
	 */
	//WRITE THE CODE FOR THIS METHOD.  
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * FILL IN DESCRIPTION
	 * @return the formula of diameter
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS 0.  FIX THIS WITH YOUR CODE.
	public int diameter() {
		return 2 * radius;
	}
	
	/**
	 * FILL IN DESCRIPTION
	 * @return the formula of a cirlce 
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS 0.0.  FIX THIS WITH YOUR CODE.
	public double area() {
		return Math.PI * Math.pow(radius, 2.0);
	}
	
	/**
	 * FILL IN DESCRIPTION
	 * 
	 * @return formula of a circumference
	 */
	public double circumference() {
		return 2 * Math.PI * radius;
	}
	
	/**
	 * Two circles are equal if they have the same radius
	 * and the same center point location.
	 * @param c2 The circle we are checking for equality.
	 * @return True if the circles are equal; false, otherwise.
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS FALSE.  FIX THIS WITH YOUR CODE.
	public boolean equals(Circle c2) {
		return radius == c2.radius && this.location.equals(c2.location);
	}

	@Override
	// Do not change this.  Keep as is.
	public String toString() {
		return "Circle [radius=" + radius + ", Center: " + location + "]";
	}
	
	
}
