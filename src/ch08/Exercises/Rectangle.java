package ch08.Exercises;

import java.util.Scanner;

/*(Rectangle Class) Create a class Rectangle with attributes length and width, each of which
defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
methods for both length and width. The set methods should verify that length and width are each
floating-point numbers larger than 0.0 and less than 20.0.Write a program to test class Rectangle.*/
public class Rectangle
{
    private static double length; // class variable length
    private static double width; // class variable width

    // calculate perimeter of rectangle
    public double perimeter(double len, double breath)
    {
        double perimeter = 2 *(len + breath);
        return perimeter;
    }

    // calculate area of rectangle
    public double area(double len, double b)
    {
        double area = len * b;
        return area;
    }

    public double getWidth(){return width;}

    public double getLength(){return length;}

    public void setLength(double l)
    {
        // if length is > 0 and less than 20
        if(l >= 0 && l < 20)
            length = l;
    }

    public void setWidth(double w)
    {
        // if width is > 0 and less than 20
        if(w >= 0 && w < 20)
            width = w;

    }
    public static void main (String[]args)
    {
        Rectangle r = new Rectangle();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();

        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();

        System.out.println("The Rectangle's perimeter is : " + r.perimeter(r.getWidth(),r.getLength()));
        System.out.println("The Rectangle's area is : "+r.area(r.getWidth(),r.getLength()));
    }
}
