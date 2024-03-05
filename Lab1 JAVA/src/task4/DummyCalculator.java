package task4;

import java.util.Scanner;

public class DummyCalculator {
    public static void main(String[] args) {
        DummyCalculator calculator = new DummyCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti expresia (sau 'quit' pentru a iesi):");
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("quit")) {
            String[] expression = input.split("\\s+");
            calculator.calculate(expression);

            System.out.println("Introduceti expresia (sau 'quit' pentru a iesi):");
            input = scanner.nextLine();
        }

        System.out.println("Programul a fost oprit.");
    }

    public void calculate(String[] args) {
        if (args.length % 2 == 0) {
            System.out.println("Numar invalid de argumente");
            return;
        }

        double rezultat = Double.parseDouble(args[0]);

        for (int i = 1; i < args.length; i += 2) {
            String operator = args[i];
            double Operator = Double.parseDouble(args[i + 1]);

            switch (operator) {
                case "+":
                    rezultat += Operator;
                    break;
                case "-":
                    rezultat -= Operator;
                    break;
                case "*":
                    rezultat *= Operator;
                    break;
                case "/":
                    rezultat /= Operator;
                    break;
                case "&":
                    rezultat = (rezultat != 0) && (Operator != 0) ? 1 : 0;
                    break;
                case "|":
                    rezultat = (rezultat != 0) || (Operator != 0) ? 1 : 0;
                    break;
                default:
                    System.out.println("Operator invalid: " + operator);
                    return;
            }
        }

        System.out.println("Rezultat: " + rezultat);
    }
}
