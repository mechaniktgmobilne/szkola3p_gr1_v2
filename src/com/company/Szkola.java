package com.company;

import java.util.ArrayList;

public class Szkola {
    private String nazwaSzkoly;
    private ArrayList<Uczen> uczniowie = new ArrayList<Uczen>(); //do przemyslenia czy potrzebne
    private ArrayList<Klasa> klasy =new ArrayList<Klasa>();
    private ArrayList<Nauczyciel> nauczyciele = new ArrayList<Nauczyciel>();
    private static Szkola szkola;

    private Szkola(String nazwaSzkoly) {
        this.nazwaSzkoly = nazwaSzkoly;
    }

    public static Szkola getSzkola(String jakasNAzwa) {
        if(szkola == null){
            szkola = new Szkola(jakasNAzwa);
        }
        return szkola;
    }
    public void dodajKlase(Klasa klasa){
        klasy.add(klasa);
    }
    public void dodajNauczyciela(Nauczyciel nauczyciel){
        nauczyciele.add(nauczyciel);
    }


    public void przepiszUczniaZKlasyDoKlasy(Uczen uczen,Klasa klasaDocelowa){
        for (Klasa klasa: klasy) {
            if(klasa.getUczniowie().contains(uczen)){
                klasa.usunUczniaZKlasy(uczen);
                break;
            }
        }
        klasaDocelowa.dodajUczniaDoKlasy(uczen);

    }
    public void dodajNowegoUczniaDoSzkoly(String imie, int wiek, Klasa klasa){
        Uczen uczen = new Uczen(imie,wiek);
        uczniowie.add(uczen);
        klasa.dodajUczniaDoKlasy(uczen);
    }
    public void dodajUczniaBezKlasy(Uczen uczen){
        uczniowie.add(uczen);
    }

    @Override
    public String toString() {
        return "Szkola{" +
                "nazwaSzkoly='" + nazwaSzkoly + '\'' +
                '}';
    }
}
