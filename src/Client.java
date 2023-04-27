public class Client {
    public static void main(String[] args) {
        //get an object of Circle and call its draw method.
        Shape shape1 = ShapeFactory.getShape("Circle");
        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = ShapeFactory.getShape("Rectangle");
        //call draw method of Rectangle
        shape2.draw();


        //get an object of Square and call its draw method.
        Shape shape3 = ShapeFactory.getShape("Square");
        //call draw method of Square
        shape3.draw();
    }
}
