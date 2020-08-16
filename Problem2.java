package Cipher_School.Java_Assignment2;
import java.util.*;
class Rectangle{
    void display(int height, int width)
    {
        System.out.println(height + " " +width);
    }
}
class RectangleArea extends Rectangle{
    int height,width;
    void getInput(int x,int y)
    {
        height= x;
        width = y;
    }
    void display()
    {
        System.out.println(height*width);
    }
}
public class Problem2 {
    public static void main(String[] args) {
    RectangleArea ra = new RectangleArea();
    Scanner sc = new Scanner(System.in);
    int height = sc.nextInt();
    int width = sc.nextInt();
    ra.getInput(height, width);
    System.out.println("Height and Width are: ");
    ra.display(height,width);
    System.out.println("Area: ");
    ra.display();
    sc.close();
    }

    
}