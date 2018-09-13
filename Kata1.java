package Kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Vaehnor on 13/09/2018.
 */
public class Kata1 {
    public static void main(String[] args) {
        Calendar date =  new GregorianCalendar(1993,9,20);
        Person person = new Person("Omar", date);
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
}
