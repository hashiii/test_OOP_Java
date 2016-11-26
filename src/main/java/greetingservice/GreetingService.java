/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetingservice;

import greetingmodel.Greeting;

class GreetingService {
    User user;
    Transfer transfer;
    
    GreetingService(){
        this.user = new User();
        this.transfer = new Transfer();
    }
    
    void greet(){
        Greeting greeting = new Greeting(user.name());
        String message = greeting.message();
        transfer.send(message);
    }
}
