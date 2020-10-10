public class MovableRectangleTest {
    public static void run() {
        MovableRectangle rectangle = new MovableRectangle(5, 10);
        System.out.println("initial coordinates\n" + rectangle.toString());

        rectangle.moveUp();
        System.out.println("move up:\n" + rectangle.toString());
        rectangle.moveDown();
        System.out.println("move down:\n" + rectangle.toString());
        rectangle.moveLeft();
        System.out.println("move left:\n" + rectangle.toString());
        rectangle.moveRight();
        System.out.println("move right:\n" + rectangle.toString());
    }
}
