
package nowyprojekt;

public class Pies extends Zwierze implements OdzywajaceSie {
   
    @Override // specjalny rodzj komentarza do oznaczenia nadpisanych metod
    void chodzenie() {
       System.out.println("Pies chodzi ");
   };

    @Override
    public void odezwijSie() {
        System.out.println("Szczeka ");
       
    }
   
   //@Override
    public String getZwierzeName() {
       return "pies";
      
    }
   
}
