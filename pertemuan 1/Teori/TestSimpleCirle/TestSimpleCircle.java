/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
  * @author Bayu
 */
public class TestSimpleCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Main methof */
        
        //Create a Sircle With radius 1
        SimpleCircle circle1 = new SimpleCircle(1);
        System.out.println("The area of the circle of radius "
        + circle1.radius + " is " + circle1.getArea());
        
        //Create a Sircle With radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        circle2.radius = 25;
        System.out.println("The area of the circle of radius "
        + circle2.radius + " is " + circle2.getArea());
        
        //Create a Sircle With radius 125
        SimpleCircle circle3 = new SimpleCircle(125);
        circle3.radius = 125;
        System.out.println("The area of the circle of radius "
        + circle3.radius + " is " + circle3.getArea());
        
        //Modify cricle radius 
        circle2.radius = 100; 
        System.out.println("The area of circle of radius " 
        + circle2.radius + " is " + circle2.getArea());
        
    }
    
}
    class SimpleCircle {
        double radius = 1;
        SimpleCircle(double radius){ 
        }
        
        double getArea(){
        return radius * radius * Math.PI;
        }

        double getPerimeter(){
            return 2 * radius * radius * Math.PI;
        }

        double setRadius(double Radius){
            return 0;
        }
    }
