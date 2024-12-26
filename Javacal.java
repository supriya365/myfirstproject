import java.util.*;
public class Javacal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input value of a=");
        int a=sc.nextInt();
        System.out.println("Enter Input value of b=");
        int b=sc.nextInt();
         System.out.println("a=" +a);
         System.out.println("b=" +b);
        System.out.println("Sum="+(a+b));
        System.out.println("Subtract="+(a-b));
        System.out.println("Multiply="+(a*b));
        System.out.println("Divide="+(a/b));
    }
}
