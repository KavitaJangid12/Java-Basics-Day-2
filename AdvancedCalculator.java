import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter first number: ");
                int num1 = sc.nextInt();

                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();
                //Using switch case
//
//                System.out.print("Enter operator (+, -, *, /, %): ");
//                char op = sc.next().charAt(0);
//
//                int result;

//                switch(op) {
//
//                    case '+':
//                        result = num1 + num2;
//                        System.out.println("Result = " + result);
//                        break;
//
//                    case '-':
//                        result = num1 - num2;
//                        System.out.println("Result = " + result);
//                        break;
//
//                    case '*':
//                        result = num1 * num2;
//                        System.out.println("Result = " + result);
//                        break;
//
//                    case '/':
//                        if(num2 == 0) {
//                            System.out.println("Error: Division by zero not allowed!");
//                        } else {
//                            result = num1 / num2;
//                            System.out.println("Result = " + result);
//                        }
//                        break;
//
//                    case '%':
//                        if(num2 == 0) {
//                            System.out.println("Error: Modulo by zero not allowed!");
//                        } else {
//                            result = num1 % num2;
//                            System.out.println("Result = " + result);
//                        }
//                        break;
//
//                    default:
//                        System.out.println("Invalid operator! Please enter +, -, *, /, or %.");
//                }
        //Using conditional statements
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        if (operator == '+') {
            System.out.println("Result = " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result = " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result = " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed");
            } else {
                System.out.println("Result = " + (num1 / num2));
            }
        } else {
            System.out.println("Error: Invalid operator");
        }
            }
        }


