/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
it is a Procedural programming !!!!!
 */
package hello;

import java.util.Calendar;

public class GreetingProcedural {

    void greet() {
        String user = System.getProperty("user.name");

        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        String message = "";
        if (hour < 12) {
            message = "おはようございます";
        } else {
            message = "こんばんは";
        }

        System.out.println(user + "さん" + message);

    }
}
