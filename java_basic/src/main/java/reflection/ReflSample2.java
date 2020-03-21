package reflection;

import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import reflection.reflect.Animal;

public class ReflSample2 {


    public static void main(String[] args) {

        Class<?> animailClass = Animal.class;
        {
            try {
                Object animal = animailClass.newInstance();
                System.out.println(animal.toString());

                Constructor constructor = animailClass.getConstructor(String.class);
                animal = constructor.newInstance("Sharik");
                System.out.println(animal.toString());

                Field nameField = animailClass.getDeclaredField("name");
                nameField.setAccessible(true);
                nameField.set(animal, "Rex");
                System.out.println(animal.toString());

                Method getter = animailClass.getDeclaredMethod("getName");
                System.out.println(getter.invoke(animal));

                Method setter = animailClass.getDeclaredMethod("setName", String.class);
                setter.invoke(animal, "Milka");
                System.out.println(getter.invoke(animal));

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException | InvocationTargetException | NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
    }
}