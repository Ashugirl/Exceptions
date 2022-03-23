package be.intecbrussel.examples;

public class RectangleApp {
    public static void main(String[] args) {
        try{
            Rectangle rectangle = new Rectangle();
            rectangle.setHeight(-5);
        }
        catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
    }
}
