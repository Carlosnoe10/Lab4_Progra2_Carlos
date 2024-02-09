package lab4_prograii_carlos;

import java.util.ArrayList;

public class Usuario extends Personas {

    public String Correo;
    public String NombreDeUsu;
    public String Contrasenya;
    public double Dinero;
    ArrayList<Agentes> agentes = new ArrayList();

    public Usuario(String Nombre, int Numero) {
        super(Nombre, Numero);
    }

    public Usuario(String Correo, String NombreDeUsu, String Contrasenya, double Dinero, String Nombre, int Numero) {
        super(Nombre, Numero);
        this.Correo = Correo;
        this.NombreDeUsu = NombreDeUsu;
        this.Contrasenya = Contrasenya;
        this.Dinero = Dinero;
    }

    public Usuario(String Correo, String NombreDeUsu, String Contrasenya, double Dinero) {
        this.Correo = Correo;
        this.NombreDeUsu = NombreDeUsu;
        this.Contrasenya = Contrasenya;
        this.Dinero = Dinero;
    }

    public String getContrasenya() {
        return Contrasenya;
    }

    public void setContrasenya(String Contrasenya) {
        this.Contrasenya = Contrasenya;
    }

    public double getDinero() {
        return Dinero;
    }

    public void setDinero(double Dinero) {
        this.Dinero = Dinero;
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
        return "Usuario{" + "Correo=" + Correo + ", NombreDeUsu=" + NombreDeUsu + ", Contrasenya=" + Contrasenya + ", Dinero=" + Dinero + ", agentes=" + agentes + '}';
    }
    

}
