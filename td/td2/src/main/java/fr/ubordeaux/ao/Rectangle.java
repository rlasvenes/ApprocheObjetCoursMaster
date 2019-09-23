package fr.ubordeaux.ao;

import org.jdom2.Element;

public class Rectangle implements Shape2D {
    private Point2D topLeft;
    private int width;
    private int height;

    public Rectangle(Point2D topLeft, int width, int height) {
        this.topLeft = new Point2D(topLeft.getX(), topLeft.getY());
        this.width = width;
        this.height = height;
    }

    public Point2D getPoint() {
        return new Point2D(this.topLeft.getX(), this.topLeft.getY());
    }

    private void setPoint(Point2D point) {
        this.topLeft = new Point2D(point.getX(), point.getY());
    }

    public int getWidth() {
		return this.width;
	}
		
	public int getHeight() {
		return this.height;
	}

	private void setWidth(int width) {
		this.width = width;
    }

    private void setHeight(int height) {
		this.height = height;
    }

    public double aire() {
        return width * height;
    }

    public double perimetre() {
        return (width + height) * 2;
    }

	@Override
	public Element getSvgElement() {
		Element rect = new Element("rect");
		rect.setAttribute("x", String.valueOf(this.getPoint().getX()));
		rect.setAttribute("y", String.valueOf(this.getPoint().getY()));
		rect.setAttribute("width", String.valueOf(this.getWidth()));
	    rect.setAttribute("height", String.valueOf(this.getHeight()));
	    rect.setAttribute("stroke","black");
	    rect.setAttribute("stroke-width","2");	  
		return rect;
	}

	public void modifSize(int newWidth, int newHeight) {
		if (newWidth != 0) {
			this.setWidth(newWidth);
		}
		
		if (newHeight != 0) {
			this.setHeight(newHeight);
		}
	}
	
	public void modifPoint(Point2D newPoint) {		
		this.setPoint(new Point2D (newPoint.getX(), newPoint.getY()) );
	}
    
}