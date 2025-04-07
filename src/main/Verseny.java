package main;

import java.util.Scanner;

public class Verseny {

    private static final Scanner SCR = new Scanner(System.in);

    private Csiga[] csiga;
    private String nyertes;
    private String fogadottSzin;

    public Verseny() {

        csiga = new Csiga[]{
            new Csiga("Piros"),
            new Csiga("Kék"),
            new Csiga("Zöld")
        };
    }

    public void versenyIndito() {

        System.out.println("Melyik csigára szeretne fogadni? (Piros / Kék / Zöld)");
        do {
            fogadottSzin = SCR.nextLine();
            if (!fogadottSzin.equalsIgnoreCase("Piros")
                    && !fogadottSzin.equalsIgnoreCase("Kék")
                    && !fogadottSzin.equalsIgnoreCase("Zöld")) {
                System.out.println("Nincs ilyen csiga! Kérem próbálja újra.");
            }
        } while (!fogadottSzin.equalsIgnoreCase("Piros")
                && !fogadottSzin.equalsIgnoreCase("Kék")
                && !fogadottSzin.equalsIgnoreCase("Zöld"));

        for (int kor = 1; kor <= 5; kor++) {

            for (Csiga csiga : csiga) {
                csiga.haladas();
                csiga.gyorsul();
            }
        }

        for (Csiga csiga : csiga) {
            System.out.println(csiga.getUtvolnal());
        }

        Csiga nyertesCsiga = csiga[0];
        for (Csiga csiga : csiga) {
            if (csiga.getMegy() > nyertesCsiga.getMegy()) {
                nyertesCsiga = csiga;
            }
        }

        nyertes = nyertesCsiga.getSzin();
        System.out.println("A nyertes csiga: " + nyertes);

        ellenorzes();
    }

    private void ellenorzes() {
        if (nyertes.equalsIgnoreCase(fogadottSzin)) {
            System.out.println("Gratulálok! Nyertél a fogadásoddal!");
        } else {
            System.out.println("Sajnálom, nem nyertél.");
        }
    }

    public void versenyTorles() {
        for (Csiga snail : csiga) {
            snail.torles();
        }
    }
}
