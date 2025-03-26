package at.campus02.bsd;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Subtract: " + calculator.subtract(5.2, 3));
        System.out.println("Multiply: " + calculator.multiply(5.2, 3));
        System.out.println("Divide: " + calculator.divide(5.2, 3));
        System.out.println("Add: " + calculator.add(5.2, 3));
        System.out.println("Thomas Weissl");
    }
}
