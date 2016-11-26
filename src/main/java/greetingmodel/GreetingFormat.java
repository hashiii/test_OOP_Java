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
class GreetingFormat {

    private String username;
    private String message;

    private static final String templete = "%sさん、%s。";

    GreetingFormat(String username, AmPm ampm) {
        this.username = username;
        this.message = ampm.message();
    }

    String text() {
        return String.format(templete, username, message);
    }
}
