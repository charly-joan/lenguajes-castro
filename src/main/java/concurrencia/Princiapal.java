/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

import com.sun.istack.internal.logging.Logger;

/**
 *
 * @author T-107
 */
public class Princiapal implements Runnable{
    /*
 segunda forma de crear threads implementando la interface runnable
    usando polimorfiasmo
    */
    public static void main(String[] args) {
        
        Runnable r=new Princiapal();
        Thread t1=new Thread(r);
        t1.setName("juan");
        Thread t2=new Thread(r);
       t2.setName("ana");
        //t1.start();
        //t2.start();
        
        
        //la tercera forma que viene en el examen 
        //usando clases internas anonimas
        
        
        Thread t3=new Thread(new Runnable(){
            @Override
            public void run() {
                while(true){
                try{
                    Thread.sleep(3000);
                }
                catch (InterruptedException ex){
              
                }
              
                System.out.println("soy un background thread");
            }
            }
        });
        t3.start();
    }

    @Override
    public void run() {
       /*
        System.out.println("soy un thread y me llamo"+Thread.currentThread().getName());
        
        if(Thread.currentThread().getName().equals("juan")){
            System.out.println("soy hombre");
        }
        else
            System.out.println("soy mujer");

*/
       
       
    }
    
}
