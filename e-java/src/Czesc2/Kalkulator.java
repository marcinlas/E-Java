
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
        
        System.out.println("Pole trójkąta: 1/2 " + bokA + " * " + bokB +
                " = " + 1.2 * bokA * bokB  );
        
        System.out.println("Pole koła: " + liczbaPi + " * " + promienKola + "*v2" + " = " + liczbaPi * promienKola );
    }
    
}
