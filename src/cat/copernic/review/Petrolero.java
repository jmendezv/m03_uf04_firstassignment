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
public class Petrolero extends BarcoMercancias {
    
    public Petrolero(double capacidadCarga, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(capacidadCarga, motor, eslora, manga, nudos, peso);
    }

    @Override
    public void abandonenElBarco() {
        super.abandonenElBarco(); 
        System.out.println("Tomando medidas marea negra");
    }
    
    
}
