
package main;

public class Hajo {
    int[] pozicio = new int[3];

    public Hajo() {
        setPozicio(pozicio);
    }

    public void setPozicio(int[] pozicio) {
        int helyek = 2;
        for (int i = 0; i < pozicio.length; i++) {
            this.pozicio[i] = helyek;
            helyek++;
        }
    }
    
    public String talalat (int poz){
        int i = 0;
        while (i < pozicio.length && !(poz == pozicio[i])){
            i++;
        }
        if(i < pozicio.length){
            return "talált";
        }
        return "Mellé";
        
    }
}
