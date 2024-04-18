public class ProstyStartup {
    private int[] polaPolozenia;
    private int liczbaTrafien = 0;

    public void setPolaPolozenia(int[] polaPolozenia) {
        this.polaPolozenia = polaPolozenia;
    }

    public String sprawdz(int strzal) {
        String wynik = "pudlo";
        for (int pole : polaPolozenia) {
            if (strzal == pole) {
                wynik = "trafienie!";
                liczbaTrafien++;
                break;
            }
            if (liczbaTrafien == polaPolozenia.length) {
                wynik = "zatopienie";
            }
            System.out.println(wynik);
            return wynik;
        }
        return wynik;
    }


}
