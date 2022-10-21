package Task9.Gym;

public class Ball {
    public enum Color
    {
        GREEN,
        BLUE;
    }
    private Color color;
    private int weight;

    public Ball(Color color, int weight)
    {
        this.color = color;
        this.weight = weight;
    }

    public int getWeight () {
        return weight;
    }

    public Color getColor () {
        return color;
    }
}


