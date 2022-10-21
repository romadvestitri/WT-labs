package Task2.CoordinateAxis;

public class AxisCalculator {
    public boolean checkBorders(int x, int y)
    {
        if (((y >= 0) && (y <= 5)) && ((x >= -4) && (x <= 4)))
        {
            return true;
        }
        if (((y <= 0) && (y >= -3)) && ((x >= -6) && (x <= 6)))
        {
            return true;
        }
        return false;
    }
}
