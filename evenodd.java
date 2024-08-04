import java.util.*;
public class evenodd {
    public static void main (String[] arg){
        System.out.print("Enter the number= ");
        Scanner sc=new Scanner(System.in);
        try{
            int num=sc.nextInt();
            if(num%2==0){
                System.out.println("The number "+num+" is a Even number.");
            }else{
                System.out.println("The number "+num+" is Odd number.");
            }
        }finally{
            sc.close();
        }
    }

}
