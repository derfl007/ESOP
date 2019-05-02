package ab04;

class Person {
    String name;
    int age;
}
public class Aufgabe09 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Flo";
        p.age = 18;
        System.out.println(p.name + ", " + p.age);
    }
}