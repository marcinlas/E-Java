/*
Stwórz tabliczkę mnożenia do 100. Program ma linijka po linijce wypisywać, 
np.: “1 x 2 = 2″, “1 x 3 = 3″ i tak dalej
 */
package czesc3;

public class TabliczkaMnozenia {
    public static void main(String[] args) {
        
       int i = 0;
       
       while (i++<100) {
           System.out.println("1 x "+ i + " = " + i);
           if (i==50) {
               break;
           }
       }    
       
       boolean isDownloading = true;
       
       while (isDownloading) {
           if (i==300) {
               isDownloading = false;
               System.out.println("Plik został ściagnięty");
           } else {
               i++;
           }
       }   
    };
}
