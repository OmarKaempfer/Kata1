package Kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    private final Calendar birthDate;
    private final String name;
    private final long MILLISECONDS_PER_YEAR = (long) (365.25*24*60*60*1000);

    public Person(String name, Calendar birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        Calendar today = GregorianCalendar.getInstance();
        return milliSecondsToYear(today.getTimeInMillis() - birthDate.getTimeInMillis());
    }

    private int milliSecondsToYear(long milliSeconds) {
        return (int) (milliSeconds / MILLISECONDS_PER_YEAR);
    }
}
