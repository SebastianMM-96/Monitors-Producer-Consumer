/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProducerConsumer;

/**
 *
 * @author sebastian
 */

class Productor implements Runnable {
    private Buffer bb = null;
    
    public Productor (Buffer bb) {this.bb = bb;}
    
    public void run() {
        double item = 0.0;
        while (true) {
            bb.insertar (++item);
            System.out.println("Produciendo " + item);
        }
    }//run
}//Productor
