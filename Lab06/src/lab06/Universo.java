

package lab06;

import java.util.ArrayList;


public class Universo {
    
    private ArrayList<MundoDisco> mundo = new ArrayList();

    public Universo() {
    }

    public ArrayList<MundoDisco> getMundo() {
        return mundo;
    }

    public void setMundo(ArrayList<MundoDisco> mundo) {
        this.mundo = mundo;
    }

    @Override
    public String toString() {
        return "Universo{" + "mundo=" + mundo + '}';
    }
    
    

}
