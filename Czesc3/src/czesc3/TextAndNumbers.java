
package Czesc3;

import java.text.SimpleDateFormat;
import java.util.*;

public class TextAndNumbers 
{
    public static void main(String[] args) 
    {
    
    String imie = "Marcin ";
    String nazwisko = "Å?aÅ›";
    int dataUrodzenia = 1985;
    int rokDzis = 2015;
    String plec = "mÄ™Å¼czyzna";
    int wiek = rokDzis - dataUrodzenia;
     
    System.out.println(imie + nazwisko + " - w tym roku mam " 
            + wiek + " lat. Moja pÅ‚eÄ‡ to " + plec + ".");
    
    SimpleDateFormat aktualnaData = new SimpleDateFormat("dd.MM.yyyy");
    System.out.println("Dzisiejsza data to: " + aktualnaData.format(new Date()) );
    
    SimpleDateFormat aktualnyCzas = new SimpleDateFormat("kk:mm");
    System.out.println("Aktualna godzina to: " + aktualnyCzas.format(new Date()) );    
    } 
}   