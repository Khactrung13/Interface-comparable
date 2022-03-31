/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Comparable;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SuDungHinhHoc {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Hinh tron");
        Circle[] circle = new Circle[10];
        for (int i = 0; i < 10; i++) {
            circle[i]= new Circle();
            circle[i].setRadius(Math.random()*(25-5)+5);
        }
        System.out.println("Cac phan tu cua mang la:");
        System.out.println(Arrays.toString(circle));
        System.out.println("Mang sau khi sap xep:");
        Arrays.sort(circle);
        System.out.println(Arrays.toString(circle));
        
        
        System.out.println("Hinh chu nhat");
        Rectangle[] rectangle = new Rectangle[10];
        for (int i = 0; i < 10; i++) {
            rectangle[i] =new Rectangle();
            rectangle[i].setHeight(Math.random()*(35-20)+20);
            rectangle[i].setWidth(Math.random()*(15-1)+1);
        }
        System.out.println("Cac phan tu cua mang la:");
        System.out.println(Arrays.toString(rectangle));
        System.out.println("Mang sau khi sap xep");
        Arrays.sort(rectangle);
         System.out.println(Arrays.toString(rectangle));

    }
}
