
package powtorka;
    
        

public class Powtorka {

    
    public static void main(String[] args) {
        
       // System.out.print(Student.uczelnia);
      //
     //  System.out.println(new Student().imie);  // przy "new" zawsze musi być nawias
        

        
    class Nauka {
        void uczenieSie(){}
}        

    class Filozofia extends Nauka {
        
        // konstruktor domyślny
        Filozofia(){uczenieSie();           
        }
    }
    
    class Matematyka extends Nauka {
    };
        
         
        
        

        //Typy prymitywne całkowite
        byte b = 127; 
        short s  = 32767;
        int i = 2147483647;
        long l = 21199999999999999l; //dodać "l" na końcu!!!!
        
        //Typy prymitywne zmiennoprzecinkowe
        float f = 9999999999999991.1234567890123456789999999999999f;
        double d = 99999.99999999999999999999999999999999999999999d; 
        
        //Typ prymitywny logiczny;
        boolean bo = true;
       
        int iii = new Integer(3);
        
        
        
        System.out.println();
        
    }
    
}

// int - typ prymitywny. 
// Integer - typ obiektowy.