/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetingmodel;

import java.util.Calendar;

/**
 *
 * @author ryo
 */
class Clock {

    private Calendar calendar;

    public Clock() {
        this.calendar = Calendar.getInstance();
    }
    
    String ampm(){
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if(hour < 12) return "am";
        return "pm";
    }

}
