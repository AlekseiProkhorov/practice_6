public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    int speedRatio = 1;

    public MovablePoint() {
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y += ySpeed * speedRatio;
    }

    public void moveDown() {
        y -= ySpeed * speedRatio;
    }

    public void moveLeft() {
        x -= xSpeed * speedRatio;
    }

    public void moveRight() {
        x += xSpeed * speedRatio;
    }

    public String toString() {
        return "x = " + x + "\ny = " + y;
    }

}
