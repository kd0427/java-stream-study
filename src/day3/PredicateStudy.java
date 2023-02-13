package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateStudy {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x->x>1;

        Predicate<String> auth = Admin.ADMIN.value()::equals;

        Predicate<List<Integer>> listSize = x-> true;

        System.out.println(isPositive.test(-10));
        System.out.println(auth.test(Admin.ADMIN.value()));
        System.out.println(auth.test(Admin.USER.value()));
        System.out.println(auth.test(Admin.GUEST.value()));
        System.out.println(auth.test(Admin.KNOWLEDGE_ADMINISTRATOR.value()));
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(listSize.test(list));
    }
}
