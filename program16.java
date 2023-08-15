import java.util.Scanner;

public class program16 {// odd numbers
    public static void main(String[]args){
        int i,n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Enter values of n ");
            n = sc.nextInt();
        }
      for(i=1; i<=2*n ; i+=2){
        System.out.println(i);
      }
    }
    
}
