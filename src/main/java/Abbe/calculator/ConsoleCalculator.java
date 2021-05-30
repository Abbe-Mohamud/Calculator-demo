package Abbe.calculator;
import java.util.Scanner;

/**
 * A simple Calculator!
 *
 */

public class ConsoleCalculator
{
    public static void main( String[] args ) {

        while (true) {

            Scanner in = new Scanner(System.in);


            System.out.println("Press enter to start calculating");
            System.out.println("Press q to quit the application\n");
            System.out.print("Choose action: ");
            String pressed = in.nextLine();

            if (pressed.equals("q")) {
                  System.out.println("Done, Have a nice day!");
                break;
              }

            System.out.print("Enter first number: ");
            int number1 = in.nextInt();

            System.out.print("Enter second number: ");
            int number2 = in.nextInt();

            System.out.print("Enter operator[+,-,*,/]: ");
            char operator = in.next().charAt(0);

            int Result = 0;

            switch (operator) {
                case '+':
                    Result = number1 + number2;
                    break;
                case '-':
                    Result = number1 - number2;
                    break;
                case '*':
                    Result = number1 * number2;
                    break;
                case '/':
                    Result = number1 / number2;
                    break;
                default:
                    System.out.println(operator + " is not supported");

                }


            System.out.println("The Result is:" + Result + "\n");

        }

    }
}
