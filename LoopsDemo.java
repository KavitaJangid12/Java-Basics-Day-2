import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
//        for (int i=1;i<=5;i++){
//            System.out.println(i);
//        }
// System.out.println(i);//Out of the loop

//A. Code for 1 to 100:
       /* for(int i=1; i<=100;i=i+1){
            System.out.println(i);
        } */

//B
//Way-1
//        for(int i =2; i<=100;i=i+2){
//            System.out.println(i);
//        }
//Way-2
//        for(int i =1;i<=100;i=i+1){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }

//C. Summation Sum(1 to 10)
//int sum = 0;
//for(int i = 1; i<=10;i=i+1){
//    sum = sum+i;
//}
//System.out.println(sum);

//D. Multiplication Tables: 5 Table:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//        for(int i = 1;i<=10;i=i+1){
//            System.out.println(num + " x " + i +" = " + num*i);
//        }

//Nested for loop:
//        for(int i=1;i<=10;i++){
//            System.out.println(" ");
//            System.out.println("Table of "+ i);
//            for(int j=1;j<=10;j++){
//                System.out.println(i + " x " + j+" = "+ i*j );
//            }
//        }

        //WHILE LOOP:
//        int i = 1;
//        while(i<=5){
//            System.out.println(i);
//            i++;
//        }

        //DO WHILE LOOP:
        int i =1;
        do{
            System.out.println(i);
            i=i+1;
        }while(i<=5);
    }
}
