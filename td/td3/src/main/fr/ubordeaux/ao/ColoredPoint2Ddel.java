package fr.ubordeaux.ao;

import fr.ubordeaux.ao.Point2D;
import java.util.Objects;

public class ColoredPoint2Ddel {
    private Point2D point;
    private int r;
    private int g;
    private int b;

    public ColoredPoint2Ddel(Point2D point, int r, int g, int b) {
        this.point = point;
        this.r = r;
        this.g = g;
        this.b = b;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ColoredPoint2Ddel)) {
            return false;
        }

        ColoredPoint2Ddel coloredPoint2Ddel = (ColoredPoint2Ddel) o;
        return point.equals(coloredPoint2Ddel.getPoint()) &&
            (r == coloredPoint2Ddel.r) &&
            (g == coloredPoint2Ddel.g) &&
            (b == coloredPoint2Ddel.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, r, g, b);
    }


    public Point2D getPoint() {
        return this.point;
    }

    private void setPoint(Point2D point) {
        this.point = point;
    }

    public int getR() {
        return this.r;
    }

    private void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return this.g;
    }

    private void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return this.b;
    }

    private void setB(int b) {
        this.b = b;
    }

}
