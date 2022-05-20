
package main;

import java.util.Random;
import java.util.Scanner;

public class Hajo {
    int[] pozicio = new int[3];
    int lovesek = 0;

    public Hajo() {
        setPozicio(pozicio);
    }

    public void setPozicio(int[] pozicio) {
        Random rnd = new Random();
        int kezdoPoz = rnd.nextInt(5);
        assert kezdoPoz <= 4:"Rosz helyen kezdődik";
        for (int i = 0; i < pozicio.length; i++) {
            this.pozicio[i] = kezdoPoz;
            kezdoPoz++;
        }
    }
    
    
    public String talalat (int poz){
        Scanner scr = new Scanner(System.in);
        System.out.println("Hova szeretne lőni?(1-7)");
        int lovesPoz = scr.nextInt()-1;
            int i = 0;
            while (i < pozicio.length && !(lovesPoz == pozicio[i])) {
                i++;
            }
            lovesek++; 
            System.out.printf("%d. Lövés: ", lovesek);
            if (i < pozicio.length) {
                System.out.println("Talált");
                return "talált";
            }
            
            System.out.println("Mellé");
             return "Mellé";
       
        
    }
}
