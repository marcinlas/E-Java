
package nowyprojekt;

public class NowyProjekt {

    //składowe
    static Pies burek;
    static Kot filemon;
    static Zolw wiesio;
            
    public static void main(String[] args) {
        burek = new Pies(); 
        filemon = new Kot();
        wiesio = new Zolw();
        
    
        burek.chodzenie();
        filemon.chodzenie();
        
        burek.odezwijSie();
        filemon.odezwijSie();
        
        ucisz(burek);
        ucisz(filemon);
        //ucisz(wiesio);   //Błąd! Wiesio nie ma implements OdezwijSie
        ucisz(new OdzywajaceSie() {

            @Override
            public void odezwijSie() {
               System.out.println("muuuuu");
            }

            @Override
            public String getZwierzeName() {
                return "krowa";
            }
        });
       
    };
    
    public static void ucisz(OdzywajaceSie odzywajacesie) {
        System.out.println("Zostało uciszone: " + odzywajacesie.getZwierzeName() );
    }
    
  
    

    
}
    
    // stworzenie klasy zwierze i klasę pies i kot ktora dziedziczy po klasie zwierze


   
