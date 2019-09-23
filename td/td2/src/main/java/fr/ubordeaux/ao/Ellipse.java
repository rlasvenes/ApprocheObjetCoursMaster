package fr.ubordeaux.ao;

import org.jdom2.Element;

public class Ellipse extends Circle {
    private Point2D center;
    private int radius;
    private int radius2;

    public Ellipse(Point2D center, int radius, int radius2) {
        super(center, radius);
        this.radius2 = radius2;
    }         

    public Point2D getPoint() {
        return new Point2D(super.getCenter().getX(), super.getCenter().getY());
    }

    private void setPoint(Point2D point) {
        this.center = new Point2D(point.getX(), point.getY());
    }

    public double aire() {
        return Math.PI * super.getRadius() * radius2;
    }

    public double perimetre() {
        return 2*Math.PI*Math.sqrt( (Math.pow(2,radius) + Math.pow(2,radius2) ) / 2 );
    }

    @Override
    public Element getSvgElement() {
    	Element  ellipse= new Element("ellipse");
    	ellipse.setAttribute("cx", String.valueOf(super.getCenter().getX()));
    	ellipse.setAttribute("cy", String.valueOf(super.getCenter().getY()));
    	ellipse.setAttribute("rx", String.valueOf(super.getRadius()));
    	ellipse.setAttribute("ry", String.valueOf(this.getRadius2()));
    	ellipse.setAttribute("stroke","blue");
    	ellipse.setAttribute("stroke-width","2");	  
    	return ellipse;
    }
    
	public Point2D getCenter() {
		return center;
	}

	private void setCenter(Point2D center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	protected void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius2() {
		return radius2;
	}

	private void setRadius2(int radius2) {
		this.radius2 = radius2;
	}	
	
	public void modifRadius(int newRadius) {
		super.setRadius(newRadius);
	}
	
	public void modifRadius2(int newRadius2) {
		this.setRadius2(newRadius2);
	}
}