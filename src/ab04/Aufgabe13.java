package ab04;

import java.time.LocalDate;
import java.time.Period;

public class Aufgabe13 {
    public static void main(String[] args) {
        Person5 p = new Person5("Person1", LocalDate.of(1990, 6, 4));
        System.out.println(p);
        Person5 p2 = new Person5("Person2", LocalDate.of(2000, 9, 15));
        System.out.println(p2);
        System.out.println("Person instances: " + Person5.count);
    }

}

class Person5 {
    static int count;
    private String name;
    private int age;

    Person5(String name, LocalDate birthday) {
        setName(name);
        setAge(calcAge(birthday));
        count++;
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

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\nAge: " + this.getAge();
    }
}