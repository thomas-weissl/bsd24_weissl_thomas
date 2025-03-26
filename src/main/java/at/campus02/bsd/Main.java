package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Subtract: " + calculator.subtract(5.2, 3));
        System.out.println("Multiply: " + calculator.multiply(5.2, 3));
        System.out.println("Divide: " + calculator.divide(5.2, 3));
        System.out.println("Add: " + calculator.add(5.2, 3));
        System.out.println("Thomas Weissl");
        Logger logger = LogManager.getLogger();
        logger.info("Info Message");
        System.out.println();
        logger.error("Error Message");
    }
}
