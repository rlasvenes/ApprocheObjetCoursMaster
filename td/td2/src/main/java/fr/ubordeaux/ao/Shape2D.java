package fr.ubordeaux.ao;

import org.jdom2.Element;

public interface Shape2D {
    public double aire();
    public double perimetre();
    public Element getSvgElement();
}