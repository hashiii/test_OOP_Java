/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetingservice;

/**
 *
 * @author ryo
 */
class User {

    private String name;

    public User() {
        name = System.getProperty("user.name");
    }

    String name() {
        return name;
    }
}
