/*
Stwórz 2 klasy: napoje bez i alkoholowe, które dziedziczą po klasie 
napój. Następnie stworz tablicę dla napojów, wypełnij ją napojami bez i
alkoholowymi po 4 przyklady w każdej. 

Daj możlwość wyswietlenai nazwy kazdego z napojów. 

 */
package powtorkaarray;

import java.util.Arrays;


public class PowtorkaArray {

   
    public static void main(String[] args) 
    {
        NapojeBezAlk[] napojeArray  = 
        {
            new NapojeBezAlk("Kubuś"),
            new NapojeBezAlk("Tymbark"),
            new NapojeBezAlk("Kawa"),
            new NapojeBezAlk("Herbata"),
        };
        
        for (NapojeBezAlk napojeArray1 : napojeArray) 
        {
           // System.out.println(napojeArray1.rodzajNapoju);
        }
        
        Napoj[] napoje =
        {
            new NapojeBezAlk("Cola"),
            new NapojeAlk("Wino"), 
            
        };
        
        for (Napoj n : napoje){
            System.out.println(n.nazwa);
        }
        
        
        
        
    }
    
}
