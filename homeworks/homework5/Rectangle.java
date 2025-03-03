/**
 * Description of Class goes here - YOU WRITE IT
 * @author YOUR NAMES GO HERE
 *
 */

public class Rectangle extends Closed implements FiguresInterface {
	
	// A rectangle has a length and a width.  
	public int length;
	public int width;
	
	/**
	 * Constructor that sets the lower left corner to
	 * the x and y value and sets the length and width
	 * of this rectangle.
	 * @param x The x coordinate of the lower left corner
	 * @param y The y coordinate of the lower left corner
	 * @param length Length of the rectangle
	 * @param width Width of the rectangle
	 */
	// WRITE THE CODE FOR THIS CONSTRUCTOR.
	// Understand the first line.  Do not change it.
	// Add the rest.
	public Rectangle(int x, int y, int length, int width){
		super(x, y);
		this.length = length;
		this.width = width;
		
	}
	
	/**
	 * FILL IN DESCRIPTION
	 * @return FILL IN DESCRIPTION
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS 0.  FIX THIS WITH YOUR CODE.
	public int getLength() {
		return length;
	}

	/**
	 * FILL IN DESCRIPTION
	 * @param length FILL IN DESCRIPTION
	 */
	//WRITE THE CODE FOR THIS METHOD.  
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * FILL IN DESCRIPTION
	 * @return FILL IN DESCRIPTION
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS 0. FIX THIS CODE.
	public int getWidth() {
		return width;
	}

	
	/**
	 * FILL IN DESCRIPTION
	 * @param width FILL IN DESCRIPTION
	 */
	//WRITE THE CODE FOR THIS METHOD.  
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Calculates the perimeter of the rectangle.
	 * @return Perimeter of the rectangle.
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS 0.  FIX THIS WITH YOUR CODE.
	public int perimeter() {
		return 2 * (length + width);
	}
	
	/**
	 * Calculates the area of the rectangle.
	 * @return Area of the rectangle.
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS 0.  FIX THIS WITH YOUR CODE.
	public int area() {
		return length * width;
	}
	
	/**
	 * Increases the size of the rectangle by the percentage
	 * indicated by the input parameter.  e.g. 20 would
	 * increase the length by 20% AND would increase 
	 * the width by 20%
	 * 
	 * @param percent The percentage to increase by.
	 */
	//WRITE THE CODE FOR THIS METHOD.  
	public void enlargeSize(int percent) {
		length += (int)(length*.01*percent);
		width += (int)(width*.01*percent);
		
	}
	
	/**
	 * FILL IN DESCRIPTION
	 * @return FILL IN DESCRIIPTION
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS NULL.  FIX THIS CODE.
	public Point getRightUpper(){
		return new Point(location.getX() + length, location.getY() + width);
	}
	
	/**
	 * FILL IN DESCRIPTION
	 * @return FILL IN DESCRIPTION
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS NULL.  FIX THIS WITH YOUR CODE.
	public Point getLeftUpper(){
		return new Point(location.getX(), location.getY() + width);
	}
	
	/**
	 * A rectangle equals another rectangle if the corners of the rectangles are equal.
	 * @param r Rectangle to checked to see if contained in this rectangle.
	 * @return true if r is in this rectangle; false otherwise
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS FALSE.  FIX THIS WITH YOUR CODE. 
	public boolean equals(Rectangle r) {
		return this.getLeftUpper().equals(r.getLeftUpper()) && this.getRightUpper().equals(r.getRightUpper()) && this.location.equals(r.location) && this.getRightLower().equals(r.getRightLower());
	}
	
	/**
	 * Calculates the right lower corner of the rectangle.
	 * @return  Point of the right lower corner.
	 */
	//No changes needed for this method.  
	public Point getRightLower(){
		return new Point(location.getX() + length, location.getY());
	}
	
	
	/**
	 * If the Point pt is in the rectangle's space (can be on the perimeter), return true;
	 * @param pt The point we are checking to see if it is in the Rectangle's space.
	 * @return true if in the rectangle or on the perimeter; false, otherwise
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS FALSE.  FIX THIS WITH YOUR CODE.
	public boolean inside(Point pt) {
		return pt.getX() >= location.getX() && pt.getX() <= location.getX() + length && pt.getY() >= location.getY() && pt.getY() <= location.getY() + width;		
	}

	@Override
	// No changes needed for this method.  Keep as is.
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", Left Bottom Corner: " + location + "]";
	}
			
}


