package examenlab2_jamilgarcia;

import java.io.Serializable;

public class Cuentas implements Serializable {
    
    private int NumCuen;
    private int saldo; 
    private int ID_Us; 
    private static final long SerialVersionUID = 781L;

    public Cuentas(int NumCuen, int saldo, int ID_Us) {
        this.NumCuen = NumCuen;
        this.saldo = saldo;
        this.ID_Us = ID_Us;
    }

    public int getNumCuen() {
        return NumCuen;
    }

    public void setNumCuen(int NumCuen) {
        this.NumCuen = NumCuen;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getID_Us() {
        return ID_Us;
    }

    public void setID_Us(int ID_Us) {
        this.ID_Us = ID_Us;
    }

    @Override
    public String toString() {
        return "ID:" + ID_Us;
    }
    
    
}
