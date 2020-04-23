public class Person {
    String name;
    String lastName;
    int age;
    String country;

    public Person(String name, String lastName, int age, String country) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
