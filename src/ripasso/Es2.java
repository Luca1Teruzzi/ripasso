package ripasso;


import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teruzzi.luca
 */
public class Es2 extends Thread{
    private int n;

    

    public Es2(int n) {
        this.n = n;
    }
    public synchronized void  run(){
 
            for(int i=0;;i++){
                Ripasso.risultato=Ripasso.risultato+n;
                System.out.println("Risultato: "+Ripasso.risultato);
                try {
                    this.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Es2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

                
    }

}
