package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> offices = new ArrayList<>();
        offices.add("Home");
        offices.add("23 august");
        offices.add("Plaza");
        offices.add("Epos");

        Stream<String> stream =offices.stream();

//        List<String> filteredOffices = stream.filter(o -> o.startsWith("H")).collect(Collectors.toList());
//        filteredOffices.stream().map(office->office.toUpperCase()).forEach(System.out::println);
            stream.filter(o->!o.contains("Home")).map(office->office + " office is closed!").forEach(System.out::println);
    }
}
