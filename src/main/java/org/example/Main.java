package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //stream, lambda
        Demo obj = () -> new String[] {"printed", "a", "from", "a", "show", "a"};
        Stream<String> streamDemo = Arrays.stream(obj.show());
        streamDemo
                .filter(n -> n.length() > 3)
                .map(n -> n + "!")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //default, time
        System.out.println();
        defaultDemoImp ddi = new defaultDemoImp();
        ddi.defTest();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Date and Time: " + ldt);

        //sorting w/ stream
        System.out.println();
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(7);
        list.stream().sorted().forEach(System.out::println);
    }
}
@FunctionalInterface
interface Demo {
    String[] show();
}

interface defaultDemo {
    default void defTest() {
        System.out.println("from default method");
    }
}

class defaultDemoImp implements defaultDemo{ }
