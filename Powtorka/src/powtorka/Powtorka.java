
package powtorka;
    
        

class Byt{
    
    int i = 0;
    
    void uczenieSie(){
         System.out.println("Bytowanie"); 
    }
}        

 class Nauka extends Byt{
     
     int ii = 1;
     
       void uczenieSie(){
     /// System.out.println("Nauka - uczenie");
           super.uczenieSie();
       }
}        

    class Filozofia extends Nauka{
          
        int iii = 2;
        
      //@Override
      //void uczenieSie(){
       //System.out.println("Uczę się filozofii!");
      // }
       
       void dluuuugieUczenieSie(){
       //uczenieSie();
           
           System.out.println(iii);
         
           
           
       };
      
    }
          
    
    class Matematyka extends Nauka {
        Matematyka(){uczenieSie();
    } };
        



public class Powtorka {

    
    public static void main(String[] args) {
        
        
        //new Nauka().uczenieSie();
        new Filozofia().dluuuugieUczenieSie();
        
        //new Matematyka().uczenieSie();
        
       //System.out.print(Student.uczelnia);
      //
     //  System.out.println(new Student().imie);  // przy "new" zawsze musi być nawias
        

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