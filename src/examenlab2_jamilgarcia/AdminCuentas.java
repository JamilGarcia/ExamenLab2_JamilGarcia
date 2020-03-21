package examenlab2_jamilgarcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminCuentas {
    
    private ArrayList <Cuentas> listaCuen= new ArrayList();
    private File archivo;
    
    public AdminCuentas(String path) {
        this.archivo = new File(path);
    }

    public ArrayList<Cuentas> getListaCuen() {
        return listaCuen;
    }

    public void setListaCuen(ArrayList<Cuentas> listaCuen) {
        this.listaCuen = listaCuen;
    }
    
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminCuentas{" + "listaCuen=" + listaCuen + ", archivo=" + archivo + '}';
    }

    
    
    //Metodos
    public void setCuenta (Cuentas c){
        listaCuen.add(c);
    }
     
     public void cargarArchivo() {
        try {
            listaCuen = new ArrayList();
            Cuentas temp;
            if (archivo.exists()){
                FileInputStream entrada
                        = new FileInputStream (archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Cuentas) objeto.readObject()) != null) {
                        listaCuen.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null; 
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Cuentas t : listaCuen) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        }finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
