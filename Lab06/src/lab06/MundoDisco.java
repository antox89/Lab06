

package lab06;

import java.util.ArrayList;


public class MundoDisco {
    
    private String nombre;
    private int peso;
    private ArrayList<Criaturas> listaCriaturas = new ArrayList();

    public MundoDisco() {
    }

    public MundoDisco(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
    
    public void agregarCriatura(Criaturas criatura){
        this.listaCriaturas.add(criatura);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList<Criaturas> getListaCriaturas() {
        return listaCriaturas;
    }

    public void setListaCriaturas(ArrayList<Criaturas> listaCriaturas) {
        this.listaCriaturas = listaCriaturas;
    }

    @Override
    public String toString() {
        return "Mundo Disco - "+nombre;
    }

    
    
    
    
    
}
