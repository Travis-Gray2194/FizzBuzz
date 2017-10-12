import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        int num;
        int num2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter number");
        num = keyboard.nextInt();
        System.out.println("Please enter number");
        num2 = keyboard.nextInt();
//        Start int at one aqnd increase by 2 till reaching 100
        for (num = 1; num <= 100; num++) {
            if (num % 3 == 0) {
                System.out.println(" Fizz ");
            }
            if (num % 5 == 0) {
                System.out.println(" Buzz ");
            }
            if (num % 15 == 0) {
                System.out.println( " FizzBuzz ");

                System.out.println("Second number multiples");

                for (num2 = 1; num2 <= 100; num2++) {
                    if (num % 3 == 0) {
                        System.out.println(num2 + " Fizz ");
                    }
                    if (num % 5 == 0) {
                        System.out.println(num2 + " Buzz ");
                    }
                    if (num % 15 == 0) {
                        System.out.println(num2 + " FizzBuzz ");
                    }
                }
            }
        }
    }
}
