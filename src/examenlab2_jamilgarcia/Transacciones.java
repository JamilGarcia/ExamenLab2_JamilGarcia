package examenlab2_jamilgarcia;

import java.io.Serializable;
import java.util.Date;

public class Transacciones implements Serializable{
    
    private String NCuenta;
    private String descrip; 
    private Date fechaYh; 
    private int ID_T;

    private static final long SerialVersionUID = 783L;
    
    public Transacciones(String NCuenta, String descrip, Date fechaYh, int ID_T) {
        this.NCuenta = NCuenta;
        this.descrip = descrip;
        this.fechaYh = fechaYh;
        this.ID_T = ID_T;
    }

    public Transacciones() {
    }

    public String getNCuenta() {
        return NCuenta;
    }

    public void setNCuenta(String NCuenta) {
        this.NCuenta = NCuenta;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Date getFechaYh() {
        return fechaYh;
    }

    public void setFechaYh(Date fechaYh) {
        this.fechaYh = fechaYh;
    }

    public int getID_T() {
        return ID_T;
    }

    public void setID_T(int ID_T) {
        this.ID_T = ID_T;
    }

    @Override
    public String toString() {
        return NCuenta + " " + descrip + " Fecha: " + fechaYh + " ID: " + ID_T;
    }
    
    
}
