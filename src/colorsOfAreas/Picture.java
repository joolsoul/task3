package colorsOfAreas;

public class Picture {

    private static Square square1;
    private static Square square2;
    private static Circle circle;
    private static HorizontalParabola horizontalParabola;

    public  Picture (Square square1, Square square2, Circle circle, HorizontalParabola horizontalParabola)
    {
        this.square1 = square1;
        this.square2 = square2;
        this.circle = circle;
        this.horizontalParabola = horizontalParabola;

    }

    public SimpleColor getColor(Point p1)
    {
        if ((horizontalParabola.isPointInside(p1) && square1.isPointInside(p1)) || (square2.isPointInside(p1) && circle.isPointInside(p1)))
            return SimpleColor.ORANGE;
        if (horizontalParabola.isPointInside(p1) || circle.isPointInside(p1))
            return SimpleColor.GREEN;
        if (square1.isPointInside(p1))
            return SimpleColor.YELLOW;
        if (square2.isPointInside(p1))
            return SimpleColor.BLUE;
        return SimpleColor.ORANGE;
    }
}
