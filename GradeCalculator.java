import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int m = sc.nextInt();
        if(m>=85){
            System.out.println("Grade A");
        }
        else if(m>=75){
            System.out.println("Grade B");
        }
        else if(m>=65){
            System.out.println("Grade C");
        }
        else if(m>=55){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
