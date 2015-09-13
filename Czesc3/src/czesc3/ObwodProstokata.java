/*
Stwórz program, podobny do tego, który rysował prostokąt, z tą różnicą, 
aby rysował tylko jego obwód.
 */
package czesc3;

public class ObwodProstokata {
    public static void main (String[] args) {
       
        int dlugosc = 5;
        int wysokosc = 7;
        int i = 0;
        int j = 0;
        
        while (i<wysokosc) {
            while (j<dlugosc) {
                if (i==0 || i==6 ) {       //    || <=====  lub
                    System.out.print("*");
                } else {
                    if (j==0 || j==4) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                j++;
            } 
            
            System.out.println("");
            j=0;
            i++;
        }
        
    }
    
}
