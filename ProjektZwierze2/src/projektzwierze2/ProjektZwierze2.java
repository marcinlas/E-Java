
package projektzwierze2;

import java.util.Arrays;

class Zwierze {}
class Kot extends Zwierze{}
class Pies extends Zwierze{
    
    //Metoda o tej samej nazwie co klasa, od razu się uruchamia!
    //Tzw. konstruktor domyślny.
   
    Pies(String imie, Integer wiek){
       imiePsa = imie;
       wiekPsa = wiek;
       
     
    }
  
    //Składowa/we
    String imiePsa;
    Integer wiekPsa = 0;
    
    
    
    
}

public class ProjektZwierze2 {
    
    public static void main(String[] args) {
   
      //  String[] stringArray = {"Steve Jobs", "Bill Gates", "Jonathan Ive"};
        
      //  stringArray[3] = "John Travolta";
        
    //    System.out.println(stringArray[1]);
        
        
     //   int[] intArray = {1,2,3,4,5};
        
     //   System.out.println(intArray[2]);
        
   //     boolean[] booleanArray = {false, true};
   //    System.out.println(booleanArray[1]);
        
       
       Pies terier = new Pies("Cola", 5); 
      
       
       Pies[] piesArray = 
       {
           terier,
           new Pies("Burek", 2),
           new Pies("Ciapek", 5),
           new Pies("Azor", 6),    
       };
       
       Kot[] kotArray =
       {
           new Kot(),
           new Kot(),
       };
       
       Zwierze[] zwierzeArray =
       {
           new Kot(),
           new Pies("Mars", 3),
           new Zwierze(),
       };
       
       // Object - jest  dziedziczony we wszystkich klasach.
       Object[] Tablica = 
       {
           new Kot(),
           new Pies("Szarik", 7),
           5,
           true,
           "siema"
       };
       
       
       for (Pies pies : piesArray) 
       {
       System.out.println(pies.imiePsa);
       }
       
    //   for (int i = 0; i < stringArray.length; i++){
    //   System.out.println(stringArray[i]);    
    //    }
        
   //     for (String string : stringArray) {
     //   System.out.println(string);    
    //   }
        
   //     for (int i : intArray) {
    //        System.out.println(i);
    //    }
        
     //   for (boolean i : booleanArray) {
     //       System.out.print(i+" ");
     //   }
        
    
    }
    
};