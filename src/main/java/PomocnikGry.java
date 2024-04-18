import java.util.Scanner;

public class PomocnikGry {
    public int pobierzDaneWejsciowe(String komunikat) {
        System.out.println(komunikat + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
