/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ripasso;

import java.util.Scanner;

/**
 *
 * @author teruzzi.luca
 */
public class Ripasso {
    public static int risultato=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Inserisci la parola");
//        String s=sc.next();
//        Es1 es1=new Es1(s);
//        System.out.println("Inserisci la parola");
//        s=sc.next();
//        Es1 es2=new Es1(s);
//        es1.start();
//        es2.start();
        risultato=0;
        Es2 es2=new Es2(1);
        Es2 es22=new Es2(2);
        es2.start();
        es22.start();
    }
    
}
