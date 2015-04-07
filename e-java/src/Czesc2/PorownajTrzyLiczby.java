
/* Program, który porównuje trzy liczby 
ze sobą i wyświetla je w kolejności od najmniejszej 
do największej. */

package Czesc2;

public class PorownajTrzyLiczby 
{
    public static void main(String[] args)
    {
    int a = 453;
    int b = 632;
    int c = 12;
    
    if((a<b) || (b<c))
        {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
    else if((b<a) || (a<c)) 
        {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);           
        }
    else if((c<b) || (b<a))
        {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }  
    else 
        {   
            System.out.println("Inna możliwość");
        }
    }   
}
