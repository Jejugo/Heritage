package Adm;

/**
 * Created by jeffgoes on 4/12/16.
 */
abstract public class Driver {
    protected int codigo;
    protected String modelo;
    protected int ano;

    public Driver(int codigo, String modelo, int ano) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    boolean ligaDispositivo (Driver a){
        if (a != null){
            return true;
        }
        else
            return false;
    }




 //   int verificaStatus (){

   // }

    //boolean executaTeste(){

    //}



}
