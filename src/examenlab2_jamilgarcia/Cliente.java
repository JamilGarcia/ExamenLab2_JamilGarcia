package examenlab2_jamilgarcia;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Usuarios implements Serializable{
    
    private ArrayList<Cuentas> cuentas = new ArrayList(); 
    private ArrayList <Transacciones> trans = new ArrayList(); 
    
    private static final long SerialVersionUID = 778L;

    public Cliente(int ID_U, String nombre1, String nombre2, String apellido1, String apellido2, String contra, int a_naci, int a_afil) {
        super(ID_U, nombre1, nombre2, apellido1, apellido2, contra, a_naci, a_afil);
    }

    

    public ArrayList<Transacciones> getTrans() {
        return trans;
    }

    public void setTrans(ArrayList<Transacciones> trans) {
        this.trans = trans;
    }

    public ArrayList<Cuentas> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuentas> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cuentas=" + cuentas + '}';
    }
    
    
}
