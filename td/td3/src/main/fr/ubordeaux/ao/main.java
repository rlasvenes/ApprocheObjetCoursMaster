package main.fr.ubordeaux.ao;

import fr.ubordeaux.ao.ColoredPoint2Dherit;
import fr.ubordeaux.ao.Point2D;

class main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1, 1);
        ColoredPoint2Dherit p2 = new ColoredPoint2Dherit(1,1,45,145,255);

        System.out.println("p1 = p2 ? " + p1.equals(p2));
        System.out.println("p2 = p1 ? " + p2.equals(p1));

        System.out.println("zijef".compareTo("aaa"));
    }    
}