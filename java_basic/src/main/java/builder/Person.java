package builder;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Person {

    private String name;
    private int age;

    static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private Person newPerson;

        public PersonBuilder() {
            newPerson = new Person();
        }

        public PersonBuilder setName(String name) {
            this.newPerson.name = name;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.newPerson.age = age;
            return this;
        }

        public Person build() {
            return newPerson;
        }
    }
}
