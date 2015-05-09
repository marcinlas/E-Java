package nowyprojekt;

public class Kot extends Zwierze  implements OdzywajaceSie {

    @Override
    public void odezwijSie() {
       System.out.println("Miaucz ");
       
       
    }

    @Override
    public String getZwierzeName() {
        return "kot";
      
   }
    
    

    
}
