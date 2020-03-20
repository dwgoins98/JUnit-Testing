import java.util.Scanner;

public class Fibbonacci{
    static int number1 = 0;
    static int number2 = 1;
    static int number3;

    static void FibbonacciRecursion(int response) {

        if(response >0) {

        number3 = number1 + number2;

        System.out.print(" " + number3);

        number1 = number2;
        number2 = number3;

        FibbonacciRecursion(response -1);

        }

    }

    public static void main(String args[]) {

        System.out.println("How many numbers do you want to print from the Fibbonacci Series?");
        Scanner input = new Scanner(System.in);
        int response = input.nextInt();

        System.out.print(number1 + " " + number2);

        for(int i =  2; i < response; i++){

            number3 = number1 + number2;

            System.out.print(" " + number3);

            number1 = number2;
            number2 = number3;

        }

        System.out.println("\n\nNow with recursion");
        number1 = 0;
        number2 = 1;
        System.out.print(number1 + " " + number2);
        FibbonacciRecursion(response - 2);

        System.out.println("\n\n");

        input.close();

    }
}