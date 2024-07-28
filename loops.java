import java.util.*;
public class loops{
    public static void main(String[] args) {
        int number;
        int sum = 0;
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Enter a positive integer");
            number=sc.nextInt();

            for(int i=1;i<=number;i++){
                sum+=i;
            }

            System.out.println("The sum of all natural numbers upto  " + number + " is " + sum);
        }// scanner object will automatically closed here 
    }
}


  