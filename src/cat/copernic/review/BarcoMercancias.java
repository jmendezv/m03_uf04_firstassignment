/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;

/**
 *
 * @author pep
 */
abstract public class BarcoMercancias extends Barco {
    
    private double capacidadCarga;

    public BarcoMercancias(double capacidadCarga, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(motor, eslora, manga, nudos, peso);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "BarcoMercancias{" + "capacidadCarga=" + capacidadCarga + '}';
    }

    @Override
    void arranca() {
        System.out.println("Arrancando Barco de mercancias");
    }

    @Override
    void atraca() {
        System.out.println("Atracando Barco de mercancias");
    }

    @Override
    public void abandonenElBarco() {
        System.out.println("Abandonando el barco pero asegurando la carga");
    }

    @Override
    public void comportamiento() {
        System.out.println("Comportamiento profesional");
    }

   
}
