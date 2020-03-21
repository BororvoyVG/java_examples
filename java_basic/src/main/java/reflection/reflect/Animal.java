package reflection.reflect;

import java.io.Serializable;

import annotations.LiveAnimal;
import annotations.NotEmpty;

class AbstractAnimal {

}

@LiveAnimal
public class Animal extends AbstractAnimal implements Serializable {
    @NotEmpty
    private String name = "Barsik";

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
