package Adm;

/**
 * Created by jeffgoes on 4/12/16.
 */

public class Video extends Driver{
    private String type;
    private int brilho = 0;

    public Video(int codigo, String modelo, int ano, String type, int brilho) {
        super(codigo, modelo, ano);
        this.type = type;
        this.brilho = brilho;
    }

    public int getBrilho() {
        return brilho;
    }

    int alteraBrilhoDeExibicao  (int intensidade){
        if (intensidade >= -10 && intensidade <= 10){
            brilho = brilho + intensidade;
            return brilho;
        }
        else
            System.out.println("Valor Invalido");
            return -1;

    }

}
