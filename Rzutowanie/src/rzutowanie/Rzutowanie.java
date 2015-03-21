package rzutowanie;



class Budynek {
    void zrobBurdel(){};
}

class Senat extends Budynek {
   
    void korupcja(){
        System.out.println(Laboratorium.kasa);
    };    
}

class Laboratorium extends Budynek {
    
    public static String kasa = "1.000.000$";
    
}



public class Rzutowanie {
    
    
   
    // wszystko jest obiektem, dziedzicyz po obiekcie!
    
    public static void main(String[] args) {
        
    String a = new String("polityk"); //wartosc referencji a: Dx992233
    String b = new String("polityk"); //wartosc referencji b: Dx662211
    
    Integer aa = new Integer(1);
    Integer bb = new Integer(1);

    Object obj = new Object();
    
    
    
    //Operator "==" NIE PORÓWNUJE OBIEKTÓW, ale REFERENCJE!!!
    if (aa == bb)
    {
        System.out.println("Doszło do korupcji");
    }
    
    //Metoda equals porównuje wartość obiektu, choćby z różnych referencji
     if (aa.equals(bb))
    {
        System.out.println("Doszło do korupcji, i została wykryta dzięki equals!!");
    }
    
    if (a.equals(b))           // equals porównuje wartości dla referencji i typy prymitywne
    {
        System.out.println("OK");
    }    

    if (a.equals(aa))
    {
        System.out.print("NIe zgadzają się");
    }
    
    Budynek budynek = new Budynek();
    Senat senat = new Senat();
    
    //Instanceof sprawdza, czy budynek jest dzieckiem Senatu
    if (budynek instanceof Senat)
    {
        System.out.println("Instancja się zgadza");
    }
    
    //Referencja może ograniczać oryginalne metody!! 
    Budynek budynek2 = new Senat();
    //budynek2.korupcja();
    budynek2.zrobBurdel();
    
    if (budynek2 instanceof Senat)
    {
        System.out.println("Hajs się zgadza");
    }
    
    
    Budynek bn = new Budynek();
    Budynek senat2 = (Senat) bn;

    //senat2.korupcja();
    
    String akumulacja;
    System.out.println(akumulacja);
    
}
    
 
    
    
    
    
}
