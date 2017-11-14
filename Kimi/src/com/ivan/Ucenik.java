package com.ivan;

public class Ucenik
{
    private String NazivUcenika;
    private int Godiste;
    private double Prosek;

    public Ucenik(String nazivUcenika, int godiste, double prosek) {
        NazivUcenika = nazivUcenika;
        Godiste = godiste;
        Prosek = prosek;
    }

    public Ucenik() {
    }

    public Ucenik(String nazivUcenika) {
        NazivUcenika = nazivUcenika;
    }

    public String getNazivUcenika() {
        return NazivUcenika;
    }

    public void setNazivUcenika(String nazivUcenika) {
        NazivUcenika = nazivUcenika;
    }

    public int getGodiste() {
        return Godiste;
    }

    public void setGodiste(int godiste) {
        Godiste = godiste;
    }

    public double getProsek() {
        return Prosek;
    }

    public void setProsek(double prosek) {
        if ((prosek > 5) || (prosek < 1))
        {
            System.out.println("Lose unet prosek");
            Prosek = 1.0;
        }
        Prosek = prosek;
    }
}
