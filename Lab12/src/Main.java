import task1.MyUtilityClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        MyUtilityClass.printCollection(integers); // output: [1, 2, 3, 4, 5]

        Collection<String> strings = List.of("ana", "are", "mere");
        MyUtilityClass.printCollection(strings); // output: ["ana", "are", "mere"]

        List<Boolean> booleans = List.of(true, false, true, false, true);
        {
            boolean result = MyUtilityClass.aggregate(booleans, true, (acc, v) -> acc & v);
            System.out.println(result); // output: false
        }
        {
            int result = MyUtilityClass.aggregate(booleans, 0, (acc, v) -> v ? acc + 1 : acc);
            System.out.println(result); // output: 3
        }

 record Person(String name) {}

        List<Person> persons = new ArrayList<>( List.of(
                new Person("Aurel"),
                new Person("Vali")
        ));

        MyUtilityClass.duplicateCollection(persons);
        MyUtilityClass.printCollection(persons); // output (aproximativ): [Person - "Aurel", Person - "Aurel", Person - "Vali", Person - "Vali"]
    }
}