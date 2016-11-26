/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetingmodel;


/**
 *
 * @author ryo
 */
class AmPm {
    private Clock clock;
    AmPm(){
        this.clock = new Clock();
    }
    
    String message(){
        String ampm = clock.ampm();
        String message = "";
        
        if(ampm.equals("am")){
            message = "おはようございます";
        }else if(ampm.equals("pm")){
            message  = "こんちには";
        }
        
        return message;
    }
}
