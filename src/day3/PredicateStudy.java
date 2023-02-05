package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateStudy {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x->x>1;

        Predicate<String> auth = "ADMIN"::equals;

        Predicate<List<Integer>> listSize = x-> true;

        System.out.println(isPositive.test(-10));
        System.out.println(auth.test("GUEST"));
        System.out.println(auth.test("ADMIN"));
        System.out.println(auth.test("USER"));
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(listSize.test(list));
    }
}
