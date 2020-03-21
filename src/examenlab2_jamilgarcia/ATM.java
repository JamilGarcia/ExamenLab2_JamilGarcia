package examenlab2_jamilgarcia;

import java.io.Serializable;

public class ATM implements Serializable{

    private int dinero; 
    private String ubicacion; 
    private int ID_ATM; 
    private int A_Fab;
    private String T_Man; 
    
    private static final long SerialVersionUID = 780L;

    public ATM() {
    }

    public ATM(int dinero, String ubicacion, int ID_ATM, int A_Fab, String T_Man) {
        this.dinero = dinero;
        this.ubicacion = ubicacion;
        this.ID_ATM = ID_ATM;
        this.A_Fab = A_Fab;
        this.T_Man = T_Man;
    }

    

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getID_ATM() {
        return ID_ATM;
    }

    public void setID_ATM(int ID_ATM) {
        this.ID_ATM = ID_ATM;
    }

    public int getA_Fab() {
        return A_Fab;
    }

    public void setA_Fab(int A_Fab) {
        this.A_Fab = A_Fab;
    }

    public String getT_Man() {
        return T_Man;
    }

    public void setT_Man(String T_Man) {
        this.T_Man = T_Man;
    }

    @Override
    public String toString() {
        return "ATM{" + "dinero=" + dinero + ", ubicacion=" + ubicacion + ", ID_ATM=" + ID_ATM + ", A_Fab=" + A_Fab + ", T_Man=" + T_Man + '}';
    }
    
    
    
}
