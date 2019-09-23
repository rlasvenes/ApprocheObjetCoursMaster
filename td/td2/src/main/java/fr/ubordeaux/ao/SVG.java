package fr.ubordeaux.ao;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class SVG {
    private int width;
    private int height;
    private Element baliseSvg;
    private Document document;
    

    public SVG(int width, int height) throws IOException {
        this.width = width;
        this.height = height;
        this.generateHtml();
    }

    public void generateHtml() throws IOException {
		document = new Document();
		Element racine = new Element("html");
		document.addContent(racine);
		Element body = new Element("body");
		baliseSvg = new Element("svg");
		baliseSvg.setAttribute("width", String.valueOf(width));
		baliseSvg.setAttribute("height", String.valueOf(height));
		body.addContent(baliseSvg);
		racine.addContent(body);
	}
    
    public String svgToDoc() {
	    XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
		String s = sortie.outputString(document);
		System.out.println(s);
		return s;
	}
    
    public void addShape(Shape2D shape){
	    baliseSvg.addContent(shape.getSvgElement());
    }
}