//Napisz program, który odlicza jakąkolwiek liczbę do połowy jej wartości 
//(czyli w dół). Zrób to w obu pętlach.
package czesc3;

public class Polowa_wartosci_liczby {

    public static void main(String[] args) {
    
    int liczba = 30;
    int liczbaProcent = 2;
    
    float percent = (liczba * 100.0f) / liczbaProcent;
        
    while (liczba<percent) {
        System.out.println(percent);
}
    };
    };