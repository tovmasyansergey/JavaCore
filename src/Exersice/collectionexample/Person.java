package Exersice.collectionexample;

import java.util.Objects;

public class Person {
    private final String name;
    private final String director;

    public Person(String director, String name, String surname) {
       this.director = director;
        this.name = name;
        this.surname = surname;
    }

    private final String surname;

    public String getDirector() {
        return director;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(director, person.director) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, director, surname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", director=" + director +
                ", surname='" + surname + '\'' +
                '}';
    }
}
