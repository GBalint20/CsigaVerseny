package main;

import java.util.Random;

public class Csiga {

    private static final Random RND = new Random();
    
    private String szin;
    private int megy;
    private String emoji;
    private String utvonal = "";

    private static final String Piros = "\033[31m";
    private static final String Kek = "\033[34m";
    private static final String Zold = "\033[32m";
    private static final String Alap = "\033[0m";

    public Csiga(String color) {
        this.szin = color;
        this.megy = 0;

        switch (color.toLowerCase()) {
            case "piros":
                emoji = "🐌";
                break;
            case "kék":
                emoji = "🐌";
                break;
            case "zöld":
                emoji = "🐌";
                break;
            default:
                emoji = "🐌";
        }

    }

    public void gyorsul() {
        int gyorsasag = (int) (Math.random() * 6);
        for (int i = 0; i < gyorsasag; i++) {
            utvonal += "=";
        }
    }

    public String getSzin() {
        return szin;
    }

    public int getMegy() {
        return megy;
    }

    public void torles() {
        this.utvonal = "";
    }

    public String getUtvolnal() {
        String szinKodo = Alap;

        switch (this.szin.toLowerCase()) {
            case "piros":
                szinKodo = Piros;
                break;
            case "kék":
                szinKodo = Kek;
                break;
            case "zöld":
                szinKodo = Zold;
                break;
        }

        return szinKodo + utvonal + Alap + " " + emoji;
    }

    public void csigaemoji() {
        System.out.print(utvonal);
        System.out.print(" " + emoji);
    }

    public void haladas() {
        int lepes = 0;
        lepes = RND.nextInt(0, 4);
        for (int i = 0; i < lepes; i++) {
            utvonal += "-";
        }

    }
}
