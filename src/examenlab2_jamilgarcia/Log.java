package examenlab2_jamilgarcia;

import java.util.Date;

public class Log {
    
    private String Usuario;
    private String Descripcion; 
    private Date fecha; 

    public Log(String Usuario, String Descripcion, Date fecha) {
        this.Usuario = Usuario;
        this.Descripcion = Descripcion;
        this.fecha = fecha;
    }

    public Log() {
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Log{" + "Usuario=" + Usuario + ", Descripcion=" + Descripcion + ", fecha=" + fecha + '}';
    }
    
    public void SubirLog (){
        
    }
}
