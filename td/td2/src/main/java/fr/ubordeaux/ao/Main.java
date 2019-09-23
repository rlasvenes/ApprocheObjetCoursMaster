package fr.ubordeaux.ao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.sun.xml.internal.ws.encoding.soap.SerializationException;

public class Main{
    public static void main(String[] args) {
    	ArrayList<Shape2D> shapes = new ArrayList<>();
        Point2D p1 = new Point2D(200, 200); 
        Point2D p2 = new Point2D(50, 50);
        Circle c = new Circle(p1, 50);
       
        Rectangle s = new Rectangle(p1, 150, 300);
        Line l = new Line(p1,p2);
        Ellipse el = new Ellipse(p2,70,15);
        
        el.modifRadius(100);
        el.modifRadius2(50);
        
        c.modifRadius(100);
        c.modifPoint(new Point2D(800, 800));
        
        s.modifSize(300, 700);
        s.modifSize(600, 0);
        s.modifPoint(new Point2D(400, 300));
        
        l.modifPointX2(new Point2D(800, 800));
        
        shapes.add(c);
        shapes.add(s);
        shapes.add(el);
        shapes.add(l);
        
        for (Shape2D shape : shapes) {
        	System.out.println("Aire " + shape.getClass().getSimpleName() + " = " + shape.aire());
        }
        
        try {
			SVG svg = new SVG(1000,900);
			svg.addShape(s);
			svg.addShape(c);
			svg.addShape(l);
			svg.addShape(el);
			svg.svgToDoc();
			BufferedWriter file = new BufferedWriter(new FileWriter(new File("Shapes.html")));
			file.write( svg.svgToDoc());			 
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
    }
}