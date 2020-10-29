package colorsOfAreas;

public class TestPoints
{

    Point[] testPoints =
            {
                    new Point(-1, 4),
                    new Point(2, 2),
                    new Point(-6, 1),
                    new Point(7, 3),
                    new Point(4, 4),
                    new Point(5, -3),
            };

    SimpleColor[] correctColors =
            {
                    SimpleColor.YELLOW,
                    SimpleColor.BLUE,
                    SimpleColor.GREEN,
                    SimpleColor.GREEN,
                    SimpleColor.ORANGE,
                    SimpleColor.ORANGE,

            };

    Point getPoint(int i)
    {
        return testPoints[i];
    }

    SimpleColor getCorrectColor(int i)
    {
        return correctColors[i];
    }
}