package examenlab2_jamilgarcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminCliente {
    
    private ArrayList <Cliente> listaCliente = new ArrayList();
    private File archivo;

    public AdminCliente(String path) {
        this.archivo = new File(path);
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminCliente{" + "listaCliente=" + listaCliente + ", archivo=" + archivo + '}';
    }
    
    //Metodos
    public void setCliente (Cliente c){
        listaCliente.add(c);
    }
     
     public void cargarArchivo() {
        try {
            listaCliente = new ArrayList();
            Cliente temp;
            if (archivo.exists()){
                FileInputStream entrada
                        = new FileInputStream (archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Cliente) objeto.readObject()) != null) {
                        listaCliente.add(temp);
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
            for (Cliente t : listaCliente) {
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
