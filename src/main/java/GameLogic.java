import logic.Ball;
import logic.Direction;

import java.awt.*;

public class GameLogic {
    private Ball ball;
    private Ball ballEnemy;

    public GameLogic() {
        this.ball = null;
        this.ballEnemy = null;
    }

    public void initialize() {
        ball = new Ball(20, 20, 50, 50, Color.BLUE);
        ballEnemy = new Ball(250, 20, 70, 70, Color.RED);
    }

    public void update() {
        if (ball.isCollided(ballEnemy.getBallRectangle())) {
            ballEnemy.inactive();
        }
        ball.move(2, Direction.RIGHT);
    }

    public Ball getBall() {
        return ball;
    }

    public Ball getBallEnemy() {
        return ballEnemy;
    }
}
