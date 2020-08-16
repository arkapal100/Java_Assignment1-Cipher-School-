import java.util.*;
interface FuncInter{
   int abstrFunc(int a,int b);
}

public class Lambda1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        FuncInter add = (int x,int y) ->(x+y);
        System.out.println("Addition: "+add.abstrFunc(a, b));

        FuncInter difference = (int x,int y) ->(x-y);
        System.out.println("Difference: "+difference.abstrFunc(a, b));

        FuncInter product = (int x,int y) ->(x*y);
        System.out.println("Product: "+product.abstrFunc(a, b));

        FuncInter safedevide = (int x,int y) ->(x+y);
        System.out.println("Division: "+safedevide.abstrFunc(a, b));

        sc.close();
    }
}
