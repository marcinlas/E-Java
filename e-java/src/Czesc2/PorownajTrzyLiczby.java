
/* Program, który porównuje trzy liczby ze sobą i wyświetla je w kolejności
od najmniejszej do największej. */

/*
Analogicznie jak dla 1 zestawu liter tj. ab bc i ca (równość) można 
wykonać pozostałe przypadki.

*/

package Czesc2;

public class PorownajTrzyLiczby 
{
    public static void main(String[] args)
    {
    int a = 502;
    int b = 702;
    int c = 502;
    
    /*
    String imie = "Marcin";
    String nazwisko = "Nowak";
    
    if (imie.equals(nazwisko))
    {
        System.out.println("Imie = nazwisko");
    }
    else 
    {
        System.out.println("Imie jest różne od nazwiska");
    }
    
    */
    
    if((a<b) && (b<c))
        {
            System.out.println(a + " " + b + " " + c);
        }
    else if ((a<b) && (c<b))
        {
            System.out.println(c + " " + a + " " + b);
        }
    else if((b<a) && (a<c)) 
        {
            System.out.println(b + " " + a + " " + c);           
        }
    
    else if((a==b) && (c<a)) 
        {
            System.out.println("Liczby \'A\' i \'B\' są równe i obie wynoszą " 
                    + a + "." + " Liczba \'C\' jest od nich mniejsza i wynosi "
                    + "" + c + ".");
        }
    
    else if((a==b) && (a<c)) 
        {
            System.out.println("Liczby \'A\' i \'B\' są równe i obie wynoszą " 
                    + a + "." + " Liczba \'C\' jest od nich większa i wynosi "
                    + "" + c + ".");
        }
    
    else if((b==c) && (a<b))
        {
            System.out.println("Liczby \'B\' i \'C\' są równe i obie wynoszą "
                    + b + "." + " Liczba \'A\' jest od nich mniejsza i wynosi "
                    + a + ".");
        }
    
    else if((b==c) && (b<a))
        {
            System.out.println("Liczby \'B\' i \'C\' są równe i obie wynoszą "
                    + b + "." + " Liczba \'A\' jest od nich większa i wynosi "
                    + a + ".");
        }
    
    else if((a==c) && (b<c))
        {
            System.out.println("Liczby \'A\' i \'C\' są równe i obie wynoszą "
                    + a + "." + " Liczba \'B\' jest od nich mniejsza i wynosi "
                    + b + ".");
        }
    else if((a==c) && (a<b))
        {
            System.out.println("Liczby \'A\' i \'C\' są równe i obie wynoszą "
                    + c + "." + " Liczba \'B\' jest od nich większa i wynosi "
                    + b + ".");
        }
            
                
                
    else if ((b<c) && (c<a))
        {
            System.out.println(b + " " + c + " " + a);
        }
    else if((c<b) && (b<a))
        {
            System.out.println(c + " " + b + " " + a);
        }  
    else 
        {   
            System.out.println("Inna możliwość. Dodaj warunek!");      
        }
    }   
}