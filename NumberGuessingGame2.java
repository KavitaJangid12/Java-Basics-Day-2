import java.util.Scanner;
public class NumberGuessingGame2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Guess the number: ");
//        int guess_no = sc.nextInt();
//        int secret_no = 12;
//        while( guess_no != secret_no){
//            System.out.println("Correct Guessssssssssssssss");
//        }
//        System.out.println("Guess the number again: ");
        //This is working but it's wrong


        Scanner sc = new Scanner (System.in);
        System.out.println("Guess the number: ");
        int guess_no = sc.nextInt();
        int secret_no = 17;
        while( guess_no != secret_no){
            System.out.println("Guess the number again: ");
            guess_no = sc.nextInt();

        }
        System.out.println("Correct Guessssssssssssssss!!!!");

    }
}
