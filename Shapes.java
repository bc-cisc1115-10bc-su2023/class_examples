/* Example of using inheritance */
import java.util.Date;
import java.lang.Math;

public class Shapes {
  public static void main(String[] args){
    Circle c = new Circle();
    c.setColor("red");  // set color of circle. It uses the superclass property of color
    System.out.println(c.toString());

    Rectangle r = new Rectangle(3, 4, "Blue", false);
    r.setFilled(true);
    System.out.println(r.toString());
    System.out.println(r.getColor());
    System.out.println(r.getArea());
  }

}

class GeometricObject {
  private String color;
  private boolean filled;
  private Date dateCreated;

  public GeometricObject(){
    this.color = "";
    this.filled = false;
  }

  public GeometricObject(String color, boolean filled){
    this.color = color;
    this.filled = filled;
  }

  // getColor() method
  public String getColor() {
    return this.color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public boolean isFilled(){
    return this.filled;
  }

  public void setFilled(boolean filled){
    this.filled = filled;
  }

  public Date getDateCreated(){
    return this.dateCreated;
  }

  public String toString(){
    return "This shape has " + this.color + " color"; 
  }
} // end GeometricObject class

class Circle extends GeometricObject {
  private double radius; 

  public Circle(){
    super();
  }

  public Circle(double radius){
    super();
    this.radius = radius;
  }
 
  public Circle(double radius, String color, boolean filled){
    super(color, filled);
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public double getArea(){
    return this.radius * this.radius * Math.PI;
  }

  public double getPerimeter(){
    return getDiameter() * Math.PI;
  }

  public double getDiameter(){
    return this.radius * 2;
  }

  public void printCircle(){
    System.out.println("Circle stuff.... ");
  }
} // end Circle class

class Rectangle extends GeometricObject {
  private double width;
  private double height;

  Rectangle() {
    this.width = 0.0;
    this.height = 0.0;
  }

  Rectangle(double width, double height){
    this.width = width;
    this.height = height;
  }

  Rectangle(double width, double height, String color, boolean filled){
    super(color, filled);
    this.width = width;
    this.height = height;
  }

  public double getWidth(){
    return this.width;
  }
 
  public void setWidth(double width){
    this.width = width;
  }

  public double getHeight(){
    return this.height;
  }

  public void setHeight(double height){
    this.height = height;
  } 

  public double getArea(){
    return this.width * this.height;
  }
  
  public double getPerimeter(){
    return (this.width + this.height) * 2;
  }

  public String toString(){
    return "This is a rectangle with its own toString method";
  }
} // end Rectangle class
