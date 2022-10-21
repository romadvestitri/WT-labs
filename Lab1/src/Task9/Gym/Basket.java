package Task9.Gym;
import Task9.Gym.Ball;
import java.util.ArrayList;
import java.util.List;

public class Basket
{
    private List<Ball> balls;
    public Basket()
    {
        balls = new ArrayList<>();
    }
    public void addBall(Ball ball)
    {
        balls.add(ball);
    }
    public List<Ball> getBalls()
    {
        return balls;
    }

    public int getBasketWeight()
    {
        int weight = 0;
        for (Ball ball: this.getBalls())
        {
            weight += ball.getWeight();
        }
        return weight;
    }
    public int getCountOfBalls() {
        int count = 0;
        for (Ball ball : this.getBalls()) {
            if (ball.getColor() == Ball.Color.BLUE)
            {
                count++;
            }
        }
        return count;
    }
}
