package Task9;
import Task9.Gym.Ball;
import Task9.Gym.Basket;
public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.addBall(new Ball(Ball.Color.BLUE, 2));
        basket.addBall(new Ball(Ball.Color.GREEN, 3));
        basket.addBall(new Ball(Ball.Color.BLUE, 4));
        basket.addBall(new Ball(Ball.Color.GREEN, 5));

        System.out.printf("Weight of basket - %d\n", basket.getBasketWeight());
        System.out.printf("Number of blue balls in basket - %d", basket.getCountOfBalls());
    }
}
