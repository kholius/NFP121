

public class ExempleSchema1{


    public static void main(String[] args)
    {
        // Création d'un point
        Point p1 = new Point(1,1);
        // Création d'un autre point
        Point p2 = new Point(9,6);
        // Création d'un troisième point
        Point p3 = new Point(4,11);

        // Création d'un segment
        Segment s1 = new Segment(p1, p2);
        // Création d'un autre segment
        Segment s2 = new Segment(p2, p3);
        // Création d'un troisième segment
        Segment s3 = new Segment(p3, p1);

        // calcul barycentre
        // float x = x de p1 + x de p2 + x de p3 / 3;
        double x = (p1.getX() + p2.getX() + p3.getX()) / 3;
        double y = (p1.getY() + p2.getY() + p3.getY()) / 3;

    
    
    
    }

    
}