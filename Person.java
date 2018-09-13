package Kata1;

import java.util.Date;

public class Person {
    private Date birthDate;
    private String name;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return (int)((new Date().getTime() - this.birthDate.getTime())/(365.25*24*60*60*1000));
    }
}
