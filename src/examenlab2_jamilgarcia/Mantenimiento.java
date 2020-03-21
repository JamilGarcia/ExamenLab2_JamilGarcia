package examenlab2_jamilgarcia;

import java.io.Serializable;
import java.util.ArrayList;

public class Mantenimiento extends Usuarios implements Serializable{
    
    private ArrayList <ATM> atm = new ArrayList(); 
    
    private static final long SerialVersionUID = 777L;

    public Mantenimiento(int ID_U, String nombre1, String nombre2, String apellido1, String apellido2, String contra, int a_naci, int a_afil) {
        super(ID_U, nombre1, nombre2, apellido1, apellido2, contra, a_naci, a_afil);
    }

    public Mantenimiento() {
    }

    public ArrayList<ATM> getAtm() {
        return atm;
    }

    public void setAtm(ArrayList<ATM> atm) {
        this.atm = atm;
    }
    
    public void agregarAtm (ATM a){
        atm.add(a);
    }

    @Override
    public String toString() {
        return "Mantenimiento{" + "atm=" + atm + '}';
    }
    
    
}
