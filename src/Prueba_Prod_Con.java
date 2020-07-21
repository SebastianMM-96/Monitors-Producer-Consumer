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



public class Prueba_Prod_Con
{

    public static void main (String [] args)
    {

        int ranuras = 5;

        Buffer monitor = new Buffer (ranuras);

        new Thread(new Productor(monitor)).start();

        new Thread(new Consumidor(monitor)).start();
    }//main
}//Prueba_Prod_Con