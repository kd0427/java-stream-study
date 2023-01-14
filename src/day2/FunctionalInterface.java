package day2;

import java.util.Random;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {
        Supplier<String> supplier = () ->{

            String[] menu = {"치킨","족발","보쌈","피자","중식","햄버거"};
            Random random = new Random();

            return menu[random.nextInt(5)];
        };

        System.out.println(supplier.get());
    }
}
