package lab4_prograii_carlos;

import java.util.ArrayList;

public class Usuario extends Personas{
    public String Correo;
    public String NombreDeUsu;
    ArrayList<Agentes> agentes= new ArrayList();
    
    
    public Usuario(String Correo, String NombreDeUsu) {
        this.Correo = Correo;
        this.NombreDeUsu = NombreDeUsu;
    }

    public ArrayList<Agentes> getAgentes() {
        return agentes;
    }

    public void setAgentes(ArrayList<Agentes> agentes) {
        this.agentes = agentes;
    }

    
    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNombreDeUsu() {
        return NombreDeUsu;
    }

    public void setNombreDeUsu(String NombreDeUsu) {
        this.NombreDeUsu = NombreDeUsu;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Correo=" + Correo + ", NombreDeUsu=" + NombreDeUsu + '}';
    }
    
    
    
}
