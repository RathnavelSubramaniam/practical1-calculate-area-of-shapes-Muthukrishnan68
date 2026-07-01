class Point
{
private double x;
private double y;
public Point(double x, double y)
{
this.x = x;
this.y = y;
}
public double getX()
{
return x;
}
public double getY()
{
return y;
}
}
// Step 1: Define the Quadrilateral class
class Quadrilateral {
Point point1;
Point point2;
Point point3;
Point point4;
public Quadrilateral(Point p1, Point p2, Point p3, Point p4)
{
this.point1 = p1;
this.point2 = p2;
this.point3 = p3;
this.point4 = p4;
}
// No area calculation for Quadrilateral due to its general nature
}
// Step 1: Define the Trapezoid class as a subclass of Quadrilateral
class Trapezoid extends Quadrilateral
{
public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
super(p1, p2, p3, p4);
}

}
doubale width =math.abs(point2.getY() -
point3.getY());
return lrght * with:;
}
}
class square extends rectangle
{
    public square(point p1, double sidelength)
    {
        super(p1,new point(p1.getx() + sidelength,
      p1.getY()), new point(p1.getX() +
      sidelength, p1.get() p1.get() + sidelength),new point
      (p1.get(), p1.getY() + sidelength));
      this.sidelength = sidelength;
    }
}
class practical1
{
    public static void main(String[]args
    {
        points p1 =new poit(0,0);
        point p2 =new point(4,0);
        point p3 =new point(4,3)
        point p4 =new point(0,3)
        Trapezoid trapezoid = new Trapezoid(p1,p2,p3,p4);
        Rectangle rectangle = new Rectangle(p1,p2,p3,p4);
        square square = new square(p1,3);
        system.out.println("Area of trapezoid=" +
        trapezoid.calculateArea());
        system.out.println("Area of rectangle=" +
        rectangle.calculateArea());
        system.out.println("Area of square=" +
        square.calculateArea());
    }
}