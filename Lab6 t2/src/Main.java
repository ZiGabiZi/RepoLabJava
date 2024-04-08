import task2.Clienti;
import task2.Topic;
//Pentru realizarea problemei am folosit design patternul Observer


public class Main {
    public static void main(String[] args) {
        // Crearea utilizatorilor
        Clienti adrian = new Clienti("Adrian");
        Clienti ion = new Clienti("Ion");
        Clienti maria = new Clienti("Maria");
        Clienti matei = new Clienti("Matei");

        // Crearea topicurilor
        Topic gatit = new Topic("gătit");
        Topic programare = new Topic("programare");

        // Abonarea utilizatorilor la topicuri
        gatit.addObserver(adrian);
        gatit.addObserver(maria);
        programare.addObserver(adrian);
        programare.addObserver(ion);
        programare.addObserver(maria);
        programare.addObserver(matei);

        // Simularea trimiterii de mesaje
        programare.sendMessage("Ion", "Salutare!");
        gatit.sendMessage("Adrian", "Omlette du fromage!");
    }
}