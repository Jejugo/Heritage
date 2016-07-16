package Adm;

/**
 * Created by jeffgoes on 4/13/16.
 */
public class main {
    public static void main (String [] args){
        Driver d = new Network (450, "Dell", 2015, "Fast");
        Video d1 = new Video (375, "Intel", 2013, "Slow", 0);
        Driver d2 = new Printing (325, "AMD", 2015, "Fast");

        System.out.println(d1.alteraBrilhoDeExibicao(11));

    }
}
