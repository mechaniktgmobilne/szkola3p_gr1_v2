package com.company;

public class Main {

    public static void main(String[] args) {
        //Osoba osoba = new Osoba("Jaś",7); nie można tworzyć obiektu klasy abstrakcyjnej
        Osoba uczen = new Uczen("Edek",8);

        Uczen uczen1 = new Uczen("Ala",7);
        Uczen uczen2 = new Uczen("Ela",7);
        Uczen uczen3 = new Uczen("Ola",7);
        System.out.println(uczen);
        System.out.println(uczen1);
        Wychowawca wychowawca1P = new Wychowawca("Zygmund","wf");
        System.out.println(wychowawca1P);
        uczen1.wykonaDyzur();
        wychowawca1P.wykonaDyzur();
        Klasa klasa1P = new Klasa(wychowawca1P,1,"P");
        klasa1P.dodajUczniaDoKlasy(uczen1);
        klasa1P.dodajUczniaDoKlasy(uczen1);
        klasa1P.dodajUczniaDoKlasy(uczen2);
        klasa1P.dodajUczniaDoKlasy(uczen3);
        System.out.println(klasa1P);

klasa1P.wypiszInfo();
Szkola szkola = Szkola.getSzkola("Mechanik TG");
        System.out.println(szkola);
szkola = Szkola.getSzkola("Jakas inna szkola"); //obiekt juz jest nie utworzy się ponownie
        System.out.println(szkola);
    }
}
