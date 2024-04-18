import java.util.ArrayList;

public class StartupGraMax {

    private PomocnikGry pomocnik = new PomocnikGry();
    private ArrayList<Startup> startupy = new ArrayList<>();
    private int liczbaRuchow;

    private void przygotujGre() {
        Startup pierwszy = new Startup("poniez");
        Startup drugi = new Startup("hacqi");
        Startup trzeci = new Startup("cabista");

        startupy.add(pierwszy);
        startupy.add(drugi);
        startupy.add(trzeci);

        System.out.println("Twoim celem jest zatopienie trzech startupów.");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Postaraj się je zatopić, wykonując jak najmniej ruchów.");

        for (Startup startup : startupy) {
            ArrayList<String> nowePolozenie = pomocnik.rozmiescStartup(3);
            startup.setPolaPolozenia(nowePolozenie);
        }
    }

    private void rozpocznijGre() {
        while (!startupy.isEmpty()) {
            String ruchGracza = pomocnik.pobierzDaneWejsciowe("Podaj pole: ");
            sprawdzRuchGracza(ruchGracza);
        }
        zakonczGre();
    }

    private void sprawdzRuchGracza(String ruchGracza) {
        liczbaRuchow++;
        String wynik = "pudło";

        for (Startup startupDoSprawdzenia : startupy) {
            wynik = startupDoSprawdzenia.sprawdz(ruchGracza);

            if (wynik.equals("trafiony")) {
                break;
            }
            if (wynik.equals("zatopiony")) {
                startupy.remove(startupDoSprawdzenia);
                break;
            }
        }
        System.out.println(wynik);
    }

    private void zakonczGre() {
        System.out.println("Wszystkie startupy zostały zatopione! Teraz Twoje informacje nie mają znaczenia.");
        if (liczbaRuchow <= 18) {
            System.out.println("Wykonałeś jedynie " + liczbaRuchow + " ruchów.");
            System.out.println("Wydostałeś się, zanim Twoje informacje zatonęły.");
        } else {
            System.out.println("Ale się grzebałeś! Wykonałeś aż " + liczbaRuchow + " ruchów.");
            System.out.println("Teraz rybki pływają pomiędzy Twoimi informacjami.");
        }
    }

    public static void main(String[] args) {
        StartupGraMax gra = new StartupGraMax();
        gra.przygotujGre();
        gra.rozpocznijGre();
    }
}
