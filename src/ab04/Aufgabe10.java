package ab04;

public class Aufgabe10 {
    public static void main(String[] args) {
        Person2 p = new Person2("Flo", 18);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}

class Person2 {
    private String name;
    private int age;

    Person2(String name, int age) {
        setName(name);
        setAge(age);
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
}