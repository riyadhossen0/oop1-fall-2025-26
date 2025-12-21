public class TestShape {

    public static void main(String[] args) {

        Shape s1 = new Rectangle(5, 4);
        Shape s2 = new Circle(3);

        s1.displayShape();
        System.out.println("Rectangle Area: " + s1.calculateArea());

        s2.displayShape();
        System.out.println("Circle Area: " + s2.calculateArea());
    }
}