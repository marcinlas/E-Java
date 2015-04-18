
package Czesc2;

public class DoWhileTest {
    public static void main(String[] args) {
        int a = 7;
        int limit = a + 10;
        
        a++;
        
        do {
            System.err.println(a);
        } while (a++ > limit);
    }
    
}
