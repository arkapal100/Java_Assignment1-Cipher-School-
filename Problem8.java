import java.util.*;
class Example{
    public static void myFunc(int a){
        System.out.println(String.format("%.2f",(float)a*2/3));
    }
}
public class Problem8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            Example.myFunc(a);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input!! Please enter INTEGER ONLY");
        }
    }
}
