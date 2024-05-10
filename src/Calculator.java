import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.input();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("number1: ");
        double number1 = sc.nextDouble();
        System.out.print("mark: ");
        char mark = sc.next().charAt(0);
        System.out.print("number2: ");
        double number2 = sc.nextDouble();
        sc.close();
        switch (mark) {
            case '+':
                System.out.println(number1 + " + " + number2 + " = " + sum(number1, number2));
                break;
            case '-':
                System.out.println(number1 + " - " + number2 + " = " + sub(number1, number2));
                break;
            case '*':
                System.out.println(number1 + " * " + number2 + " = " + mul(number1, number2));
                break;
            case '/':
                System.out.println(number1 + " / " + number2 + " = " + div(number1, number2));
                break;
        }
    }

    double sum(double number1, double number2) {
        return number1 + number2;
    }

    double sub(double number1, double number2) {
        return number1 - number2;
    }

    double mul(double number1, double number2) {
        return number1 * number2;
    }

    double div(double number1, double number2) {
        return number1 / number2;
    }
}
