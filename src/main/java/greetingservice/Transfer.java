/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetingservice;

import java.io.PrintStream;

/**
 *
 * @transfer = 動く
 */
class Transfer {
    private PrintStream out;
    
    Transfer(){
        out = System.out;
    }
    
    void send(String message){
        out.println(message);
    }
}
