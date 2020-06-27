package pl.przygodzki;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Employee employee = new Employee("Adam", "Kowalski", 5000.33);
//        System.out.println(employee.getName());
//        employee.setName("Da");
//
//        Employee employee2 = new Employee("Zdzisław", "Python", 10000.0);
//        System.out.println(employee2.getName());

//        List<Mem> mems = new ArrayList<>();
//
//        mems.add(new Mem("Rosja", "http://memy.pl/123", null, true));
//        mems.add(new Mem("Polska", "http://memy.pl/133", null, true));
//        mems.add(new Mem("Babcia", "http://memy.pl/552", "niezrozumialy", false));
//
//        mems.stream().filter(mem -> mem.isFavourite() == true).forEach(System.out::println);

//        Set<Integer> set = new HashSet<>();
//        set.add(4);
//        set.add(1);
//        set.add(2);
//        set.add(4);
//        set.add(3);
//        set.add(2);
//
//        System.out.println(set);

        Post post = new Post("Java jest fajna", "Christian Przygodzki");
        Tag tag = new Tag("programowanie");
        post.addTag(tag);
        post.addTag(new Tag("java"));
        post.addTag(tag);
        post.addTag(new Tag("programowanie"));
        System.out.println(post);
    }
}
