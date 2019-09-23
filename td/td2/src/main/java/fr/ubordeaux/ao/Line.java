package fr.ubordeaux.ao;

import org.jdom2.Element;

public class Line implements Shape2D {
    private Point2D x1;
  	private Point2D x2;

  	public Line(Point2D x1, Point2D x2) {
  		super();
  		this.x1 = x1;
  		this.x2 = x2;
  	}

  	public double aire() {
		return 0;
	}

	public double perimetre() {
		return 0;
	}

	public Element getSvgElement() {
		Element line = new Element("line");
		line.setAttribute("x1",String.valueOf(this.getPointX1().getX()));
	    line.setAttribute("y1",String.valueOf(this.getPointX1().getY()));
	    line.setAttribute("x2",String.valueOf(this.getPointX2().getY()));
	    line.setAttribute("y2",String.valueOf(this.getPointX2().getY()));
	    line.setAttribute("stroke","purple");
	    line.setAttribute("stroke-width","2");	  
		return line;
	}


	public Point2D getPointX1() {
		return x1;
	}

	public void setPointX1(Point2D x1) {
		this.x1 = x1;
	}

	public Point2D getPointX2() {
		return x2;
	}

	public void setPointX2(Point2D x2) {
		this.x2 = x2;
	}
	
	public void modifPointX1(Point2D newPoint) {		
		this.setPointX1(new Point2D (newPoint.getX(), newPoint.getY()) );
	}
	
	public void modifPointX2(Point2D newPoint) {		
		this.setPointX2(new Point2D (newPoint.getX(), newPoint.getY()) );
	}
}
