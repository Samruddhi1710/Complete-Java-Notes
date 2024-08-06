import java.util.*;
public class pattern {
    public static void main(String[] arg){
        Scanner sc = null;
        System.out.println("Enter the number ");
        try{ sc= new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=1;i<number;i++){
            for(int j=1; j<number;j++){
               System.out.print(" * ");
           }
           System.out.println(" * ");
        }
    } finally {
        sc.close();
    }
 }
}