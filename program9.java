// write aprogram to to shift number  three bits left and display the result
import java.util.Scanner;
public class program9{
    public static void main(String[]args){
        int a, res;
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the integer ");
            a =sc.nextInt();
        }
        res = a<<3;
        System.out.println("After shifting  : "+ res);
    }
}
