package fr.ubordeaux.ao;

/**
 * Point2D
 */
public class Point2D {
    private int x;
    private int y;


    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Point2D)) {
            return false;
        }
        Point2D point2D = (Point2D) o;
        return x == point2D.x && y == point2D.y;
    }   
    @Override
    public int hashCode() {
        return Objects.hash(this.x,this.y);
    }
    
    public getX() {
        return this.x;
    }
    private void setX(int x) {
        this.x = x;
    }

    public getY() {
        return this.y;
    }
    private void setY(int y) {
        this.y = y;
    }

        
}