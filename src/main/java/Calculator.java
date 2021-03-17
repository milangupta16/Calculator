import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double val1=0, val2=0;
        int opt;
        do
            {
                System.out.println("**********Calculator**********");
                System.out.println("Choose");
                System.out.println("1.Find Square Root");
                System.out.println("2.Find Factorial");
                System.out.println("3.Find Natural Logarithm");
                System.out.println("4.Find Power");
                System.out.println("Press other key to exit");
                System.out.println("Enter your choice: ");

             opt = sc.nextInt();
            if(opt == 4)
            {
                    System.out.print("Enter the first value : ");
                    val1 = sc.nextDouble();
                    System.out.print("Enter the second value : ");
                    val2 = sc.nextDouble();
            }
            if(opt>=1 && opt<=3)
            {
                    System.out.print("Enter the value : ");
                    val1 = sc.nextDouble();

            }

            switch (opt) {
                case 1:
                    System.out.println("Square root is : " + sqroot(val1));
                    break;
                case 2:
                    System.out.println("Factorial is : " + factorial(val1));
                    break;
                case 3:
                    System.out.println("Natural Log is : " + log(val1));
                    break;
                case 4:
                    System.out.println("Power is : " + power(val1, val2));
                    break;
                default:
                    System.out.println("Exiting!!!");
                    return;
            }
        } while (true);
    }

    public static double sqroot(double val1)
    {
        double result = Math.sqrt(val1);
        logger.info("Square Root of : " + val1 + "is : " + result);
        return result;
    }

    public static double factorial(double val1)
    {
        double fact = 1;
        for(double i=1;i<=val1;i++)
            fact = fact*i;

        double result = fact;
        logger.info("Factorial of : " + val1 + "is : " + result);
        return result;
    }

    public static double log(double val1)
    {
        double result = Math.log(val1);
        logger.info("Natural Log of : " + val1 + "is : " + result);
        return result;
    }

    public static double power(double val1, double val2)
    {
       double result = Math.pow(val1,val2);
        logger.info("Power of : " + val1 + "and" + val2 + "is : " + result);
        return result;
    }
}