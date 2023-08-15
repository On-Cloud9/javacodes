import java.util.*;
public class program14 {
    public static void main(String[]args){
        int i,n, fact=1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter integers");
            n= sc.nextInt();
        }
        for(i=1;i<=n;i++){
            fact =fact*i;
        
        }
         System.out.println("Factorial is " + fact );
    }

    
}
