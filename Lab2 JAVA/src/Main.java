import task1.Dreptunghi;
import task1.Paralelogram;
import task1.Patrat;
import task1.Romb;

import task2.CalculatorRequest;
import task2.CalculatorResult;
import task2.SmarterCalculator;

import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Paralelogram p = new Paralelogram(1,2,3,4,45,45,45,45);
        System.out.println(p.aria());

        Romb r = new Romb(5,10,12,30,150);
        System.out.println(r.aria());

        Dreptunghi d = new Dreptunghi(10,13);
        System.out.println(d.aria());

        Patrat p1 = new Patrat(10);
        System.out.println(p1.aria());



        List<CalculatorResult> calculationResults =  SmarterCalculator.calculate(args);

        for (CalculatorResult result : calculationResults) {
            CalculatorRequest request = result.getRequest();
            System.out.println("Operation " + request + " has result " + result.getResult());
        }







    }
}