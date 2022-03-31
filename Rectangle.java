/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Comparable;

/**
 *
 * @author Admin
 */
public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (this.height+this.width)*2;
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }
    
    
    @Override
    public int compareTo(Rectangle o) {
        if(this.getPerimeter()<o.getPerimeter()){
            return -1;
        }
        if(this.getPerimeter()<o.getPerimeter()){
            return 1;
        
        }
        else {
            return 0;
        }
    }
    @Override
    public String toString() {
        String ketQua = "Chu vi hinh chu nhat=" + this.getPerimeter() 
                        +", Dien tich hinh chu nhat=" + this.getArea()+"\n";
        return ketQua;
    }
    
}
