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
       jacek.rok = 1995;
       jacek.pesel = 941419123;
       
       Osoba marek = new Osoba();
       marek.imie = "Marek";
       marek.nazwisko = "Skwarek";
       marek.dzien = 24;
       marek.miesiac = 12;
       marek.rok = 1992;
       marek.pesel = 921219123;
       
       Osoba[] osoba = 
       {
           mirek,jacek,marek 
       };
       
       porownaj(osoba);
    
    }

   
    public static void porownaj(Osoba[] osoba) {
       
        int i = 0; 
        
        while (i<osoba.length) {
            System.out.println("Imie i nazwisko:    "+osoba[i].imie+ " " +osoba[i].nazwisko);
            System.out.println("Data urodzenia: "+osoba[i].dzien+"-"+osoba[1].miesiac+"-"+osoba[i].rok);
            
            // isEquals
            
            System.out.println("PESEL:  "+osoba[i].pesel); 
            i++;
            
        };
        

           
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

   
