package Second;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeNumber {
    private static final Scanner sc = new Scanner(System.in);
    private static String message = "Program that requests three numbers and prints it on the screen", c="-";
    private static List<Integer> value = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(c.repeat(message.length())+'\n'+message+'\n'+c.repeat(message.length()));
        request_value();
        print_value();
    }

    private static void request_value(){
        for (int i = 0; i<3; i++) {
            System.out.print(String.format("Enter value # %d: ", i+1));
            value.add(sc.nextInt());
        }
        sc.close();
    }

    private static void print_value(){
        System.out.println("The first number enter is: " + value.get(0));
        System.out.println("The second number enter is: " + value.get(1));
        System.out.println("The third number enter is: " + value.get(2));
    }
}
