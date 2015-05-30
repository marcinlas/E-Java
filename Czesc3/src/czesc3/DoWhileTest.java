
package Czesc3;

public class DoWhileTest {
    public static void main(String[] args) {
        int a = 6;
        int limit = a + 11;
        
      /*  do {
            System.err.println(a);
        } while (a++ > limit);        
        */
        
        while (a++ < limit) {
            System.err.println(a);
        } 
    }
   
}