package ab04;

import java.time.LocalDate;
import java.time.Period;

public class Aufgabe12 {
    public static void main(String[] args) {
        Person4 p = new Person4("Flo", LocalDate.of(2000, 4, 6));
        System.out.println(p);
    }
}

class Person4 {
    private String name;
    private int age;

    Person4(String name, LocalDate birthday) {
        setName(name);
        setAge(calcAge(birthday));
    }

    private int calcAge(LocalDate birthday) {
        LocalDate currentDate = LocalDate.now();
        if(birthday != null) {
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
        if(!name.isEmpty()) {
            this.name = name;
        } else {
            System.err.println("Name must not be empty");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        } else {
            System.err.println("Age must not be negative");
        }
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\nAge: " + this.getAge();
    }
}
