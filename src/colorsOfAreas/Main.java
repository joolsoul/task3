package colorsofareas;

import java.util.Scanner;
import java.util.Locale;

public class Main
{

    public static void main(String[] args)
    {
        Locale.setDefault(Locale.ROOT);

        Picture picture = new Picture(new Square(-5, 2, 1, 9), new Square(1, -1, 5, 9), new Circle(8, 5, 5), new HorizontalParabola(-1, 0, 0.5));

        if (testPoints(picture, new TestPoints()))
        {
            Point p1 = readPoint("p1");
            picture.getColor(p1);

            System.out.println(picture.getColor(p1));
        }
        else
        {
            System.out.println("The program is not working correctly");
        }
    }

    private static boolean testPoints(Picture picture, TestPoints testPoints)
    {
        boolean testResult = true;
        for(int i = 0; i < testPoints.testPoints.length; i++)
        {
            Point testPoint = testPoints.getPoint(i);
            SimpleColor currentColor = picture.getColor(testPoint);

            SimpleColor correctColor = testPoints.getCorrectColor(i);

            if (correctColor == currentColor)
            {
                printCorrectResult(currentColor, correctColor, testPoint);
            }
            else
            {
                printIncorrectResult(currentColor, correctColor, testPoint);
                testResult = false;
            }
        }
        return testResult;
    }

    static void printCorrectResult(SimpleColor currentResult, SimpleColor correctResult, Point point)
    {
        System.out.printf("The Point x:%s y:%s. Test result - correct: current color is %s | correct color is %s \n", point.getX(), point.getY(), currentResult, correctResult);
        System.out.println();
    }

    static void printIncorrectResult(SimpleColor currentResult, SimpleColor correctResult, Point point)
    {
        System.out.printf("The Point x:%s y:%s. Test result - incorrect: current color is %s | correct color is %s \n", point.getX(), point.getY(), currentResult, correctResult);
        System.out.println();
    }

    static double readDouble(String variable)
    {
        System.out.printf("Input %s = ", variable);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    static Point readPoint(String point)
    {
        double x = readDouble(String.format("%s.x", point));
        double y = readDouble(String.format("%s.y", point));
        return new Point(x, y);
    }
}