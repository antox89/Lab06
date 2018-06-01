

package lab06;

import java.util.ArrayList;


public class Universo {
    
    private ArrayList<MundoDisco> mundo = new ArrayList();
    private int codigo;
    private int edad;
    private int peso;

    public Universo() {
    }

    public Universo(int codigo, int edad, int peso) {
        this.codigo = codigo;
        this.edad = edad;
        this.peso = peso;
    }

    public ArrayList<MundoDisco> getMundo() {
        return mundo;
    }

    public void setMundo(ArrayList<MundoDisco> mundo) {
        this.mundo = mundo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Universo{" + "mundo=" + mundo + ", codigo=" + codigo + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
    
    
    

}
