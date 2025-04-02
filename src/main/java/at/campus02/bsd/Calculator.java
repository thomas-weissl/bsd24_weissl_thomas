package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static Logger logger;

    public Calculator() {
        logger = LogManager.getLogger();
    }

    public double add(double number1, double number2) {
        logger.debug(number1 + " + " + number2);
        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        logger.debug(number1 + " - " + number2);
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        logger.debug(number1 + " * " + number2);
        return number1 * number2;
    }

    public double divide(double number1, double number2) {
        if(number2 != 0) {
            logger.debug(number1 + " / " + number2);
            return number1 / number2;
        }else{
            logger.error("No Division by zero");
        }
        return 0;
    }

    public int factorial(int number) {
        //comment for branch faculty
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        if(number<0){
            result = 0;
        }else if(number == 0){
            result = 0;
        }
        return result;
    }
}
