/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325singleton;

/**
 *
 * @author soblab
 */
public class DriverClass {
    public static void main(String[] args) throws InterruptedException {
        //creates two instances when we want 1
        //AppController app1 = new AppController();
        //AppController app2 = new AppController();
        
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run(){
                AppController app1 = AppController.getInstance();
            }
        });
        
        
         Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run(){
                AppController app1 = AppController.getInstance();
            }
            });
        
         thread1.start();
         thread2.start();
        //System.out.println("check " + (app1==app4));
    }   
   
}
