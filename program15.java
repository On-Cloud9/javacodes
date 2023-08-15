import java.util.Scanner;
public class program15 {// multiplication tables
    public static void main(String[]args){
        int i,n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n");
            n = sc.nextInt();
        }
        for(i=1;i<=10;i++){
            System.out.println( n+ " X  " + i + " =" + (n*i));
        }
    
    }
    
}
