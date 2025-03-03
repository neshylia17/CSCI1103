
/**
 * The Closed class extends the abstract class Figure. Closed
 * figures have their shape enclosed entirely by line segments.
 * 
 * @author YOUR NAMES GO HERE
 *
 */

public class Closed extends Figure {
    
	// Keep as is.  Understand what it does.
	public Closed(int x, int y){
		location = new Point(x, y);
	}
	
	// Keep as is.  Understand what it does.
	public void moveTo(int x, int y) {
		location.setX(x);
		location.setY(y);
	}
	
	/**
	 * The origination point for the figure.
	 * @return This figure start point location.
	 */
	//WRITE THE CODE FOR THIS METHOD.  IT CURRENTLY
	//RETURNS NULL.  FIX THIS WITH YOUR CODE.
	public Point getLocation() {
		return location;
	}
	
	@Override
	// Do not change this method.  Keep as is.
	public String toString() {
		return super.toString();
	}
	
}


