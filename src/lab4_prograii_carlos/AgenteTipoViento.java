package lab4_prograii_carlos;

import java.util.Random;

public class AgenteTipoViento extends Agentes{

    public AgenteTipoViento(double Precio, int PuntosDeVida, int PuntosDeDanyio) {
        super(Precio, PuntosDeVida, PuntosDeDanyio);
    }

    public AgenteTipoViento(double Precio, int PuntosDeVida, int PuntosDeDanyio, String Nombre) {
        super(Precio, PuntosDeVida, PuntosDeDanyio, Nombre);
    }

    public AgenteTipoViento(double Precio, int PuntosDeVida, int PuntosDeDanyio, String Nombre, int Numero) {
        super(Precio, PuntosDeVida, PuntosDeDanyio, Nombre, Numero);
    }

    
    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getPuntosDeVida() {
        return PuntosDeVida;
    }

    public void setPuntosDeVida(int PuntosDeVida) {
        this.PuntosDeVida = PuntosDeVida;
    }

    public int getPuntosDeDanyio() {
        return PuntosDeDanyio;
    }

    public void setPuntosDeDanyio(int PuntosDeDanyio) {
        this.PuntosDeDanyio = PuntosDeDanyio;
    }

    @Override
    public double Daño(Agentes Ragente) {
        Random Num = new Random();
        int danio = this.PuntosDeDanyio;
        int R1 = Num.nextInt(7) + 0;
        if (R1 < 7) {
            if (Ragente instanceof AgenteTipoAgua) {
                return danio * 0.7;
            } else if (Ragente instanceof AgenteTipoTierra) {
                return danio * 1.1;
            } else if (Ragente instanceof AgenteTipoFuego) {
                return danio * 1.5;
            } else {
                return danio;
            }
            
        } else {
            return 0;
        }
        
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
}
