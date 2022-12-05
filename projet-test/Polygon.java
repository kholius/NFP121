
// class polygon inherits from Segment
public class Polygon extends Segment {
    // attributs
    private Segment[] segments;

    // constructeur
    public Polygon(int x, int y, int x2, int y2, int x3, int y3) {
        super(x, y, x2, y2);
        segments = new Segment[2];
        segments[0] = new Segment(x2, y2, x3, y3);
        segments[1] = new Segment(x3, y3, x, y);
    }

    // getters
    public Segment[] getSegments() {
        return segments;
    }

    // setters
    public void setSegments(int x, int y, int x2, int y2, int x3, int y3) {
        segments[0].setP2(x2, y2);
        segments[1].setP2(x3, y3);
        segments[2].setP2(x, y);
    }

    // affichage
    public void afficher() {
        super.afficher();
        segments[0].afficher();
        segments[1].afficher();
    }
}