
/* Program, który porównuje trzy liczby ze sobą i wyświetla je w kolejności
od najmniejszej do największej. */

package Czesc2;

public class PorownajTrzyLiczby 
{
    public static void main(String[] args)
    {
    int a = 402;
    int b = 4740;
    int c = 132;
    
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
            System.out.println("Inna możliwość. Dodaj warunek.");      
        }
    }   
}
