public class Gra {

    public static void main(String[] args) {

        ProstyStartup strp = new ProstyStartup();
        int[] polozenia = {2,3,4};

        strp.setPolaPolozenia(polozenia);

        int wybranePole = 1;
        String wynik = strp.sprawdz(wybranePole);

        String wynikTestu = "niepowodzenie";
        if (wynik.equals("trafienie!")) {
            wynikTestu = "powodzenie";
        }
        System.out.println(wynikTestu);

    }
}
