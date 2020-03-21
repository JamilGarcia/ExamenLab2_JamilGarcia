package examenlab2_jamilgarcia;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuarios implements Serializable{
    
    private int ID_U;
    private String nombre1; 
    private String nombre2; 
    private String apellido1; 
    private String apellido2;
    private String contra; 
    private int a_naci; 
    private int a_afil; 
    
    private ArrayList <Cuentas> cuen = new ArrayList(); 
    
    private static final long SerialVersionUID = 777L;

    public Usuarios() {
    }

    public Usuarios(int ID_U, String nombre1, String nombre2, String apellido1, String apellido2, String contra, int a_naci, int a_afil) {
        this.ID_U = ID_U;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.contra = contra;
        this.a_naci = a_naci;
        this.a_afil = a_afil;
    }

    public int getID_U() {
        return ID_U;
    }

    public void setID_U(int ID_U) {
        this.ID_U = ID_U;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getA_naci() {
        return a_naci;
    }

    public void setA_naci(int a_naci) {
        this.a_naci = a_naci;
    }

    public int getA_afil() {
        return a_afil;
    }

    public void setA_afil(int a_afil) {
        this.a_afil = a_afil;
    }

    public ArrayList<Cuentas> getCuen() {
        return cuen;
    }

    public void setCuen(ArrayList<Cuentas> cuen) {
        this.cuen = cuen;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "ID_U=" + ID_U + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", contra=" + contra + ", a_naci=" + a_naci + ", a_afil=" + a_afil + ", cuen=" + cuen + '}';
    }
    
    
    
}
