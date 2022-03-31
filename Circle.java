/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Comparable;

/**
 *
 * @author Admin
 */
public class Circle extends GeometricObject implements Comparable<Circle>{
    private double radius;

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return this.radius*2*Math.PI; 
    }

    @Override
    public double getArea() {
        return this.getRadius()*this.getRadius()*Math.PI;
    }

    
    
    
    @Override
    public int compareTo(Circle o) {
        if(this.getArea()<o.getArea()){
            return -1;
            
        }
        if(this.getArea()>o.getArea()){
            return 1; 
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        String ketQua = "Chu vi hinh tron=" + this.getPerimeter() 
                        +", Dien tich hinh tron=" + this.getArea() +"\n";
        return ketQua;
    }
    
    
}
