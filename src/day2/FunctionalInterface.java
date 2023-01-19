package day2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {
        Supplier<String> supplier = () ->{

            String[] menu = {"치킨","족발","보쌈","피자","중식","햄버거"};
            Random random = new Random();

            return menu[random.nextInt(5)];
        };

        System.out.println(supplier.get());

        Consumer<String> strPrint = System.out::println;
        strPrint.accept("프린트");

        List<Integer> IntegerInputs = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Consumer<Integer> a = x->{
            System.out.println(x*2); ;
        };
        process(IntegerInputs,a);

        List<Integer> IntegerInputs2 = Arrays.asList(2,4,6,8,10);
        BiConsumer<Integer,Integer> b = (x,y)->{
            System.out.println(x+y);
        };
        process2(IntegerInputs2,b);
    }
    public static void process(List<Integer> inputs, Consumer<Integer> processor){
        for(Integer input : inputs){
            processor.accept(input);
        }
    }
    public static void process2(List<Integer> inputs, BiConsumer<Integer,Integer> processor){
        for(Integer input : inputs){
            processor.accept(input,input);
        }
    }
}
