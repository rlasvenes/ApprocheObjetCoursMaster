package fr.ubordeaux.ao;

/**
 * Point2D
 */
public class Point2D {
	private int x;
	private int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
    
	public int getX() {
		return this.x;
	}
		
	public int getY() {
		return this.y;
	}

	private void setX(int x) {
		this.x = x;
	}
	
	private void setY(int y) {
		this.y = y;
	}
}