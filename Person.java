package Kata1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class Person {
    private final Calendar birthDate;
    private final String name;

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
        return Period.between(calendarToLocalDate(birthDate), LocalDate.now()).getYears();
    }

    private LocalDate calendarToLocalDate(Calendar calendar) {
        return LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
    }
}
