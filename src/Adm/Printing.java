package Adm;

/**
 * Created by jeffgoes on 4/13/16.
 */
public class Printing extends Driver{
    private String type;

    public Printing(int codigo, String modelo, int ano,  String type) {
        super(codigo, modelo, ano);
        this.type = type;
    }

    boolean ImprimePaginas (Driver d, String s){
        if (d != null) {
            System.out.println("Pacote enviado com suceso!");
            return true;
        }
        else
            return false;
    }
}
