package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        List<Person> females = new ArrayList<>();

        for(Person person : people) {
            if(FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for(Person person : females) {
            System.out.println(person);
        }

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        people.stream().filter(personPredicate)
                .forEach(System.out::println);

    }


    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }

}