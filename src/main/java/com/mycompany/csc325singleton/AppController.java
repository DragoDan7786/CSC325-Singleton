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
public class AppController {
    private static AppController instance;
    
    private AppController(){
        System.out.println("Instance Created");
    }
    //universal indicator of singleton
    public static AppController getInstance(){
        
        
        if(instance == null){
            synchronized(AppController.class){
                if(instance == null)
                    instance = new AppController();
            }
        }
        return instance;
    }
}
