package First;

import java.util.Scanner;

public class Exercise2 {

    private static final Scanner sc = new Scanner(System.in);
    private static Integer value;
    private static String menssage , c = "-";

    public static void main(String[] args) {
        request_value();

        menssage = "The factorial of " + value + " is: ";

        System.out.println(menssage + calculate_factorial(value));
    }

    private static void request_value() {
        menssage = "Program to calculate the factorial of a number";

        System.out.println(
                c.repeat(menssage.length())
                + "\n" + menssage
                + "\n" + c.repeat(menssage.length()));

        System.out.print("Enter value: ");
        value = sc.nextInt();
        sc.close();
    }

    private static int calculate_factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculate_factorial(n - 1);
        }
    }
}
