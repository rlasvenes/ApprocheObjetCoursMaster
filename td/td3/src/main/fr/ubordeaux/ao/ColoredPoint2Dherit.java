package fr.ubordeaux.ao;

import fr.ubordeaux.ao.Point2D;
import java.util.Objects;

public class ColoredPoint2Dherit extends Point2D {
    private int r;
    private int g;
    private int b;

    public ColoredPoint2Dherit(int x, int y, int r, int g, int b) {
        super(x, y);
        this.r = r;
        this.g = g;
        this.b = b;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ColoredPoint2Dherit)) {
            return false;
        }

        ColoredPoint2Dherit coloredPoint2Dherit = (ColoredPoint2Dherit) o;
        return  (r == coloredPoint2Dherit.r) &&
                (g == coloredPoint2Dherit.g) &&
                (b == coloredPoint2Dherit.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getX(), super.getY(), r, g, b);
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
