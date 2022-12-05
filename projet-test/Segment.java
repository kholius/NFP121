
// class Segment inherits from Point
public class Segment extends Point {
    // attributs
    private Point p2;

    // constructeur
    public Segment(int x, int y, int x2, int y2) {
        super(x, y);
        p2 = new Point(x2, y2);
    }

    // getters
    public Point getP2() {
        return p2;
    }

    // setters
    public void setP2(int x, int y) {
        p2.setX(x);
        p2.setY(y);
    }

    // affichage
    public void afficher() {
        super.afficher();
        p2.afficher();
    }
}