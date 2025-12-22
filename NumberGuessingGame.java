import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 12;
        int guess = 0;
        while(guess!= secret){
            System.out.println("Guess the number: ");
            guess = sc.nextInt();
        }
        System.out.println("Correct guess!!");
    }
}
