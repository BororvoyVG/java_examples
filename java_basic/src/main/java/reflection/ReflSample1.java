package reflection;

import reflection.reflect.Animal;

public class ReflSample1 {
    public static void main(String[] args) {
        Class<?> animalClass = Animal.class;
        System.out.println(animalClass);
        System.out.println(animalClass.getSuperclass().getCanonicalName());

        Class<?>[] interfaces =animalClass.getInterfaces();
        for (Class<?> inner: interfaces) {
            System.out.println(inner.getCanonicalName());
        }
    }
}
