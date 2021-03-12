import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        double val1, val2=0;
        int opt;
        do {
            System.out.println("**********Calculator**********");
            System.out.println("Choose");
            System.out.println("Press 1 to find Square Root");
            System.out.println("Press 2 to find Factorial");
            System.out.println("Press 3 for Natural Logarithm");
            System.out.println("Press 4 for Power");
            System.out.println("Press any other key to exit");
            System.out.println("Enter your choice: ");

            try {
                opt = sc.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            try {
                if(opt == 4) {
                    System.out.print("Enter the first value : ");
                    val1 = sc.nextDouble();
                    System.out.print("Enter the second value : ");
                    val2 = sc.nextDouble();
                }

                else{
                    System.out.print("Enter the value : ");
                    val1 = sc.nextDouble();

                }
            } catch (InputMismatchException error) {
                logger.error("Invalid input!!, Please enter valid number");
                return;
            }
            switch (opt) {
                case 1:
                    // for square root
                    System.out.println("Square root is : " + calculator.sqroot(val1));
                    break;
                case 2:
                    // for factorial
                    System.out.println("Factorial is : " + calculator.factorial(val1));
                    break;
                case 3:
                    // for natural log
                    System.out.println("Natural Log is : " + calculator.log(val1));
                    break;
                case 4:
                    // for power
                    System.out.println("Power is : " + calculator.power(val1, val2));
                    break;
                default:
                    System.out.println("Exiting!!!");
                    return;
            }
        } while (true);
    }


    public double sqroot(double val1) {
        logger.info("[SQUARE ROOT] - " + val1);
        double result = Math.sqrt(val1);
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }

    public double factorial(double val1) {
        logger.info("[FACTORIAL] - " + val1);

        double fact=1;
        for(double i=1;i<=val1;i++){
            fact=fact*i;
        }
        double result = fact;
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }


    public double log(double val1) {
        logger.info("[LOGARITHM] - " + val1);
        double result = Math.log(val1);
        logger.info("[RESULT - LOGARITHM] - " + result);
        return result;
    }

    public double power(double val1, double val2) {

            logger.info("[POWER] - " + val1 + ", " + val2);
            double result = Math.pow(val1,val2);

            logger.info("[RESULT - POWER] - " + result);

        return result;
    }
}