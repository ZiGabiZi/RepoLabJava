import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.FileWriter;
import java.util.function.Function;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        //task 1
//        try {
//            FileInputStream fis = new FileInputStream("C:\\Users\\User\\Documents\\JAVA\\Lab 7\\src\\file.txt");
//
//            fis.skip(LungPrimaLinie("C:\\Users\\User\\Documents\\JAVA\\Lab 7\\src\\file.txt"));
//
//            int data;
//            while ((data = fis.read()) != -1) {
//                System.out.print((char) data);
//            }
//
//            fis.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //task 2
//        try (FileReader fileReader = new FileReader("C:\\Users\\User\\Documents\\JAVA\\Lab 7\\src\\file.txt");
//             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
//
//            bufferedReader.readLine();
//
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //task 3

//        for (int i = 1; i <= 10; i++) {
//            String fileName = "fisier_" + i + ".txt";
//            writeToFile(fileName, i);
//        }

        //task 4

//        int N = 10;
//
//        IntStream.rangeClosed(1, N)
//                .filter(num -> num % 2 == 0)
//                .mapToObj(num -> new Pair(num, num * num))
//                .forEach(System.out::println);

        //task 5

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți numărul total de numere: ");
        int totalNumbers = scanner.nextInt();

        List<Double> numbers = new ArrayList<>();

        for (int i = 0; i < totalNumbers; i++) {
            System.out.print("Introduceți numărul " + (i + 1) + ": ");
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                numbers.add(number);
            } else {
                System.out.println("Intrare invalidă! Se ignoră...");
                scanner.next();
            }
        }


        List<Function<Double, Double>> operations = new ArrayList<>();
        operations.add(x -> x * (new Random().nextInt(5) + 1));
        operations.add(x -> x + 1);
        operations.add(x -> 1 / x);
        operations.add(x -> x * x);
        operations.add(Math::sin);

        numbers.forEach(number -> {
            Function<Double, Double> operation = operations.get(new Random().nextInt(operations.size()));
            double result = operation.apply(number);
            System.out.println("Număr: " + number + ", Operație: " + operation + ", Rezultat: " + result);
        });

        scanner.close();
    }
    }




    static class Pair {
        int numar;
        int patrat;

        public Pair(int numar, int square) {
            this.numar = numar;
            this.patrat = square;
        }

        @Override
        public String toString() {
            return "numar: " + numar + ", Square: " + patrat;
        }
    }

    private static long LungPrimaLinie(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        int length = 0;
        int data;
        while ((data = fis.read()) != -1) {
            length++;
            if (data == '\n') {
                break;
            }
        }
        fis.close();
        return length;
    }

    private static void writeToFile(String fileName, int index) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            LocalDateTime currentTime = LocalDateTime.now();
            String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            fileWriter.write("Index: " + index + "\n");
            fileWriter.write("Ora: " + formattedTime);
            System.out.println("Fișierul \"" + fileName + "\" a fost creat cu succes.");
        } catch (IOException e) {
            System.out.println("Eroare la crearea fișierului \"" + fileName + "\": " + e.getMessage());
        }
    }


public void main() {
}

