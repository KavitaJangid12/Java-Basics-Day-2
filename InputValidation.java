import java.util.Scanner;
public class InputValidation {
    public static void main(String[] args) {
//        int age = -1;
//        Scanner sc = new Scanner(System.in);
//        while(age < 0){
//            System.out.println("Enter valid age: ");
//            age = sc.nextInt();
//        }
//    }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        while(age <= 0){
            System.out.println("Enter a valid age: ");
            age = sc.nextInt();
        }
System.out.println("Congratulations!!!! Have Celebrations!!!!");
    }
}
