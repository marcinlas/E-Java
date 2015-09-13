/*
Stwórz program, który rysuje trójkąt na podstawie podanej długości 
(wysokość ma być równa długości). 
 */
package czesc3;

public class Piramida {
    public static void main (String[] args) {
        
        int dlugosc = 0;
        int wysokosc = 0;
      
        while (wysokosc<5) {
            while (dlugosc<5) {
                if (dlugosc<=wysokosc) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                dlugosc++;   
            }
           System.out.println("");
           dlugosc=0;
           wysokosc++;
        }
    }
}
