import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double operand1;
        double operand2;
        double sum;
        double difference;
        double division;
        double multiplication;
        double remainder;

        System.out.println("Pick two numbers");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String input1 = scanner1.nextLine();
        String input2 = scanner2.nextLine();
        operand1 = Double.parseDouble(input1);
        operand2 = Double.parseDouble(input2);

        sum = operand1 + operand2;
        difference = operand1 - operand2;
        division = operand1 / operand2;
        multiplication= operand1 * operand2;
        remainder = operand1 % operand2;

        showResults(sum, difference, division, multiplication, remainder);

    }
    public static void showResults(double sum, double difference, double division, double multiplication, double remainder){
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The sum is " + division);
        System.out.println("The value is " + multiplication);
        System.out.println("The remainder is " + remainder);

    }

}
