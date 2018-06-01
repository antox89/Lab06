

package lab06;

import java.util.ArrayList;


public class Criaturas {
    
    private String raza;
    private int energia;
    private int ano;
    private String region;
    private int cantidad_especies;
    private int peso;
    private ArrayList<String> objetos = new ArrayList();

    public Criaturas() {
    }

    public Criaturas(String raza, int energia, int ano, String region, int cantidad_especies, int peso) {
        this.raza = raza;
        this.energia = energia;
        this.ano = ano;
        this.region = region;
        this.cantidad_especies = cantidad_especies;
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getCantidad_especies() {
        return cantidad_especies;
    }

    public void setCantidad_especies(int cantidad_especies) {
        this.cantidad_especies = cantidad_especies;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList<String> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<String> objetos) {
        this.objetos = objetos;
    }

    @Override
    public String toString() {
        return raza;
    }

    

}
