
package czesc3;

public class DrawRectangle_1 {  
    public static void main(String[] args) {            
        int dlugosc = 5;            
        int wysokosc = 7;              
        int i = 0;            
        int j = 0;              

        while (i < wysokosc) {                
            while (j < dlugosc) {                    
                System.out.print("*");                    
                j++;                
            }                
            System.out.println();                
            j = 0;                
            i++;            
        }        
    }    
}
