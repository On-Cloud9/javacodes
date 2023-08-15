import java.util.Scanner;
public class program17 {
    public static void main(String[]args){
        int i,n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of n");
            n =  sc.nextInt();
        }
        for(i=1; i<=n; i+= 2){
            System.out.println(i);
        }
    }
    
}
