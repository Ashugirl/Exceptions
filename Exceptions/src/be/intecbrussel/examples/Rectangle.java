package be.intecbrussel.examples;

import java.util.Objects;

public class Rectangle extends Shape{

//member variables
    //declare in declaration
    //public final static int ANGLES = 4;

    // initialize in static codeblock
    public final static int ANGLES;

    private static int count;

    static{
        //System.out.println("This static block is executed.");
        ANGLES = 4;
    }
    // this will be executed every time we make an object.
    {
        //System.out.println("We are creating an object.");
        count++;
    }
    private int height;
    private int width;



    //constructors
    //default constructor
    public Rectangle() throws Exception{
        this(0,0, 0, 0);
    }

    public Rectangle(int width, int height)throws Exception{
        this(width, height, 0,0);
    }

    public Rectangle(int width, int height, int x, int y) throws Exception{
        setWidth(width);
        setHeight(height);
        setPosition(x, y);
    }

    //copy constructor
    public Rectangle(Rectangle r) throws Exception{
        this(r.getWidth(), r.getHeight(), r.getX(), r.getY());

    }
    //setters and getters


    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) throws Exception {
        // add exception in case of negative number
        if(height < 0) throw new Exception("Negative height");
        else this.height = height;

    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) throws Exception {
        //exception in case of negative number
        if(width < 0) throw new Exception("Negative width");
        else this.width = width;
    }

    public double getArea(){
        return (double)this.height*this.width;

    }

    public double getPerimeter(){
        return (this.height + this.width) *2;
    }


    // own methods added
    public void grow(int d){
        this.width = Math.abs(width * d);
        this.height = Math.abs(height * d);

    }

    public static int getCount(){
        return count;
    }

    /*public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }*/


    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.height && width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width);
    }
}


