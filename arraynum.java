import java.util.*;
public class arraynum {
    public static void main (String[] arg){
        Scanner sc= new Scanner(System.in);
        try{
            int[] array = new int[10];
            for(int i=0;i< array.length;i++){
                System.out.println(array[i]);
            }

        }finally{
            sc.close();
        }


    }
}
