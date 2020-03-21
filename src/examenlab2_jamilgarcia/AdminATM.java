package examenlab2_jamilgarcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminATM {
    
    private ArrayList <ATM> listaAtm = new ArrayList();
    private File archivo; 
    
    public AdminATM(String path) {
        this.archivo = new File(path);
    }

    public ArrayList<ATM> getListaAtm() {
        return listaAtm;
    }

    public void setListaAtm(ArrayList<ATM> listaAtm) {
        this.listaAtm = listaAtm;
    }
    
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminATM{" + "listaAtm=" + listaAtm + ", archivo=" + archivo + '}';
    }

    
    
    //Metodos
    public void setAtm (ATM a){
        listaAtm.add(a);
    }
     
     public void cargarArchivo() {
        try {
            listaAtm = new ArrayList();
            ATM temp;
            if (archivo.exists()){
                FileInputStream entrada
                        = new FileInputStream (archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (ATM) objeto.readObject()) != null) {
                        listaAtm.add(temp);
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
            for (ATM t : listaAtm) {
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
