package lab4_prograii_carlos;

import java.util.Random;

public class Agentes extends Personas{

    public double Precio;
    public int PuntosDeVida;
    public int PuntosDeDanyio;

    public Agentes(double Precio, int PuntosDeVida, int PuntosDeDanyio, String Nombre) {
        super(Nombre);
        this.Precio = Precio;
        this.PuntosDeVida = PuntosDeVida;
        this.PuntosDeDanyio = PuntosDeDanyio;
    }

    
    
    
    
    public Agentes(double Precio, int PuntosDeVida, int PuntosDeDanyio) {
        this.Precio = Precio;
        this.PuntosDeVida = PuntosDeVida;
        this.PuntosDeDanyio = PuntosDeDanyio;
    }

    public Agentes(double Precio, int PuntosDeVida, int PuntosDeDanyio, String Nombre, int Numero) {
        super(Nombre, Numero);
        this.Precio = Precio;
        this.PuntosDeVida = PuntosDeVida;
        this.PuntosDeDanyio = PuntosDeDanyio;
    }
    
    public double Daño(){
      
        return 0;
    }

    @Override
    public String toString() {
        return "Precio= " + Precio + "\n"
                + "PuntosDeVida= " + PuntosDeVida + "\n"
                + "PuntosDeDanyio= " + PuntosDeDanyio ;
    }
    
    
    
}
