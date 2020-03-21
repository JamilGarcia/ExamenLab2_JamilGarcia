package examenlab2_jamilgarcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminTransacciones {
    
    private ArrayList <Transacciones> listaTrans= new ArrayList();
    private File archivo;
    
    public AdminTransacciones (String path) {
        this.archivo = new File(path);
    }

    public ArrayList<Transacciones> getListaTrans() {
        return listaTrans;
    }

    public void setListaTrans(ArrayList<Transacciones> listaTrans) {
        this.listaTrans = listaTrans;
    }
    
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminTransacciones{" + "listaTrans=" + listaTrans + ", archivo=" + archivo + '}';
    }

    
    
    //Metodos
    public void setTransaccion (Transacciones t){
        listaTrans.add(t);
    }
     
     public void cargarArchivo() {
        try {
            listaTrans = new ArrayList();
            Transacciones temp;
            if (archivo.exists()){
                FileInputStream entrada
                        = new FileInputStream (archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Transacciones) objeto.readObject()) != null) {
                        listaTrans.add(temp);
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
            for (Transacciones t : listaTrans) {
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
