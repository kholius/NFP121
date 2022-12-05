    
// create a class Point
public class Point {
    // attributes
    private int x;
    private int y;

    // constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // display
    public void afficher() {
        System.out.println("x = " + x + ", y = " + y);
    }
}




