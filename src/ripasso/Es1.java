/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ripasso;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teruzzi.luca
 */
public class Es1 extends Thread {
private String s;

    public Es1(String s) {
        this.s = s;
    }
    public synchronized void run() {
        try {
            if(s.equals("Brutto")){
                this.sleep(500);
            }
                for(int i=0;;i++){

                    System.out.println("Ciao sono: "+s+" "+i);
                    this.sleep(1000);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Es1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
