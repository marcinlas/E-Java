
// Zmodyfikuj program rysujący kwadrat tak, 
// by inkrementacja widniała w warunkach a nie na końcu pętli.

package czesc3;

public class DrawRectangle_1 {
    public static void main(String[] args) {
        int dlugosc = 5;           
        int wysokosc = 7;             
        int i = 0;           
        int j = 0;             
 
        while (i++ < wysokosc) {            // podczas gdy i < wysokość   
            while (j++ < dlugosc) {                   
                System.out.print("*");                   
                               
            }               
            System.out.println();                
            j = 0;                       
        }       
   }
}

