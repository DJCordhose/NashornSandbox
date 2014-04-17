package eu.zeigermann.nashorn;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// http://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Lambda-QuickStart/index.html
public class FunctionalJava {
    public static void main(String[] args) {
List<Integer> list = Arrays.asList(3, 4, 1, 2);
//list.forEach(new Consumer() {
//
//    @Override
//    public void accept(Object o) {
//        System.out.println(o);
//    }
//});
        list.forEach(o -> System.out.println(o));
//        list.forEach( System.out::println);
    }
}

