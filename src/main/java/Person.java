import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private List<Person> people;

    public Person(String firstName, String lastName, int age, List<Person> people) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.people = new ArrayList<Person>();

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
