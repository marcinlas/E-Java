
package Czesc2;

public class Kalkulator 
{
    public static void main(String[] args) 
    {
        
        int bokA = 5;
        int bokB = 7;
        float bokC = 9.5f;
        float liczbaPi = 3.14f;
        int promienKola = 5;
        
        
        System.out.println("Pole kwadratu: " + bokA + " * " + bokA +
                " = " + bokA * bokA  );
        
        System.out.println("Pole prostokąta: " + bokA + " * " + bokB +
                " = " + bokA * bokB  );
        
        System.out.println("Pole trójkąta: 1/2 * " + bokA + " * " + bokC +
                " = " + bokA / 2 * bokC  );
        
        System.out.println("Pole koła: " + liczbaPi + " * " + promienKola + " (kwadarat liczby 5) " + " = " + liczbaPi * (promienKola*promienKola));
    }
    
}
