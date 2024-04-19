package workingwithobjects.creatingandusingobjects;

public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5.0);
        System.out.println("Rectangle length set to 5.0? " + (rectangle.getLength() == 5.0));
        rectangle.setWidth(4.0);
        System.out.println("Rectangle length set to 4.0? " + (rectangle.getLength() == 5.0));
        System.out.println("Rectangle perimeter = 18.0? " + (rectangle.calculatePerimiter() == 18.0));
        System.out.println("Rectangle area = 20.0? " + (rectangle.calculateArea() == 20.0));
    }
}
