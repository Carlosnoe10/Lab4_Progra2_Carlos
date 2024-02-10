/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4_prograii_carlos;

import java.util.Random;

/**
 *
 * @author cd507
 */
public class AgenteTipoTierra extends Agentes{
    
    public AgenteTipoTierra(double Precio, int PuntosDeVida, int PuntosDeDanyio) {
        super(Precio, PuntosDeVida, PuntosDeDanyio);
    }

    public AgenteTipoTierra(double Precio, int PuntosDeVida, int PuntosDeDanyio, String Nombre) {
        super(Precio, PuntosDeVida, PuntosDeDanyio, Nombre);
    }

    public AgenteTipoTierra(double Precio, int PuntosDeVida, int PuntosDeDanyio, String Nombre, int Numero) {
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
                return danio * 1.3;
            } else if (Ragente instanceof AgenteTipoFuego) {
                return danio * 0.7;
            } else if (Ragente instanceof AgenteTipoViento) {
                return danio * 0.4;
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
