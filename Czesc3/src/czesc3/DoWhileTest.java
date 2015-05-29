
package Czesc3;

public class DoWhileTest {
    public static void main(String[] args) {
        int a = 7;
        int limit = a + 10;
        
      /*  do {
            System.err.println(a);
        } while (a++ > limit);        
        */
        
        while (a++ < limit) {
            System.err.println(a);
        } 
    }
   
}