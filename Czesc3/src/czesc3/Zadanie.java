/*
 jesli liczba > 10 wyswiel duża liczba
 jesli liczba <=10 wyswietla mala liczba
 powyzej 100 nie obslugujemy
 */
package Czesc3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie {

    public static void main(String[] args) throws IOException {

        int granicznaLiczba = 20;
          
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        System.out.print("Wpisz ile ludzi w sklepie: ");
        String name = reader.readLine();


        InputStreamReader inputStreamReader1 = new InputStreamReader(System.in);
        BufferedReader reader1 = new BufferedReader(inputStreamReader);
        System.out.print("Jaki dzień tygodnia: ");
        String dzienTygodnia1 = reader.readLine();

        int ileLudzi = Integer.parseInt(name);
        System.out.println("Ludzi w sklepie " + name);

        if (ileLudzi < granicznaLiczba) {
            System.out.println("W sklepie jest mniej niż 20 osób");
        } else if (ileLudzi > granicznaLiczba && ileLudzi<100) {
            System.out.println("W sklepie jest więcej niż 20 osób, ale mniej niż 100");
        } else if (ileLudzi==100) {
            System.out.println("W sklepie jest pełen skład");
        } else if (ileLudzi>100 && ileLudzi<110 && !"wtorek".equals(dzienTygodnia1)) {
            System.out.println("Dopuszczalna ilość osób poza wtorkami");
        } else if (ileLudzi>100 && ileLudzi<121 && "wtorek".equals(dzienTygodnia1)) { 
            System.err.println("W sklepie jest pomiędzy 100, a 120 osób i jest wtorek");
        } else {
            System.err.println("W sklepie jest za duzo osób");
        }
    }
}

        //        if (porownywanaLiczba >= granicznaLiczba) {
//            System.out.println("Liczba jest większa lub rowna "
//                    + granicznaLiczba);
//        } 
//        else if (porownywanaLiczba < granicznaLiczba) {
//               System.out.println("Liczba jest mniejsza niż "
//                 + granicznaLiczba);
//        } else if ((porownywanaLiczba > granicznaLiczba &&
//                    porownywanaLiczba)==150) {
//               System.out.println("skoro liczba jest rowna 150 to DUPA");
//        } else {
//            System.out.println("powyzej 200 nieobsugujemy!!");
//            //}
//        }
