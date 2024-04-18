import java.util.ArrayList;

public class Startup {

    private ArrayList<String> polaPolozenia;
    String name;

    public Startup(String name) {
        this.name = name;
    }

    public void setPolaPolozenia(ArrayList<String> polozenia) {
        this.polaPolozenia = polozenia;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sprawdz(String wskazanePole) {
        String wynik = "pudlo";
        int indeks = polaPolozenia.indexOf(wskazanePole);
        if (indeks >= 0) {
            polaPolozenia.remove(indeks);

            if (polaPolozenia.isEmpty()) {
                wynik = "zatopiony";
                System.out.println("Zatopiono: " + name);
            } else {
                wynik = "trafiony";
            }
        }
        return wynik;
    }

}
