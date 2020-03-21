package reflection;

import java.lang.annotation.Annotation;

import annotations.LiveAnimal;
import annotations.NotEmpty;
import reflection.reflect.Animal;

public class ReflWithAnnotationSample {
    public static void main(String[] args) {
        Class<?> animalClass = Animal.class;
        Annotation[] annots = animalClass.getAnnotations();
        for (Annotation annotation:
             annots) {
            if(annotation instanceof LiveAnimal) {
                LiveAnimal myAnnotation = (LiveAnimal) annotation;
                System.out.println("name: " + myAnnotation.toString());
            }
        }
    }
}
