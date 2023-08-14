// write a program to find and or not and exor.
import java.util.Scanner;
public class program10 {

    public static void main(String[]args){
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two integer");
            a=  sc.nextInt();
            b=sc.nextInt();
        }
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(~b);

    }
    
}
