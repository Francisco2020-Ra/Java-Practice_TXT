package First;

import java.util.Scanner;

public class Exercise1 {

    private final static Scanner sc = new Scanner(System.in);
    private static Integer firstNumber;
    private static Integer secondNumber;
    private static String message;

    public static void main(String[] args) {
        request_numbers_for_addition();

        message = "The sum of the two numbers is: ";

        System.out.println(message + add_two_numbers(firstNumber, secondNumber));
    }

    private static void request_numbers_for_addition() {
        System.out.println("\nProgram that adds two given numbers");
        System.out.print("Enter first number: ");
        firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = sc.nextInt();
        sc.close();
    }

    private static Integer add_two_numbers(Integer firstNumber, Integer secondNumber) {
        return firstNumber + secondNumber;
    }

}
