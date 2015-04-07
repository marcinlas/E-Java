
package Czesc2;

import java.text.SimpleDateFormat;
import java.util.*;

public class TextAndNumbers 
{
    public static void main(String[] args) 
    {
    
    String imie = "Marcin ";
    String nazwisko = "Łaś";
    int dataUrodzenia = 1985;
    int rokDzis = 2015;
    String plec = "mężczyzna";
    int wiek = rokDzis - dataUrodzenia;
     
    System.out.println(imie + nazwisko + " - w tym roku mam " 
            + wiek + " lat. Moja płeć to " + plec + ".");
    
    SimpleDateFormat aktualnaData = new SimpleDateFormat("dd.MM.yyyy");
    System.out.println("Dzisiejsza data to: " + aktualnaData.format(new Date()) );
    
    SimpleDateFormat aktualnyCzas = new SimpleDateFormat("kk:mm");
    System.out.println("Aktualna godzina to: " + aktualnyCzas.format(new Date()) );    
    } 
}    

    

