package day1;

import day1.util.Adder;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Section1_Main {
    public static void main(String[] args) {
        Function<Integer, Integer> adder = new Adder();

        System.out.println(adder.apply(10));

        // 람다식으로 구현
        Function<Integer, Integer> adder2 = x->x+10;
        System.out.println(adder2.apply(10));

        BiFunction<Integer,Integer,Integer> addFn = Integer::sum;
        System.out.println(addFn.apply(5,10));
    }
}
