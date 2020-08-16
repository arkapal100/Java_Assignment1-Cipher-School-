import java.util.Scanner;

// package Cipher_School.Java_Assignment2;

class Complex{
    double real,img;
    Complex(double real,double img)
    {
        this.real = real;
        this.img = img;
    }
    public static Complex sum(Complex a,Complex b)
    {
        Complex temp = new Complex(0,0);
        temp.real = a.real + b.real;
        temp.img = a.img + b.img;
        return temp;
    }
    public static Complex product(Complex a,Complex b)
    {
        Complex temp = new Complex(0,0);
        temp.real = (a.real*b.real) - (a.img*b.img);
        temp.img = a.img*b.real + a.real*b.img;
        return temp;
    }
    public static Complex diff(Complex a,Complex b)
    {
        Complex temp = new Complex(0,0);
        temp.real = a.real - b.real;
        temp.img = a.img - b.img;
        return temp;
    }   
    
}

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Complex no 1: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Complex c1 = new Complex(a,b);

        System.out.println("Complex no 2: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Complex c2 = new Complex(x,y);

        System.out.println("1st Number: "+ a+"+"+"i"+b);
        System.out.println("1st Number: "+ x+"+"+"i"+y);

        Complex sum = Complex.sum(c1, c2);
        Complex diff = Complex.diff(c1, c2);
        Complex product = Complex.product(c1, c2);

        System.out.println("Sum of two numbers is: " + sum.real +"+"+"("+sum.img+")"+"i");
        System.out.println("Difference of two numbers is: " + diff.real +"+"+"("+diff.img+")"+"i");
        System.out.println("Product of two numbers is:" + product.real +"+"+"("+product.img+")"+"i");

        sc.close();
    }
    
}