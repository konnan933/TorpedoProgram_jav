
package main;


public class TorpedoTeszt {
    public static void main(String[] args) {
        tesztLoves(4);
    }
    
    public static String tesztLoves (int poz){
        Hajo hajo = new Hajo();
        int talalatok = 0;
        while (talalatok < 3) {            
            String t= hajo.talalat(poz);
            if (t.equals("talált")) {
                talalatok++;
            }
        }
        System.out.println("Elsülyedt");
        //assert t.equals("talált"):"nem jó a találat ellenörzés!";
          
        return  "";
    }
}
