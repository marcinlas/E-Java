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
       mirek.miesiac = 12;
       mirek.rok = 99;
       mirek.pesel = 990719123;
       
       Osoba jacek = new Osoba();
       jacek.imie = "Jacek";
       jacek.nazwisko = "Placek";
       jacek.dzien = 14;
       jacek.miesiac = 02;
       jacek.rok = 95;
       
       Osoba marek = new Osoba();
       marek.imie = "Marek";
       marek.nazwisko = "Skwarek";
       marek.dzien = 24;
       marek.miesiac = 12;
       marek.rok = 1992;
       
       Osoba[] osoba = 
       {
           mirek,jacek,marek 
       };
       
       porownaj(osoba);
    
    }

   
    public static void porownaj(Osoba[] osoba) {
        System.out.println(osoba[0].imie+ " " +osoba[0].nazwisko);
        System.out.println(osoba[0].dzien+"-"+osoba[0].miesiac+"-"+osoba[0].rok);
        
           
    }
}
    
        class Osoba {
            
        String imie;
        String nazwisko;
        int dzien;
        int miesiac;
        int rok; 
        int pesel;
        String adres;
 
    };

   
