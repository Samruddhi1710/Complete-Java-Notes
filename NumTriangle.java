import java.util.*;
public class NumTriangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            int num=1;
            //first half
            for(int i=0;i<=n/2;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(num + "*");
                    num++;
                }
                System.out.println();
            }
            //second half
            num--;
            for(int i=n/2;i>=0;i--){
                int m = num-i+1;
                for(int j=1;j<=i;j++){
                    System.out.print(m + "*");
                    m++;
                }
                num-=i;
                System.out.println();
            }
        }finally{
            sc.close();
        }
    }
}
