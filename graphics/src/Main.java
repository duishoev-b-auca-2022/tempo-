import java.awt.*;
class Shape {
    private int x, y;
    private Color color;
    public Shape (int x, int y){
        this.x = x;
        this.y = y;
        color = Color.BLUE;
    }
    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public void draw(){
        System.out.printf("%s%n", this); //TODO replace with real drawing code
    }
}
class  Circle {
    private int x, y;
    private int radius;
    private Color color;

    public Circle (int x, int y, int radius){
        super(); // copying from parent/super constructor
        if (radius <= 0){
            throw new IllegalArgumentException("Radius should be positive number");
        }
        // We don't want radius equal or less than zero, so we use
        // this kind of exception, but why exactly this?
        // how do we choose exception to throw in such cases?

        this.radius = radius;

        color = Color.BLUE;
    }


    public int getRadius (){
        return radius;
    }




    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean contains(int x, int y){
        int dx = this.x - x;
        int dy = this.y - y;
        double dist = Math.sqrt(dx * dx + dy * dy);
        return dist < radius;
    }

    public String toString(){
        return String.format("Circle{x=%d,y=%d,radius=%d}", x, y, radius);
    }
}
class Rectange {
    private int x, y;
    private int width, height;
    private Color color;

    public void Rectangle (int x, int y, int width, int height){
        super(x,y)
        if (width <= 0){
            throw new IllegalArgumentException("Width should be positive number");
        }
        if (height <= 0){
            throw new IllegalArgumentException("Height should be positive number");
        }
    }

    public Color getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }



    public void setColor(Color color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean contains(int x, int y){
        return x >= this.x && x < this.x + width &&
        y >= this.y && y < this.y + height;
    }
    public void draw(){
        System.out.printf("%s%n", this); //TODO replace with real drawing code
    }
    public String toString(){
        return String.format("Circle{x=%d,y=%d,width=%d,height=%d}", x, y, width, height);
    }

}
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}