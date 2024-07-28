import java.util.*;
public class Hangman {
    public static void main(String[] args){
        String[] words ={"pani puri", " Vada pav"," Bread","Milk","Water"};
        Random random = new Random();
        String word = words[random.nextInt(words.length)];
        char[] guessedword = new char[word.length()];
        for(int i=0; i< word.length(); i++){
            guessedword[i] = '_';
        }


        int attempts = 6;
        boolean wordGuessed = false;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to the game Sir");


        while(attempts>0 && !wordGuessed){
            System.out.println("Guess : " + new String(guessedword));
            System.out.print(" Enter the Letter Sir:");
            char guessedLetter = scanner.next().charAt(0);
            boolean letterFound = false;

            for(int i =0; i<word.length(); i++){
                if(word.charAt(i) == guessedLetter){
                    guessedword[i] = guessedLetter;
                    letterFound = true;
                }
            }

            if (!letterFound){
                attempts--;
                System.out.println("Wrong guess !!  Attempts remaining" + attempts);
            }else{
                wordGuessed = true;
                for(char c : guessedword){
                    if(c == '_'){
                        wordGuessed = false;
                        break;
                    }
                }
            }
            }

            if (wordGuessed){
                System.out.println(" Wow... you guessed right it was  " + word);
            
            }else{
                System.out.println("Finish.... the word was :" + word);

            }
            scanner.close();
        }
    }

