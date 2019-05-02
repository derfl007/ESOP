package ab04;

import java.time.LocalDate;
import java.time.Period;

public class Aufgabe11 {
    public static void main(String[] args) {
        Person3 p = new Person3("Flo", LocalDate.of(2000, 6, 4));
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}

class Person3 {
    private String name;
    private int age;

    Person3(String name, LocalDate birthday) {
        setName(name);
        setAge(calcAge(birthday));
    }

    private int calcAge(LocalDate birthday) {
        LocalDate currentDate = LocalDate.now();
        if (birthday != null) {
            return Period.between(birthday, currentDate).getYears();
        } else {
            System.err.println("Birthday must not be null");
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.err.println("Name must not be empty");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.err.println("Age must not be negative");
        }
    }
}
