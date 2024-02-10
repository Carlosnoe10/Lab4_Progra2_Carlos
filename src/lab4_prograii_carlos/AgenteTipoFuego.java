package lab4_prograii_carlos;

import java.util.Random;

public class AgenteTipoFuego extends Agentes {

    public AgenteTipoFuego(double Precio, int PuntosDeVida, int PuntosDeDanyio) {
        super(Precio, PuntosDeVida, PuntosDeDanyio);
    }

    public AgenteTipoFuego(double Precio, int PuntosDeVida, int PuntosDeDanyio, String Nombre, int Numero) {
        super(Precio, PuntosDeVida, PuntosDeDanyio, Nombre, Numero);
    }

    public AgenteTipoFuego(double Precio, int PuntosDeVida, int PuntosDeDanyio, String Nombre) {
        super(Precio, PuntosDeVida, PuntosDeDanyio, Nombre);
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
        int danio = this.PuntosDeDanyio;
        Random Num = new Random();
        int R1 = Num.nextInt(7) + 0;
        if (R1 < 7) {
            if (Ragente instanceof AgenteTipoAgua) {
                return danio * 0.85;
            } else if (Ragente instanceof AgenteTipoTierra) {
                return danio * 1.1;
            } else if (Ragente instanceof AgenteTipoViento) {
                return danio * 0.5;
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
