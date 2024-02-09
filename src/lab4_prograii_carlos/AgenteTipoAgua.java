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
public class AgenteTipoAgua extends Agentes{
    
    public AgenteTipoAgua(double Precio, int PuntosDeVida, int PuntosDeDanyio) {
        super(Precio, PuntosDeVida, PuntosDeDanyio);
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
    
    public double Daño() {
        Random Num = new Random();
        int R1 = Num.nextInt(7) + 0;
        if (R1 < 7) {
            return this.PuntosDeDanyio;
        } else {
            return 0;
        }
        
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
