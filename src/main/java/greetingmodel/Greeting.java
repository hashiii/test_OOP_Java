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
public class Greeting {

    private String username;

    public Greeting(String username) {
        this.username = username;
    }

    public String message() {
        AmPm ampm = new AmPm();
        GreetingFormat format = new GreetingFormat(username,ampm);
        return format.text();
    }
}
