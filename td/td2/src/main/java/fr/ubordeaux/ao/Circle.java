package fr.ubordeaux.ao;

import org.jdom2.Element;

public class Circle implements Shape2D {
    private Point2D center;
    private int radius;

    public Circle(Point2D center, int radius) {
        this.center = new Point2D(center.getX(), center.getY());
        this.radius = radius;
    }
    
    public Point2D getCenter() {
        return new Point2D(this.center.getX(), this.center.getY());
    }

    private void setPoint(Point2D point) {
        this.center= new Point2D(point.getX(), point.getY());
    }

    public int getRadius() {
        return this.radius;
    }

    protected void setRadius(int radius) {
        this.radius = radius;
    }

    public double aire() {
        return this.radius*Math.pow(2, Math.PI);
    }

    public double perimetre() {
        return this.radius*Math.PI;
    }

	@Override
	public Element getSvgElement() {
		Element circle = new Element("circle");
		circle.setAttribute("cx", String.valueOf(this.getCenter().getX()));
		circle.setAttribute("cy", String.valueOf(this.getCenter().getY()));
		circle.setAttribute("r", String.valueOf(this.getRadius()));
	    circle.setAttribute("stroke","red");
	    circle.setAttribute("stroke-width","2");	  
		return circle;
	}
	
	public void  modifRadius(int newRadius) {
		this.setRadius(newRadius);
	}
	
	public void modifPoint(Point2D newPoint) {		
		this.setPoint(new Point2D (newPoint.getX(), newPoint.getY()) );
	}
    
}