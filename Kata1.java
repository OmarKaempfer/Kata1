package Kata1;

import java.util.Date;
/**
 * Created by Vaehnor on 13/09/2018.
 */
public class Kata1 {
    public static void main(String[] args) {
        Person person = new Person("Omar", new Date(93, 8, 20));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
}
