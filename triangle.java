import java.util.*;
public class triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            //upper half
            for(int i=0;i<=n/2;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" * ");
                }
                System.out.println(" * ");
            }
            for(int i=n/2;i>=0;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(" * ");
                }
                System.out.println(" * ");
            } 
            
        }finally{
            sc.close();
        }
    }
}
