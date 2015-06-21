
package czesc3;

public class DrawRectangle 
{
    public static void main(String[] args) 
    {
        int dlugosc = 5;
        int wysokosc = 7;
        int i = 0;
        int j = 0;

        while (i < wysokosc) 
        {
            while (j < dlugosc)
            {
                System.out.println("*");
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }
        
    }
}
