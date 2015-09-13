/*
Wykonaj program, który porównuje dane trzech osób: Imię, nazwisko, dzień, 
miesiąc i rok urodzenia, pesel oraz adres zamieszkania
 */
package cwiczenia;

public class Cwiczenia {

    public static void main(String[] args) {
        
       Osoba mirek = new Osoba();
       mirek.imie = "Mirosław";
       mirek.nazwisko = "Żwirek";
       mirek.dzien = 19;
       mirek.miesiac = 7;
       mirek.rok = 99;
       
       Osoba jacek = new Osoba();
       jacek.imie = "Jacek";
       jacek.nazwisko = "Placek";
       jacek.dzien = 14;
       jacek.miesiac = 2;
       jacek.rok = 95;
       
       Osoba marek = new Osoba();
       marek.imie = "Marek";
       marek.nazwisko = "Skwarek";
       marek.dzien = 24;
       marek.miesiac = 22;
       marek.rok = 92;
         
        }
   
    }
    
        class Osoba {
            
        String imie;
        String nazwisko;
        int dzien;
        int miesiac;
        int rok; 
        
        }
