package day3;

import java.util.function.Predicate;

public class PredicateStudy {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x->x>1;

        Predicate<String> auth = "ADMIN"::equals;

        System.out.println(isPositive.test(-10));
        System.out.println(auth.test("손님"));
    }
}
