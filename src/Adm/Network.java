package Adm;

/**
 * Created by jeffgoes on 4/13/16.
 */
public class Network extends Driver {
    private String type;

    public Network(int codigo, String modelo, int ano, String type) {
        super(codigo, modelo, ano);
        this.type = type;
    }

    boolean EnviaoPapeldeDados (Driver d){
        if (d != null) {
            System.out.println("Pacote enviado com suceso!");
            return true;
        }
        else
            return false;
    }
}
