public class MovableRectangle extends Rectangle implements Movable {
    MovablePoint LeftDownAngle = new MovablePoint(0, 0, 1, 1);
    MovablePoint RightUpperAngle = new MovablePoint((int) width, (int) length, 1, 1);

    public MovableRectangle(int length, int width) {
        super(length, width);
    }

    public void moveUp() {
        LeftDownAngle.moveUp();
        RightUpperAngle.moveUp();
    }

    public void moveDown() {
        LeftDownAngle.moveDown();
        RightUpperAngle.moveDown();
    }

    public void moveLeft() {
        LeftDownAngle.moveLeft();
        RightUpperAngle.moveLeft();
    }

    public void moveRight() {
        LeftDownAngle.moveRight();
        RightUpperAngle.moveRight();
    }

    public String toString() {
        return "x1 = " + LeftDownAngle.x + " y1 = " + LeftDownAngle.y +
                "\nx2 = " + RightUpperAngle.x + " y2 = " + RightUpperAngle.y;
    }

}
