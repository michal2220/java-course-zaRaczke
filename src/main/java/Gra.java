import java.util.Random;

public class Gra {

    public static void main(String[] args) {

        int liczbaRuchow = 0;
        PomocnikGry pomocnik = new PomocnikGry();
        Random random = new Random();


        ProstyStartup startup = new ProstyStartup();
        int liczbaLosowa = (int) (random.nextInt(5));
        System.out.println(liczbaLosowa);
        int[] polozenia = {liczbaLosowa, liczbaLosowa + 1, liczbaLosowa + 2};

        startup.setPolaPolozenia(polozenia);
        boolean czyIstnieje = true;

        while (czyIstnieje) {
            int pole = pomocnik.pobierzDaneWejsciowe("Podaj liczbe");
            String wynik = startup.sprawdz(pole);
            liczbaRuchow++;
            if (wynik.equals("zatopienie")) {
                czyIstnieje = false;
                System.out.println(liczbaRuchow + " ruchów");
            }
        }
    }
}