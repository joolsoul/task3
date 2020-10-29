package colorsOfAreas;

public class Square
{
    public double x1;
    public double y1;
    public double x2;
    public double y2;

    public Square(double x1, double y1, double x2, double y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x1 = x2;
        this.y1 = y2;
    }
    public boolean isPointInside(Point p1)
    {
        return ((p1.x >= x1) && (p1.x <= x2) && (p1.y >= y1) && (p1.y <= y2));
    }
}
