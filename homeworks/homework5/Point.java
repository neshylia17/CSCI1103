/**
 * FILL IN DESCRIPTION OF CLASS
 * @author YOUR NAMES
 *
 */

public class Point {
	
	// A point is a position in the x-y coordinate system.
	private int x;
	private int y;
	
	/**
	 * default constructers.  No need to change this.
	 */
	public Point() {
		super();
		 x = 0;
		 y = 0;
	}

	/**
	 * FILL IN DESCRIPTION
	 * @param x FILL IN DESCRIPTION
	 * @param y FILL IN DESCRIPTION
	 */
	// Set this point's x and y values to the input parameters.
	// ADD THE CODE TO THIS CONSTRUCTOR.
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Returns the value of this Point's x value.
	 * @return x value of this point
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS 0.  FIX THIS WITH YOUR CODE.
	public int getX() {
		return x;
	}

	/**
	 * FILL IN DESCRIPTION
	 * @param x FILL IN DESCRIPTION
	 */
	// WRITE THE CODE FOR THIS METHOD.
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * FILL IN DESCRIPTION
	 * @return FILL IN DESCRIPTION
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS 0.  FIX THIS WITH YOUR CODE.
	public int getY() {
		return y;
	}

	/**
	 * FILL IN DESCRIPTION
	 * @param y FILL IN DESCRIPTION
	 */
	//WRITE THE CODE FOR THIS METHOD.  
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Determines if two points are equal to one another.
	 * If the x values are the equal and the y values are
	 * equal, then the two points are equal
	 * @param p 
	 * @return FILL IN DESCRIPTION
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS FALSE.  FIX THIS WITH YOUR CODE.
	public boolean equals(Point p) {
		return this.x == p.x && this.y == p.y;	
	}

	@Override
	// This is a complete method.  No changes necessary.
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
	
	

}
